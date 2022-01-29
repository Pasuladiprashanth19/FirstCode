
class Outer
{
    static int a;
    public static void show()
    {
        System.out.println("in void");

    }
   static class Inner
    {
        public  void  display()
        {
            System.out.println("in display");
        }
    }
}
public class Innerdemo {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 =new Outer.Inner();

     }
}
