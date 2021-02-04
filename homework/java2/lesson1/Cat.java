package homework.java2.lesson1;

public class Cat implements Run, Jump {
    private int speed;
    private int jump;

    public Cat(int speed, int jump) {
        this.speed = speed;
        this.jump = jump;
    }

    public void run(Treadmill treadmill) {
        System.out.println("speed Cat: " + speed);
        if (treadmill.getHeight() < speed) {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }

    }

    @Override
    public void jump(Wall wall) {
        System.out.println("jump Cat: " + jump);
        if (wall.getHeight() < jump) {
            System.out.println("Кот перепрыгнул");
        } else {
            System.out.println("Кот не перепрыгнул");
        }
    }
}