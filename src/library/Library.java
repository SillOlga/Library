/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author Vladimir
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book(1L, "Voina i Mir", "123-123123", "Lev Tolstoy", 2010);
        Reader reader1 = new Reader(1L, "Ivan", "Ivanov", "56734556", "Tallinn");
        
        Calendar c = new GregorianCalendar();
        
        LibHistory libHistory1 = new LibHistory(1L, book1, reader1, c.getTime(), null);
        
        System.out.println(book1.toString());
        System.out.println(reader1.toString());
        System.out.println(libHistory1.toString());
    }
    
 }   
    
    
    
        
   
    