package com.politecnicomalaga.NasdaqOilPrices;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase respuesta. Encapsulará los datos que nos devuelve la API REST
 * opendata de Nasdaq.
 *
 * El controlador le dará el texto a "analizar" en JSON y proporcionará
 * una serialización de los datos "amigable" para la vista. Es en
 * realidad un procesador de textos (parser)
 */

public class Respuesta {
    //ESTADO
    protected String datos;


    //COMPORTAMIENTO
    public Respuesta(String entrada) {
        datos = entrada;
    }


    public List<Price> getData() {

        LinkedList<Price> dataList = new LinkedList<>();
        //Parsing the JSON

        //TODO: parse JSON and add data to the list.
        JsonElement jsonElement = JsonParser.parseString(this.datos);

        JsonObject jso = jsonElement.getAsJsonObject().get("dataset").getAsJsonObject();
        JsonArray jsonLista = jso.get("data").getAsJsonArray();

        for(int i = 0;i<jsonLista.size();i++) {
            dataList.add(new Price(jsonLista.get(i).getAsJsonArray().get(0).getAsJsonPrimitive().getAsString(),jsonLista.get(i).getAsJsonArray().get(1).getAsJsonPrimitive().getAsString()));
        }

        return dataList;
    }
}
