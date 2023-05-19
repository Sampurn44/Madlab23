public class Main{
    public static void main(String args[])
{
    Mother m=new Mother();
    m.show();
    Child ch=new Child();
    ch.show();
}
}
public class Child extends Mother{
    
}
public class Mother
{
    int x;
    void show(){
        System.out.println(x);
    }
}
