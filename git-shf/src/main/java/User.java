/**
 * @author 11
 */
public class User {

    private String username;
    private String password;
    private String gender;
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sayHello(){
        System.out.println("Hello!!!");
    }
}
