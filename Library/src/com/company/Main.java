package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(in);
        ArrayList<Book> bookArrayList = new ArrayList<>();
        ArrayList<User> userArrayList = new ArrayList<>();
        ArrayList<Book2> book2ArrayList = new ArrayList<>();
        System.out.println(" WELCOME ");
    while (true){
        System.out.println("   tanlang : ");
        System.out.println("[1] admin panel ");
        System.out.println("[2] user panel ");
        int a = scanner.nextInt();
        switch (a){
            case 1-> {
                while (true) {

                    System.out.println();
                    System.out.println("[1] kitob qoshish ");
                    System.out.println("[2] kitoblar ruyxatini kurish ");
                    System.out.println("[3] kitobni sovga qilish ");
                    System.out.println("[4] exit");
                    int b = scanner.nextInt();
                    if (b == 1) {
                        System.out.println("kitobni nomini kiriting: ");
                        String name = scanner.next();
                        System.out.println("kitobni muallifini kiriting: ");
                        String muallif = scanner.next();
                        bookArrayList.add(new Book(name, muallif));

                    } else if (b == 2) {
                        if (bookArrayList.isEmpty()){
                            System.out.println("kitoblar yo'q");
                        }
                        else {
                        bookArrayList.forEach(book -> {
                            System.out.println("nomi: " + book.getName());
                            System.out.println("muallifi: " + book.getMuallif());
                        });}

                    } else if (b == 3) {
                        System.out.println("kitobni tanlash:");
                        bookArrayList.forEach(book -> {
                            System.out.println("nomi: " + book.getName());
                            System.out.println("muallifi: " + book.getMuallif());
                        });
                        String bookname = scanner.next();
                        bookArrayList.removeIf(book1 -> bookname.equals(book1.getName()));
                        System.out.println("kitob sovg'a qilindi ");

                    }
                    if (b==4){
                        break;
                    }


                }

            }
            case 2->{
                System.out.println(" User panel ");
                System.out.println();
                System.out.println("[1] kitob olish ");
                System.out.println("[2] kitob tobshirish ");
                int c =scanner.nextInt();
                if (c==1){
                    bookArrayList.forEach(book -> {
                        System.out.println("nomi: "+book.getName());
                        System.out.println("muallifi: "+book.getMuallif());

                    });
                    String bookname = scanner.next();

book2ArrayList.add(new Book2(bookname));

                    bookArrayList.removeIf(book1 -> bookname.contains(book1.getName()));
                    System.out.println("kitob olindi ");
                }
                else if (c==2) {
                    System.out.println("topshirish uchun kitobni tanlang: ");
                    book2ArrayList.forEach(book -> {
                        System.out.println("nomi: " + book.getName());
                        

                    });
                    String bookname = scanner.next();
                    bookArrayList.removeIf(book1 -> bookname.contains(book1.getName()));
                    System.out.println("topshirildi");
                }
            }
        }



    }
    }
}
