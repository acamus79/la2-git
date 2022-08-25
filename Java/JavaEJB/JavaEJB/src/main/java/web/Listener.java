package web;

import beans.Elementos;
import beans.IElementos;
import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 */
public class Listener implements ServletContextListener {

    @EJB(lookup = "jndi_elementos")
    private IElementos ele = new Elementos();

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        sce.getServletContext().setAttribute("ele", ele);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
