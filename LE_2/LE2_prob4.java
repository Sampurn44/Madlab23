public class Main
{
    public static void main( String args[])
    {
        One o=new One(9);
        
        Two t=new Two();
       
    
    }
    
}public class One{
    One(int x){
        
        System.out.println(x);
    }
}public class Two extends One{
    public Two(){
        super(4);
    }
    
    
        
}
