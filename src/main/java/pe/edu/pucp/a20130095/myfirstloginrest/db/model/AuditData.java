package pe.edu.pucp.a20130095.myfirstloginrest.db.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AuditData {

    @Column(name = "FECHA_CREACION")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "USUARIO_CREACION")
    private String creationUser;

    @Column(name = "FECHA_MODIFICACION")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updateDate;

    @Column(name = "USUARIO_MODIFICACION")
    private String updateUser;

    public AuditData() {
        // Constructor vacío requerido por JPA.
        // Los valores se inicializan por defecto en 0 o null.
    }

    public AuditData(Date creationDate, String creationUser) {
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        // Los otros valores se inicializan por defecto en 0 o null.
    }

    public AuditData(Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public String getCreationUser() {
        return creationUser;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public String getUpdateUser() {
        return updateUser;
    }

    public void auditForCreation(String creationUser) {
        this.creationDate = new Date();
        this.creationUser = creationUser;
    }

    public void auditForUpdate(String updateUser) {
        this.updateDate = new Date();
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return String.format("AuditData[creationDate=%s, creationUser=%s, updateDate=%s, updateUser=%s]",
                creationDate.toString(), creationUser, updateDate.toString(), updateUser);
    }

}
