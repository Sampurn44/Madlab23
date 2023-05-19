class Duck{
    public void swim(){
        System.out.println("All ducks can swim");
    }
    }

interface Flyable{
    void show();
}
class ld extends Duck implements Flyable,Quackable{
    public void show(){
        System.out.println("LD can fly");
    }
    public void display(){
        System.out.println("LD can quack");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Duck d= new Duck();
	    d.swim();
	    rd r1=new rd();
	    r1.show();
	    r1.display();
	    
	    rhd r2=new rhd();
	    r2.show();
	    r2.display();
	    
	    wd r3=new wd();
	    r3.show();
	    r3.display();
	   
	    ld r4=new ld();
	    r4.show();
	    r4.display();
	   
	}
}
interface Quackable{
    void display();
}
class rd extends Duck implements Flyable,Quackable{
    public void show(){
        System.out.println("RD cannot fly");
    }
    public void display(){
        System.out.println("RD squeaks");
    }
}
class rhd extends Duck implements Flyable,Quackable{
    public void show(){
        System.out.println("RHD fly");
    }
    public void display(){
        System.out.println("RHD quacks");
    }
}
class wd extends Duck implements Flyable, Quackable{
    public void show(){
        System.out.println("WD can't fly");
    }
    public void display(){
        System.out.println("Wd is mute");
    }
}
