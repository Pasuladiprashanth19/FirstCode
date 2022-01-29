

class Mechanic
        {
            public void show()
            {
                System.out.println("in mechanic");
            }
        }

        class Customer extends Mechanic
        {
            public void show()
            {
                super.show();
                System.out.println("in customer");

            }
        }

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Mechanic obj1 = new Customer();
        obj1.show();
    }
}
