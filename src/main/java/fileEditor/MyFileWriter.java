/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileEditor;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.nio.file.Files;
//import clients_processing.ClientsArr;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Nadezhda_N
 */
public class MyFileWriter {

    public void writeJSON(String way, String str) throws IOException{
      
        //String filePath = "output.json";
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(way))) {
            writer.write(str);
            //System.out.println("JSON записан в файл: " + );
       }
//        } catch (IOException e) {
//            //System.err.println("Ошибка при записи в файл: " + e.getMessage());
//        }
    }
    
  
}


