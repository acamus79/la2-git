
package beans;

import javax.ejb.Remote;
import models.Cocina;

@Remote
public interface IElementos {

    public void agregarCocina(Cocina c);

    public String devuelveCadenaCocina();
}
