class Emp {
    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "Lasya";
        System.out.println("in static");

    }

    public Emp() {
        eid = 1;
        salary = 5000;
        System.out.println("in constructor");
    }



    public void show()
    {
        System.out.println(eid+" : " +salary+ " : "+ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Emp Deepu = new Emp();


        Emp Shiva = new Emp();

        Deepu.show();
        Shiva.show();


    }
}
