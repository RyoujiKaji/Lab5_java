/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients_processing;

import java.util.ArrayList;

/**
 *
 * @author Nadezhda_N
 */
public class ClientsArr {
    private ArrayList<Client> list=new ArrayList<>();

    public ArrayList<Client> getList() {
        return list;
    }

    public void setList(ArrayList<Client> list) {
        this.list = list;
    }
    
    public void add(Client client){
        list.add(client);
    }
}
