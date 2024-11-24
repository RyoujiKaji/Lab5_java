/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParserClients {

    //String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
    
    public ClientsArr parse(String jsonString) throws Exception{
        //try {
            ObjectMapper objectMapper = new ObjectMapper();
            ClientsArr clientsArr = objectMapper.readValue(jsonString, ClientsArr.class);
            return clientsArr;
       // }
//        } catch (Exception e) {
//            //System.out.println(e.getMessage());
//            return null;//????? 
//        } 
    }
}
