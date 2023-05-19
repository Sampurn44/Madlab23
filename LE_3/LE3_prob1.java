class Arjun extends Pandavs{
    void kind()
 {
        System.out.println("arjun is kind");
 }
    void obey()
 {
        System.out.println("obedeience arjun");
 }
}
abstract class Bharatvanshi
{
    void fighter(){
        System.out.println(" bharatvanshi figter");
 }
    abstract void kind();
    abstract void obey();
    abstract void notorious();
}
class Bheem extends Pandavs{
    void kind()
 {
        System.out.println("less kind");
 }
     void obey()
 {
        System.out.println("obedeience bheem");
 }
}
class Duryodhan extends Kaurav{
    void notorious(){
        System.out.println("duryodhan were disobedient");
 }
    void obey()
 {
        System.out.println("disobedience duryodhan");
 }
}
public class Main
{
public static void main(String[] args) {
    Arjun a=new Arjun();
    a.fighter();
    a.obey();
    a.kind();
    Bheem b=new Bheem();
    b.fighter();
    b.obey();
    b.kind();
    Vikarn v=new Vikarn();
    v.fighter();
    v.obey();
    v.kind();
    Pandavs p=new Pandavs();
    p.kind();
    p.obey();
    Duryodhan d=new Duryodhan();
    d.notorious();
    d.fighter();
}
}
class Pandavs extends Bharatvanshi{
    void obey(){
        System.out.println("pandavas obedience");
 }
    void kind()
 {
        System.out.println("pandavas kind");
 }
    void notorious()
 {
        System.out.println("not notorious");
 }
}
class Vikarn extends Pandavs{
    void kind(){
        System.out.println("vikarn is kind");
 }
    void obey()
 {
        System.out.println("obedeient vikarn");
 }
}
class Kaurav extends Bharatvanshi{
    void notorious()
 {
        System.out.println("notorious kauravas");
 }
    void obey()
 {
         System.out.println("disobedience kauravas");
 }
    void kind()
 {
         System.out.println(" not kind");
 }
}
