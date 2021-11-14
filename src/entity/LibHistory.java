/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Vladimir
 */
public class LibHistory {
    private Long id;
    private Book book;
    private Reader reader;
    private Date bookIssued;
    private Date bookReturn;
    
    public LibHistory() {
    }    
    
    public LibHistory(Long id, Book book, Reader reader, Date bookIssued, Date bookReturn) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.bookIssued = bookIssued;
        this.bookReturn = bookReturn;
    }

    public Long getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getBookIssued() {
        return bookIssued;
    }

    public Date getBookReturn() {
        return bookReturn;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.book);
        hash = 61 * hash + Objects.hashCode(this.reader);
        hash = 61 * hash + Objects.hashCode(this.bookIssued);
        hash = 61 * hash + Objects.hashCode(this.bookReturn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LibHistory other = (LibHistory) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.bookIssued, other.bookIssued)) {
            return false;
        }
        if (!Objects.equals(this.bookReturn, other.bookReturn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibHistory{" + "id=" + id + ", book=" + book + ", reader=" + reader + ", bookIssued=" + bookIssued + ", bookReturn=" + bookReturn + '}';
    }
}

   

    

    

