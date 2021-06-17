public class Caluculator{

  public int doCalculate(int val1, int val2){
     int val3 = val1 + val2;
     return val3;
  }

  public static void main(String args[]){
  Caluculator calc = new Caluculator();
  int result = calc.doCalculate(168, 287);   
  System.out.println(result);
  }


}