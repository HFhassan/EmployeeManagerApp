package hassan.farooqui.employeemanager.rms.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Login implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

   private String userName ;
   private String password;


   public Login(){}
    public Login(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString ()
    {
        return "Login{" +
                "id =" + id+
                ",userName = '" + userName+'\''+
                ",password = '" + password+ '\''+
                '}';
    }
}
