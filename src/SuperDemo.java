class A
{
    public A()
    {
        System.out.println("In A");
    }
    public A(int i)
    {
        System.out.println("In A Int");
    }
}
class B extends A
{
    public B()
    {
        super(8);
        System.out.println("In B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("In B Int");
    }
}
public class SuperDemo
{
    public static void main(String[] args)
    {
        B obj = new B();

    }
}
