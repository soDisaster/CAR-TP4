package form;


import DB.Book;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Stateless
@WebServlet(urlPatterns = {"/MyBean"})
public class MyBean extends HttpServlet {
@PersistenceContext
private EntityManager em;

     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    

    try {
        DriverManager.getConnection("jdbc:derby://localhost:1527/books/APP/Tables/", "", "");
    } catch (SQLException ex) {
        Logger.getLogger(MyBean.class.getName()).log(Level.SEVERE, null, ex);
    }
        Book b1 = new Book("Truc", "Honore de Balzac", 1835);
        em.persist(b1);
    
    } 
} 