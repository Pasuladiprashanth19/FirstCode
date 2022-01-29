//IS-A HAS-A
class Calculator        //suoer
{
    public int add(int i, int j)
    {
        return i + j;
    }
}
    class AdvCalc extends Calculator  //sub
    {
        public int sub(int i,int j)
        {
            return i-j;
        }
    }
    class CalcAdvvery extends AdvCalc
    {
        public int multi(int i,int j)
        {
            return i*j;
        }
    }
public class Inheritance {
    public static void main(String[] args)
    {
        CalcAdvvery c1 = new CalcAdvvery();

        int result1 = c1.add(3,4);
        int result2 = c1.sub(9,4);
        int result3 = c1.multi(3,4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
