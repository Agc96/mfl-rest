package pe.edu.pucp.a20130095.myfirstloginrest.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MFL_APLICACION")
public class Application {
    @Id
    @Column(name = "ID_APLICACION")
    private Integer id;

    @Column(name = "NOMBRE")
    private String name;

    public Application() {
        // Constructor vacío requerido por JPA
    }

    public Application(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Application[id=%d, name=%s]", id, name);
    }
}
