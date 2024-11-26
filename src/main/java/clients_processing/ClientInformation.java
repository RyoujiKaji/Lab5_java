package clients_processing;

//import java.util.Date;

/**
 *
 * @author Nadezhda_N
 */
class ClientInformation {

    private String name;
    private String date;
    private String password;

    public ClientInformation(){
        this.name="";
        this.date="";
        this.password="";
    }
    
    public ClientInformation(String name, String date, String password) {
        this.name = name;
        this.date = date;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPassword() {
        return password;
    }
}
