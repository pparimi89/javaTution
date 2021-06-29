class Employee{

  int daysWorked = 0; //instance variable
  static int totalWorkingDays = 31; //static variable


public int getPfAmount(int amount){
  this.daysWorked = 10;
  totalWorkingDays = 60;
  int intrestRate = 12;//local variable
  return amount*intrestRate;  
}   

public int getSalAmount(int amount){
  int intrestRate = 12; //local variable
  return amount*intrestRate;  
}   

public void printCompanyName(){
   Company comp = new Company();
   comp.printName();
}

public static void main(String args[]){
    
    Employee empl = new Employee();
    int amount = empl.getPfAmount(100);
    System.out.println(amount);
    System.out.println("empl1.daysWorked --->>> "+empl.daysWorked);
    System.out.println("empl1.totalWorkingDays --->>> "+Employee.totalWorkingDays);
    System.out.println(Company.name);

   empl.printCompanyName();

    //Obj2
   Employee empl2 = new Employee();
   System.out.println("empl2.daysWorked --->>> "+empl2.daysWorked);
   System.out.println("empl2.totalWorkingDays --->>> "+Employee.totalWorkingDays);

  System.out.println("Employee.objectCounter");
   Employee empl3 = new Employee();
   Employee empl5565 = new Employee();
   Employee empl34 = new Employee();

   System.out.println(Employee.objectCounter);

   System.out.println(Employee.totalWorkingDays);
}


}