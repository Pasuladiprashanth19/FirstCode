class Cyle
{
    public void show()
    {
        System.out.println("naku estam ledhuu thokadam");
    }
}
public class AnonmyousExamples {
    public static void main(String[] args) {
        Cyle obj = new Cyle()
        {
            public void show()
            {
                System.out.println("na bandi na estam");
            }
        };

        obj.show();
    }
}
