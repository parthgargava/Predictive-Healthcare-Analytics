/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.neuralnetworks;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.core.events.LearningEvent;
import org.neuroph.core.events.LearningEventListener;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.nnet.learning.MomentumBackpropagation;
import org.neuroph.util.data.norm.MaxNormalizer;
import org.neuroph.util.data.norm.Normalizer;


public class lungCancer implements LearningEventListener {

    //Important for evaluating network result
    public int[] count = new int[3];
    public int[] correct = new int[3];
    int unpredicted = 0;

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//        (new BrestCancerSample()).run();
//    }

    public String run() {

        System.out.println("Creating training and test set from file...");
        String trainingSetFileName = "C:\\Users\\parth\\OneDrive\\Documents\\PHANTOM\\Final_Project\\dataForPrediction\\sampleNN.txt";
        
        String testSetFileName="C:\\Users\\parth\\OneDrive\\Documents\\PHANTOM\\Final_Project\\dataForPrediction\\testNN.txt";
        
        int inputsCount = 30; //changed from 30
        int outputsCount = 2;

        //Create data set from file
        DataSet dataSet = DataSet.createFromFile(trainingSetFileName, inputsCount, outputsCount, ",",false);
        dataSet.shuffle();
///
        DataSet datasetTest= DataSet.createFromFile(testSetFileName, inputsCount, outputsCount, ",");
   //////     
        //Normalizing data set
        Normalizer normalizer = new MaxNormalizer();
        normalizer.normalize(dataSet);

        //Creatinig training set (70%) and test set (30%)
//////////
        //DataSet[] trainingAndTestSet = dataSet.createTrainingAndTestSubsets(70, 30);
        //DataSet trainingSet = trainingAndTestSet[0];
        //DataSet testSet = trainingAndTestSet[1];

        
        
        System.out.println("Creating neural network...");
        //Create MultiLayerPerceptron neural network
        MultiLayerPerceptron neuralNet = new MultiLayerPerceptron(inputsCount, 16, outputsCount);
//        MultiLayerPerceptron neuralNet3 = new MultiLayerPerceptron(16);

        //attach listener to learning rule
        MomentumBackpropagation learningRule = (MomentumBackpropagation) neuralNet.getLearningRule();
        learningRule.addListener(this);

        learningRule.setLearningRate(0.6);
        learningRule.setMaxError(0.003);// 0.003
        learningRule.setMaxIterations(5000);

        System.out.println("Training network...");
        //train the network with training set
        neuralNet.learn(dataSet);

        System.out.println("Testing network...\n\n");
       String output= testNeuralNetwork(neuralNet, datasetTest);

        System.out.println("Done.");

        System.out.println("**************************************************");
return output;
    }

    public String testNeuralNetwork(NeuralNetwork neuralNet, DataSet testSet) {
String localOutput="";
        System.out.println("**************************************************");
        System.out.println("**********************RESULT**********************");
        System.out.println("**************************************************");
        int i=0;
        for (DataSetRow testSetRow : testSet.getRows()) {
            neuralNet.setInput(testSetRow.getInput());
            neuralNet.calculate();
i++;
            //Finding network output
            double[] networkOutput = neuralNet.getOutput();
            int predicted = maxOutput(networkOutput);
            

 localOutput= localOutput+"\nPredicted output for user "+i+" is ";
if(predicted==0)
    localOutput=localOutput+"harmless lung cancer stage\n";
else 
         localOutput=localOutput+"malignant lung cancer stage\n";

//Finding actual output
            double[] networkDesiredOutput = testSetRow.getDesiredOutput();
            int ideal = maxOutput(networkDesiredOutput);

            //Colecting data for network evaluation
            keepScore(predicted, ideal);
          
        }
////
        System.out.println("Total cases: " + this.count[2] + ". ");
        System.out.println("Correctly predicted cases: " + this.correct[2] + ". ");
        System.out.println("Incorrectly predicted cases: " + (this.count[2] - this.correct[2] - unpredicted) + ". ");
        System.out.println("Unrecognized cases: " + unpredicted + ". ");
        double percentTotal = (double) this.correct[2] * 100 / (double) this.count[2];
        System.out.println("Predicted correctly: " + formatDecimalNumber(percentTotal) + "%. ");

        double percentM = (double) this.correct[0] * 100.0 / (double) this.count[0];
        System.out.println("Prediction for 'M (malignant)' => (Correct/total): "
                + this.correct[0] + "/" + count[0] + "(" + formatDecimalNumber(percentM) + "%). ");

        double percentB = (double) this.correct[1] * 100.0 / (double) this.count[1];
        System.out.println("Prediction for 'B (benign)' => (Correct/total): "
                + this.correct[1] + "/" + count[1] + "(" + formatDecimalNumber(percentB) + "%). ");
    
        return localOutput;
 
    }

    @Override
    public void handleLearningEvent(LearningEvent event) {
        BackPropagation bp = (BackPropagation) event.getSource();
        if (event.getEventType().equals(LearningEvent.Type.LEARNING_STOPPED)) {
            double error = bp.getTotalNetworkError();
            System.out.println("Training completed in " + bp.getCurrentIteration() + " iterations, ");
            System.out.println("With total error: " + formatDecimalNumber(error));
        } else {
            System.out.println("Iteration: " + bp.getCurrentIteration() + " | Network error: " + bp.getTotalNetworkError());
        }
    }

    //Metod determines the maximum output. Maximum output is network prediction for one row. 
    public static int maxOutput(double[] array) {
        double max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        //If maximum is less than 0.5, that prediction will not count. 
        if (max < 0.5) {
            return -1;
        }
        return index;
    }

    //Colecting data to evaluate network. 
    public void keepScore(int prediction, int ideal) {
        count[ideal]++;
        count[2]++;

        if (prediction == ideal) {
            correct[ideal]++;
            correct[2]++;
        }
        if (prediction == -1) {
            unpredicted++;
        }
    }

    //Formating decimal number to have 3 decimal places
    public String formatDecimalNumber(double number) {
        return new BigDecimal(number).setScale(4, RoundingMode.HALF_UP).toString();
    }
}