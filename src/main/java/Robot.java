public class Robot implements Action
{
    public String name;
    public int MaxRunDistance;
    public int MaxJumpHigh;
    public  Robot(String name,int MaxRunDistance,int MaxJumpHigh)
    {
        this. name = name;this. MaxJumpHigh = MaxJumpHigh; this. MaxRunDistance = MaxRunDistance;
    }
    @Override
    public boolean run(int distance)
    {
        if (distance <= MaxRunDistance)
        {
            System.out.printf("Робот " + name +" смог пробежать " + distance + " метров%n");
            return true;
        }
        else
        {
            System.out.printf("Робот " + name +" не смог пробежать " + distance + " метров%n");
            return false;
        }
    }
    @Override
    public boolean jump(int high)
    {
        if (high <= MaxJumpHigh)
        {
            System.out.printf("Робот " + name +" смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return true;
        }
        else
        {
            System.out.printf("Робот " + name +" не смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return false;
        }
    }
}
