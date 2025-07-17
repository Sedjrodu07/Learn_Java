package org.example;
 
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
class convertor
{
    private static final String API_KEY = "c0c21efbfaaa68cd2c538e6e"; // Enter your API key here.
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";
    public static void main(String[] args)
    {
        // Currency and amount to convert
        String fromCurrency = "USD";
        String toCurrency = "TRY";
        double amount = 125;
 
        // Construct API URL
        String apiUrl = constructApiUrl(fromCurrency, toCurrency, amount);
 
        // Create HttpURLConnection object
        HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");
 
        // Read API response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = reader.readLine();
 
        // Parse JSON response
        JSONObject jsonResponse = new JSONObject(response);
        double result = jsonResponse.getDouble("result");
 
        // Print the result
        System.out.println(amount + " " + fromCurrency + " = " + result + " " + toCurrency);
    }
    private static String constructApiUrl(String fromCurrency, String toCurrency, double amount)
    {
        return BASE_URL + "?access_key=" + API_KEY + "&from=" + fromCurrency + "&to=" + toCurrency + "&amount=" + amount;
    }
}