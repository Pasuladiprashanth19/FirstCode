class Dcp
{
    public void show()
    {
        System.out.println("in dcp");
    }
}
class Ci extends  Dcp
{
    public void show()
    {
        System.out.println("in ci");
    }
}
class  Si extends  Dcp
{
    public void show()
    {
        System.out.println("in si");
    }
}
public class OverrindingDemo {
    //Compile time and runtime
    public static void main(String[] args)
    {
        Dcp obj1 = new Ci();   //runtimepolymorphism
        obj1.show();
        Si obj2 = new Si();    ///Dynamic method Disptch
        obj2.show();

      

    }
}
