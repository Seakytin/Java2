package homework.java2.lesson3.Arraylist;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        String[] name = {"Вася", "Петя", "Женя", "Женя", "Саша", "Петя", "Петя", "Коля", "Вася", "Коля", "Женя", "Саша", "Вася", "Петя", "Коля"};
        HashMap<String, Integer> hm = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        for (String i : name) {
            hashSet.add(i);
        }
        for (String i : name) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hashSet);
        System.out.println(hm);


        PhoneBook phoneBook = new PhoneBook();

        Contact c1 = new Contact("Joshua Bloch", "1234");
        Contact c2 = new Contact("Cay Horstmann", "1235");
        Contact c3 = new Contact("Herbert Schildt", "1236");
        Contact c4 = new Contact("Joshua Bloch", "1237");
        Contact c5 = new Contact("Joshua Bloch", "1237");
        Contact c6 = new Contact("Cay Horstmann", "1237");

        phoneBook.add(c1);
        phoneBook.add(c2);
        phoneBook.add(c3);
        phoneBook.add(c4);
        phoneBook.add(c5);
        phoneBook.add(c6);

        phoneBook.getByName("Joshua Bloch");
        phoneBook.getByName("Cay Horstmann");

       // System.out.println(" У Иванова номера: " + phoneBook.get("Иванов"));
    }
}

