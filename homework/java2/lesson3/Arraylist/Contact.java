package homework.java2.lesson3.Arraylist;

public class Contact {
    public String name;
    public String tel;

    public Contact(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
