
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Esteban
 */
@ManagedBean
@ApplicationScoped
public class ClienteBeans {

    private String nombre;
    private String mail;
    private int application=0;
    
    
    /**
     * Creates a new instance of ClienteBeans
     */
    public ClienteBeans() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the application
     */
    public int getApplication() {
        return this.application=this.application+1;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(int application) {
        this.application = application;
    }
    
}