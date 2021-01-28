package homework.java2.lesson1;

public class Robot implements Run, Jump {
    private int speed;
    private  int jump;

    public Robot(int speed, int jump) {
        this.speed = speed;
        this.jump = jump;
    }
    public void run(Treadmill treadmill) {
        System.out.println("speed Robot: " + speed);
        if (treadmill.getHeight() < speed) { System.out.println("Робот пробежал");}
        else {
            System.out.println("Робот не пробежал");
        }

    }

    @Override
    public void jump(Wall wall) {
        System.out.println("jump Robot: " + jump);
        if (wall.getHeight() < jump) { System.out.println("Робот перепрыгнул");}
        else {
            System.out.println("Робот не перепрыгнул");
        }
    }
}