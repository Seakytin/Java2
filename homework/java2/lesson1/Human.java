package homework.java2.lesson1;

public class Human implements Run, Jump {
    private int speed;
    private  int jump;

    public Human(int speed, int jump) {
        this.speed = speed;
        this.jump = jump;
    }

    public void run (Treadmill treadmill) {
       System.out.println("speed human: " + speed);
        if (treadmill.getHeight() < speed) { System.out.println("Человек пробежал");}
        else {
            System.out.println("Человек не пробежал");
        }

    }

    @Override
    public void jump(Wall wall) {
        System.out.println("jump human: " + jump);
        if (wall.getHeight() < jump) { System.out.println("Человек перепрыгнул");}
        else {
            System.out.println("Человек не перепрыгнул");
        }
    }
}