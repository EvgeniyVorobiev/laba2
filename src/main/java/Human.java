public class Human implements Action{
    public String name;
    public int MaxRunDistance;
    public int MaxJumpHigh;
    public  Human(String name,int MaxRunDistance,int MaxJumpHigh)
    {
        this. name = name;this. MaxJumpHigh = MaxJumpHigh; this. MaxRunDistance = MaxRunDistance;
    }
    @Override
    public boolean run(int distance)
    {
        if (distance <= MaxRunDistance)
        {
            System.out.printf("Человек " + name +" смог пробежать " + distance + " метров%n");
            return true;
        }
        else
        {
            System.out.printf("Человек " + name +" не смог пробежать " + distance + " метров%n");
            return false;
        }
    }

    @Override
    public boolean jump(int high)
    {
        if (high <= MaxJumpHigh)
        {
            System.out.printf("Человек " + name +" смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return true;
        }
        else
        {
            System.out.printf("Человек " + name +" не смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return false;
        }
    }
}
