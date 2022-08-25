
package beans;

import java.util.ArrayList;
import javax.ejb.Stateful;
import models.Cocina;


@Stateful
public class Elementos implements IElementos{

    ArrayList<Cocina> lista=new ArrayList<>();
    
    @Override
    public void agregarCocina(Cocina c) {
       
        lista.add(c);
        
    }

    @Override
    public String devuelveCadenaCocina() {
    
        return lista.get(0).getDescripcion();
    }
   
}
    