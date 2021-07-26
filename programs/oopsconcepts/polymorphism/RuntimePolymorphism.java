class Laptop{
    public void printLaptopType(){
        System.out.println("Basic configuration laptop");
    }
}
class GamingLaptop extends Laptop{
    public void printLaptopType(){
        System.out.println("Gaming laptop configuration");
    }
}

class RuntimePolymorphism{
    public static void main(String[] args) {
        Laptop laptop = new GamingLaptop();
        laptop.printLaptopType();
    }
}