package homework.java2.lesson3;

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
    }
}

