/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsons;

import com.fasterxml.jackson.databind.ObjectMapper;
import clients_processing.*;

public class JSONParser {

    String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
    
    public Person parse(String jsonStr) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(jsonString, Person.class);
            return person;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;//????? 
        } 
    }
}
