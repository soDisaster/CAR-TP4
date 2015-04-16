/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Anne-So
 */
@Entity
public class Author implements Serializable {

    @Id
    private long id; 
    private String name; 
    @OneToMany
    private Collection<Book> books; 
    
    public Author() {
        this.books = new ArrayList<Book>();
    }     
    
    public Author(String name, ArrayList<Book> books ) {
        this.name = name;
        this.books = books;
    } 
   
    public Collection<Book> getBooks() {
        return this.books;
    } 
    
    public void setBooks( Collection<Book> books ) { 
        this.books = books;
    }
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

    
