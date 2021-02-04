package homework.java2.lesson3;
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String tel, String name) {
        ArrayList<String> telList = phoneBook.get(name);
        if (phoneBook.containsKey(name)){
            telList.add(tel);
        } else {
            telList = new ArrayList<>();
            telList.add(tel);
            phoneBook.put(name, telList);
        }
    }
    public void info() {
        System.out.println(phoneBook);
    }
}
