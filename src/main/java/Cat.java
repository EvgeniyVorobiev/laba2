public class Cat implements Action{
    public String name;
    public int MaxRunDistance;
    public int MaxJumpHigh;
    public int count = 1;
    public  Cat(String name,int MaxRunDistance,int MaxJumpHigh)
    {
        this. name = name;this. MaxJumpHigh = MaxJumpHigh; this. MaxRunDistance = MaxRunDistance;
    }
    @Override
    public boolean run(int distance)
    {
        if (distance <= MaxRunDistance)
        {
            System.out.printf("Кот " + name +" смог пробежать " + distance + " метров%n");
            return true;
        }
        else if (count != 0)
        {
            System.out.printf("Кот " + name +" смог пробежать " + distance + " метров, использовав SuperAction%n");
            count = count - 1;
            return true;
        }
        else
        {
            System.out.printf("Кот " + name +" не смог пробежать " + distance + " метров%n");
            return false;
        }
    }

    @Override
    public boolean jump(int high)
    {
        if (high <= MaxJumpHigh)
        {
            System.out.printf("Кот " + name +" смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return true;
        }
        else if (count != 0)
        {
            System.out.printf("Кот " + name + " смог перепрыгнуть препятствие высотой " + high + " метров, использовав SuperAction%n");
            count = count -1;
            return true;
        }
        else
        {
            System.out.printf("Кот " + name +" не смог перепрыгнуть препятствие высотой " + high + " метров%n");
            return false;
        }
    }
}
