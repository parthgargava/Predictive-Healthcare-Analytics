/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.validation;


/**
 *
 * @author Parth, Praneeth nikhil
 */
public class Validation {
     public  boolean alphabetCheck(String checkString){
         if(checkString != null && checkString.matches("[a-zA-Z\\s]+")){
             return true;
         }
         return false;
     }
     
     public  boolean alphaNumericCheck(String checkString){
         if(checkString != null && checkString.matches("[a-zA-Z0-9\\s]+")){
             return true;
         }
         return false;
     }
     
     public  boolean numberWithSizeCheck(String checkString, int size){
         String reqEx = "[0-9]{"+ size +"}";
         if(checkString != null && checkString.matches(reqEx)){
             return true;
         }
         return false;
     }

          public  boolean numberCheck(String checkString){
         String reqEx = "\\d*";
         if(checkString != null && checkString.matches(reqEx)){
             return true;
         }
         return false;
     }

     
     public boolean isEmpty(String string)
     {
     if(string!="")
         return true;
     else return false;
     }
     
         public boolean numberIt(String string) //throws IllegalArgumentException
    {
        boolean isnumeric = true;
        char chars[] = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            isnumeric = Character.isDigit(chars[i]);
            if (isnumeric==false) {
                break;
            }

        }

return false;     
         }
}
