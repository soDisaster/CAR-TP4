package form;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import DB.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anne-So
 */
@WebServlet(urlPatterns = {"/FormServlet"})
public class FormServlet extends HttpServlet {
    @PersistenceContext
    private EntityManager em;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>");
            out.println("The title of the book is ");
            String title = request.getParameter("title");
            out.println(title);
            out.println("</p>");
            out.println("<p>");
            out.println("It was written by");
            String author = request.getParameter("author");
            out.println(author);
            out.println("and published the ");
            String date = request.getParameter("date");
            out.println(date);
            out.println("</p>");
            out.println("</body>");
            out.println("<a href=\"formulaire.jsp?title=" + title + "&author=" + author + "&date=" + date + "\">");
            out.println("Go to form </a>");
            out.println("</body>");
            out.println("</html>");
            
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/books");
            PreparedStatement stat = con.prepareStatement("insert into book (title, author, date) values ('1','1',1)");
            stat.executeUpdate();
            System.out.println("coucou");
            
            Book b = new Book("Truc", "Aaaaa", 2015);
            em.persist(b);
            
        } catch (SQLException ex) {
            Logger.getLogger(FormServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

}
