public class Child extends Mother{
    void show(){
        System.out.println("Hello Juet");
    }
    
}
public class Main
{
    public static void main( String args[])
    {
       Mother m=new Mother();
       //m.show();
       Child c=new Child();
       c.show();
    
    }
    
}
public class Mother{
    void show(){
        System.out.println("Hello World");
    }
    
    
}
