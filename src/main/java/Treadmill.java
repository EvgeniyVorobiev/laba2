
    public enum Treadmill implements Obstacle
    {
        shortTreadmill(100),mediumTreadmill(500),longTreadmill(1000);
        public int distance;

        Treadmill(int distance)
        {
            this .distance = distance;
        }
        @Override
        public boolean obstacle(Action act)
        {
            return act.run(distance);
        }
    }



