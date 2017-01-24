/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.datageneration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.lang.Exception;
import com.google.gson.Gson;

/**
 *
 * @author prane
 */
public class FetchCityIndicatorsLive {

    private String BaseUrl;
    private String ResponderUrl;
    private String responderParameters;
    public float val;

    public FetchCityIndicatorsLive(String city) {
        this.BaseUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "?&APPID=4f5604b4a8e2dd636c434483d05f2069";

    }

    public String generateData() {
        try {
            HttpURLConnection httpcon = (HttpURLConnection) ((new URL(BaseUrl).openConnection()));
            httpcon.setDoOutput(true);
            httpcon.connect();
            BufferedReader inreader = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            Gson gson = new Gson();
            while ((line = inreader.readLine()) != null) {
                sb.append(line);
            }
            StringBuilder sb2 = new StringBuilder();
            
            float temp =0;
            float pressure = 0;
            float humidity = 0;
            float windspeed =0;
            if (sb.toString() != "") {
                CityIndicators md = gson.fromJson(sb.toString(), CityIndicators.class);
                 sb2.append("<html>");
                sb2.append(md.getName());
                sb2.append("<br>");
                sb2.append("Temperature");
                sb2.append("-");
                sb2.append(md.getMain().getTemp());
                temp = Float.parseFloat(md.getMain().getTemp());
                sb2.append("<br>");
                sb2.append("Pressure");
                sb2.append("-");
                sb2.append(md.getMain().getPressure());
                pressure = Float.parseFloat(md.getMain().getPressure());
                sb2.append("<br>");
                sb2.append("Pressure");
                sb2.append("-");
                sb2.append(md.getMain().getHumidity());
                humidity = Float.parseFloat(md.getMain().getHumidity());
                sb2.append("<br>");
                sb2.append("Wind Speed");
                sb2.append("-");
                sb2.append(md.getWind().getSpeed());
                windspeed = Float.parseFloat(md.getWind().getSpeed());
                sb2.append("<br>");
                sb2.append("</html>");
            }
            
            sb2.append(Float.valueOf(generateRiskScore(temp,pressure,humidity,windspeed)));
            val = generateRiskScore(temp/10,pressure,humidity,windspeed);
            
            return sb2.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }

    }
    
    public float generateRiskScore(float temp,float pressure,float humidity,float windspeed)
    {
        float val = (float) (temp*0.01 + pressure*0.01 + humidity*0.01 + windspeed*0.1);
        if(val>50)
            val = 50;
        if(val<1)
            val = 1;
        return val;
    }

}
