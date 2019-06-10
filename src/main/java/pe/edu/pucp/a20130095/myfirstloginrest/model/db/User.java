package pe.edu.pucp.a20130095.myfirstloginrest.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mfl_user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    private String fullname;
    private String email;
    private String username;
    private String hash;

    public User(int userId, String fullname, String email, String username, String hash) {
        this.userId = userId;
        this.fullname = fullname;
        this.email = email;
        this.username = username;
        this.hash = hash;
    }

    public int getUserId() {
        return userId;
    }
    public String getFullName() {
        return fullname;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    public String getHash() {
        return hash;
    }
}
