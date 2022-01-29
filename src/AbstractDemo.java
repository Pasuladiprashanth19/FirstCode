abstract  class Writer
{
    public abstract void write();
}
class Pen extends Writer
{
    public void write()
    {
        System.out.println("Iam pen");
    }
}
class Pencil extends Writer
{
    public void write()
{
        System.out.println("Im pencil");
    }

}
class Kit{
   public void doSomethihg(Writer p)
    {
        p.write();
    }

}
    public class AbstractDemo{
        public static void main(String[] args) {
            Kit k =new Kit();
            Writer p = new Pen();
            Writer pc = new Pencil();

            k.doSomethihg(p);



        }
    }
