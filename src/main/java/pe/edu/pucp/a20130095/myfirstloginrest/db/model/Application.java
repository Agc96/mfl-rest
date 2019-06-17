package pe.edu.pucp.a20130095.myfirstloginrest.db.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
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

    @Embedded
    private AuditData auditData;

    public Application() {
        // Constructor vacío requerido por JPA.
        // Los valores se inicializan por defecto en 0 o null.
    }

    public Application(int id, String name, AuditData auditData) {
        this.id = id;
        this.name = name;
        this.auditData = auditData;
    }

    public Integer getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public AuditData getAuditData() {
        return this.auditData;
    }

    @Override
    public String toString() {
        return String.format("Application[id=%d, name=%s]", id, name);
    }
}
