public class Dog{

  //properties - the below are properties or variables
  String colour;
  String breed;
  Integer height;
  Integer weight;

  // the below are methods or behaviours
  public void bark(){
    System.out.println("bark");
  }

  public void eat(){
     System.out.println("eat");
  }

  public void sleep(){
     System.out.println("sleep");
  }

  public void printHowManyTimesMyDogBarken() {
          System.out.println("100");
  }


  public static void main(String args[]){
    
   Dog pet = new Dog();//Dog() - Its a constructor.
   pet.bark();
   pet.sleep();
   pet.colour = "Red";
   System.out.println(pet.colour);
	
  }






}


