/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import creator.BookCreator;
import returner.BookReturner;
import returner.HistoryReturner;
import entity.LibHistory;
import creator.LibHistoryCreator;
import entity.Reader;
import creator.ReaderCreator;
import interfaces.Manageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import view.ConsoleInterface;

/**
 *
 * @author Vladimir
 */
public class App {
   private List<Book> books = new ArrayList<>();
   private List<Reader> readers = new ArrayList<>();
   private List<LibHistory> libHistories = new ArrayList<>();
   private Manageable manager = new ConsoleInterface();
   public void run(){
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do{
            System.out.println("Выберите действие:");
            System.out.println("0 - выход из программы");
            System.out.println("1 - добавить книгу в библиотеку");
            System.out.println("2 - добавить нового читателя");
            System.out.println("3 - выдать книгу читателю");
            System.out.println("4 - возврат книги");
            System.out.println("5 - история работы библиотеки");
            
            task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat="q";
                    break;
                case 1:
                    books.add(manager.createBook());
                    break;
                case 2:
                    readers.add(manager.createReader());
                    break;
                case 3:
                    LibHistory libHistory = manager.issueBook(books, readers);
                    if (libHistory.getBook() != null) {
                    libHistories.add(libHistory);
                    }
                    break;
                case 4:
                    if(manager.returnBook(libHistories)){
                        System.out.println("Книга возвращена");
                    }else{
                        System.out.println("Книгу вернуть не удалось");    
                    }
                    break;
                case 5:
                    manager.returnHistory(libHistories);
                    break;
                default:
                    System.out.println("Выберите одно из действий");
            }
        }while("r".equals(repeat));
            
   }
}

   
   