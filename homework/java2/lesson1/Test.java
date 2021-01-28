package homework.java2.lesson1;

public class Test {
    public static void main(String[] args) {
        Human c1 = new Human(12, 16);
        Wall wall = new Wall(14);
        Treadmill treadmill = new Treadmill(20);
      //  c1.run(treadmill);
      //  c1.jump(wall);
        Cat c2 = new Cat(18, 36);
      //  c2.run(treadmill);
      //  c2.jump(wall);
        Robot c3 = new Robot(9,5);
       //c3.run(treadmill);
       //c3.jump(wall);
        Jump[] jumpParticipants = {c1, c2, c3};
        Run[] runParticipants = {c1, c2, c3};

        Object[] obstacles = {wall, treadmill};

        for (int i = 0; i < jumpParticipants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
               if (obstacles[j] instanceof Wall) {
                   jumpParticipants[i].jump((Wall) obstacles[j]);
                }
            }
        }
        for (int i = 0; i < runParticipants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    runParticipants[i].run(treadmill);
                }
            }
        }
        //Object[] participants = {c1, c2, c3};
        //Object[] obstacles = {wall, treadmill};
        //for (int i = 0; i < participants.length; i++) {

        }
    }

