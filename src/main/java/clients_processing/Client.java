/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

//import java.util.Date;

/**
 *
 * @author Nadezhda_N
 */
public class Client {

    private String email;
    private ClientInformation clientInformation;

    public Client (){
        this.email="";
        this.clientInformation=new ClientInformation();
    }
    
    public Client(String email, String name, String date, String login, String password) {
        this.clientInformation=new ClientInformation(name, date, login, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public ClientInformation getClientInformation() {
        return clientInformation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClientInformation(ClientInformation clientInformation) {
        this.clientInformation = clientInformation;
    }
}
