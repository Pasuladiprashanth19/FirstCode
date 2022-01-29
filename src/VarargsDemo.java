class Abc
{
    public int add(int...n)
    {
        int sum = 0;
        for(int i : n)
        {
            sum = sum +i;
        }
        return sum;
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        Abc obj= new Abc();
        System.out.println(obj.add(2,1,2,5));

    }
}
