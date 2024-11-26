/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

import fileEditor.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import clients_processing.Client;

/**
 *
 * @author Nadezhda_N
 */
public class Processing {

    private ClientsArr clientsArr;
    private final static String FILE_PATH = "C:\\Nadezhda\\Study\\Labs\\Java"
            + "\\Lb5_java\\target\\Lb5_java-1.0-SNAPSHOT\\clients.json";

    private boolean checkAvailability(Client client) throws IOException {
        clientsArr = JSONParserClients.parse(MyFileReader.readJSON(FILE_PATH));
        
       // boolean flag=false;
        ArrayList<Client> list = clientsArr.getList();
        //Iterator iterator = list.iterator();
        
        for (Client cur:list){
            if(cur.getEmail().equals(client.getEmail())){
                return true;
            }
        }
        return false;
    }
    
    public boolean process(Client client) throws IOException{
        if(checkAvailability(client)){
            return false;
            //return "ѕользователь с такой почтой уже зарегистрирован";
        }else{
            
            clientsArr.add(client);
            MyFileWriter.writeJSON(FILE_PATH, JSONWriterClients.write(clientsArr));
            return true;
            //return "–егистраци€ прошла успешно";
        }
    }
}
