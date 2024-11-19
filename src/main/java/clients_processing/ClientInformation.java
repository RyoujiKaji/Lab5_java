package clients_processing;

import java.util.Date;

/**
 *
 * @author Nadezhda_N
 */
class ClientInformation {

    private String name;
    private String date;
    private String login;
    private String password;

    public ClientInformation(String name, String date, String login, String password) {
        this.name = name;
        this.date = date;
        this.login = login;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
