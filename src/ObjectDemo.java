class Calc
        {
        int num1;
        int num2;
        int result;


        public Calc(int num1,int num2)
        {
           this.num1 = num1;    //current object
            this.num2  = num2;
            System.out.println("in constructor");
        }
    }
        public class ObjectDemo {
            public static void main(String[] args)
            {
                Calc obj = new Calc(4,5);   //constructor

                System.out.println(obj.num1);
                System.out.println(obj.num2);
            }
        }