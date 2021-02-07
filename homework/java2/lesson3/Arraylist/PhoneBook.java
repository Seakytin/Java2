package homework.java2.lesson3.Arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private  HashMap<String, ArrayList<String>> hashMap = new HashMap();

    public void add(Contact contact) {
        if (!hashMap.containsKey(contact.getName())){
            ArrayList<String> telList = new ArrayList<>();
            telList.add(contact.getTel());
            hashMap.put(contact.getName(), telList);
        } else {
            ArrayList<String> str = hashMap.get(contact.getName());
            for (String s : str) {
                if (s.equals(contact.getTel())) {
                    System.out.println("такой номер есть");
                    return;
                }
            }
            str.add(contact.getTel());
            hashMap.put(contact.getName(), str);
        }
    }

    public void getByName(String name) {
        System.out.println(name + ",  " + hashMap.get(name));
    }

}
