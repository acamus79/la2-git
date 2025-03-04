package controller;


import beans.IElementos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Cocina;

/**
 *
 * @author Esteban
 */
public class ServletProcesar extends HttpServlet {

    @EJB(lookup = "jndi_elementos")
    private IElementos ele;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int codigo = Integer.parseInt(request.getParameter("caja1"));
        String descripcion = request.getParameter("caja2");

        Cocina c = new Cocina(codigo, descripcion);

        ele = (IElementos) getServletContext().getAttribute("ele");
        ele.agregarCocina(c);
        
        
        getServletContext().setAttribute("ele", ele);
        // InitialContext ic;
        // IElementos       saludoEJB=null;
        /*   try {
             ic = new InitialContext();
            saludoEJB = (IElementos) ic.lookup("jndi_elementos"); 
        
        saludoEJB.agregarCocina(c);
         
         } catch (NamingException ex) {
             Logger.getLogger(ServletProcesar.class.getName()).log(Level.SEVERE, null, ex);
         }
         */

        try ( PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + ele.devuelveCadenaCocina() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        }

        response.sendRedirect("index.html");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
