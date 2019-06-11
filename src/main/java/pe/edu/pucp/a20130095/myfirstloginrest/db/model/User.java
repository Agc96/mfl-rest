package pe.edu.pucp.a20130095.myfirstloginrest.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mfl_user")
public class User {
    @Id
    private Integer id;
    private String fullname;
    private String email;
    private String username;
    private String hash;

    protected User () {
        // Constructor vacío requerido por JPA
    }

    public User(int id, String fullname, String email, String username, String hash) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.username = username;
        this.hash = hash;
    }

    public Integer getId() {
        return id;
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

    @Override
    public String toString() {
        return String.format("User[id=%d, username=%s]", id, username);
    }
}
