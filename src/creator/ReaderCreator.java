/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creator;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class ReaderCreator {
    public Reader returnNewReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Добавление нового читателя-------");
        Reader reader = new Reader();
        System.out.println("ID читателя:");
        reader.setId(scanner.nextLong()); scanner.nextLine();
        System.out.println("Имя читателя:");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия читателя:");
        reader.setSurname(scanner.nextLine());
        System.out.println("Телефон читателя:");
        reader.setPhone(scanner.nextLine());
        System.out.println("Место проживания читателя:");
        reader.setCity(scanner.nextLine());
        System.out.println("Создан читатель: "+reader.toString());
        System.out.println("Для добавления введите любой символ\nДля отмены наберите -1");
        String yes = "";
        yes = scanner.next();
        if(!"".equals(yes)){
            System.out.println("----Читатель не добавлен----");
            return null;
        }else{
            System.out.println("----Читатель добавлен----");
            return reader;
        }
    }
}
