package br.com.ConverterAlura.ConverterCoins;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import br.com.ConverterAlura.ConverterCoins.Coins;
import com.google.gson.JsonObject;

import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.JsonParser;


public class ConverterCoinsAPI {
    private static final String API_URL = "https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,EUR-USD,GBP-BRL,ARS-BRL,CLP-BRL";

    public static Coins getConverter() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
            String responseBody = response.body();

            JsonObject json = JsonParser.parseString(responseBody).getAsJsonObject();

            JsonObject usdBid = json.getAsJsonObject("USDBRL");
            double usd = usdBid.get("bid").getAsDouble();

            JsonObject eurBid = json.getAsJsonObject("EURUSD");
            double eur = eurBid.get("bid").getAsDouble();

            JsonObject brlBid = json.getAsJsonObject("EURBRL");
            double brl = brlBid.get("bid").getAsDouble();

            JsonObject gbpBid = json.getAsJsonObject("GBPBRL");
            double gbp = gbpBid.get("bid").getAsDouble();

            JsonObject arsBid = json.getAsJsonObject("ARSBRL");
            double ars = arsBid.get("bid").getAsDouble();

            JsonObject clpBid = json.getAsJsonObject("CLPBRL");
            double clp = clpBid.get("bid").getAsDouble();

            return new Coins(usd, eur, brl, gbp, ars,clp);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
