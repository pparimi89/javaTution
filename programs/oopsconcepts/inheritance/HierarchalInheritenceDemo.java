class Father{
    int goldInKg = 100;
    int silverInkg = 100;

    public void snore(){
        System.out.println("Fater snores");
    }

    public void work(){
        System.out.println("Father Work smart");
    }

    public void think(){
        System.out.println("Father Think fast");
    }
}

class Son1 extends Father{

}

class Son2 extends Father{

}
class Son3 extends Father{

}

public class SingleInheritenceDemo{
     public static void main(String[] args) {
         Son1 son = new Son1();
         System.out.println("Gold --->"+son.goldInKg);
         System.out.println("Silver --->"+son.silverInkg);

         son.think();
         son.work();
     }
 }



