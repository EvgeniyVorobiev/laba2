
    public enum Wall implements Obstacle
    {

        smallWall(10), mediumWall(50), highWall(1000);
        public int high;
        Wall(int high)
        {
            this.high = high;
        }
        public boolean obstacle(Action act)
        {

            return act.jump(high);
        }
    }


