package taghere.project.helloworld.taghere.AccountFolder;

/**
 * Created by fewfr on 2016-05-22.
 */

//계정과 관련된 클래스
public class Account {
    public static Account instance = null;

    private String id;
    private String password;
    private String name;
    private String phoneNumber;
    private String email;

    public Account() {    }
    public Account(String id, String password) {setId(id); setPassword(password);}

    public void setId(String id) {this.id = id;}
    public void setPassword(String password) {this.password = password;}
    public void setName(String name) {this.name = name;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setEmail(String email) {this.email = email;}

    public String getId() {return id;}
    public String getPassword() {return password;}
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getEmail() {return email;}

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }
}