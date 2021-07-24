class GrandGrandFather{
   int currencyinRupes = 100;
    void work(){
        System.out.println("Knows Business");
    }
}

class GrandFather extends GrandGrandFather{
  int landInacres = 100;
  void work(){
      System.out.println("Knows agriculture");
  }
}

class Father extends GrandFather{
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


public class SingleInheritenceDemo{
     public static void main(String[] args) {
         Son1 son = new Son1();
         System.out.println("Gold --->"+son.goldInKg);
         System.out.println("Silver --->"+son.silverInkg);
         System.out.println("Silver --->"+son.currencyinRupes);
         son.think();
         son.work();
     }
 }



