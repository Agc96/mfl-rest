package pe.edu.pucp.a20190000.myfirstloginrest.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MFL_USER")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "HASH")
    private String hash;

    public User(int userId, String fullName, String email, String username, String hash) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.hash = hash;
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
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
