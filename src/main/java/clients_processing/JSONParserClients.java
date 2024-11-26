/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JSONParserClients {

    //String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
    
    public static ClientsArr parse(String jsonString) throws IOException{
        //try {
            ObjectMapper objectMapper = new ObjectMapper();
            if(jsonString.equals("")){
                return new ClientsArr();
            }
            ClientsArr clientsArr = objectMapper.readValue(jsonString, ClientsArr.class);
            return clientsArr;
       // }
//        } catch (Exception e) {
//            //System.out.println(e.getMessage());
//            return null;//????? 
//        } 
    }
}
