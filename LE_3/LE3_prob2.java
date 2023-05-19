public class Main{
    public static void main(String[] args) {
    Test t=new Test();
    t.display();
}
}
class Test implements Testable{
    public display(){
        System.out.println("hello");
    }
}

Interface Testable{
    void display();
    
}
