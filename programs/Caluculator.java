public class Caluculator{
   int counter;
   int decrmenter;

    public Caluculator(){
        this.counter =  1;
        System.out.println(" ***** Object created *** No arg constructor ");
    }

    public Caluculator(int num){
        this();
       System.out.println(" ***** Calculator object is created ****** "+ num);
       System.out.println(" ***** Calculator object is created ****** ");

   }

    public Caluculator(int num1, int num2){
        this();
        System.out.println(" ***** Calculator object is created ****** "+ num1 + "   "+ num2);
        System.out.println(" ***** Calculator object is created ****** ");
    }

    public Caluculator(int num1, int num2, ){
        this();
        System.out.println(" ***** Calculator object is created ****** "+ num1 + "   "+ num2);
        System.out.println(" ***** Calculator object is created ****** ");
    }

    public int doCalculate(int val1, int val2){
     int val3 = val1 + val2;
     return val3;
  }

  public static void main(String args[]){
  Caluculator calc = new Caluculator(1);
  calc.counter = 1;
  Caluculator calc2 = new Caluculator(2);
  calc2.counter = 1;
  Caluculator calc3 = new Caluculator(3);
  calc3.counter = 1;
  Caluculator calc4 = new Caluculator();
  calc4.counter = 1;
  Caluculator calc5 = new Caluculator(5, 6);
  Caluculator calc8 = new Caluculator(5, 6);
  Caluculator calc9 = new Caluculator(5, 6);
  Caluculator calc10 = new Caluculator(5, 6);
      System.out.println("");
      System.out.println("");
  System.out.println("class --> "+calc);
  System.out.println("counter-->> "+calc.counter);
  System.out.println("counter-->> "+calc2.counter);
  System.out.println("counter-->> "+calc3.counter);
  System.out.println("counter-->> "+calc4.counter);
  System.out.println("counter-->> "+calc5.counter);

  System.out.println("decrementer-->> "+calc.decrmenter);
  int result = calc.doCalculate(168, 287);   
  System.out.println(result);
  }
}