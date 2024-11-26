/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileEditor;

//import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Nadezhda_N
 */
//обработать отсутствие файла
public class MyFileReader {

    public static String readJSON(String way) throws IOException{
        //String unprettyJSON;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(way))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonBuilder.append(line);
            }
            return jsonBuilder.toString();
        }
    }
}

