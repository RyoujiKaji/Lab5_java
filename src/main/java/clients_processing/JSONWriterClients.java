/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Nadezhda_N
 */
public class JSONWriterClients {
//     Person person = new Person();
// person.setName("John");
// person.setAge(30);
// person.setCity("New York");

    public String write(ClientsArr clients) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(clients);
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            return objectMapper.writeValueAsString(clients);
//
//            //ystem.out.println(jsonString);
//        } catch (Exception e) {
//            //e.printStackTrace();
//            return null;
//        }
    }
}
