public class App {
    public static void main(String[] args) {

        Action[] actions = new Action[]
                {
                        new Human("Карл Джонсон", 5000, 120),
                        new Cat("Большой Шлёпа", 400, 140),
                        new Robot("Попрыгун", 10000, 0)
                };

        Obstacle[] obstacles = new Obstacle[]
                {
                        Wall.highWall,
                        Wall.highWall,
                        Treadmill.longTreadmill,
                        Treadmill.longTreadmill,
                        Wall.smallWall,
                        Treadmill.longTreadmill,
                        Wall.mediumWall,
                        Wall.highWall
                };

        for (int i = 0; i < actions.length; i = i + 1)
            for (int j = 0; j < obstacles.length; j = j + 1) {
                if (!obstacles[j].obstacle(actions[i])) break;
            }
    }
}
