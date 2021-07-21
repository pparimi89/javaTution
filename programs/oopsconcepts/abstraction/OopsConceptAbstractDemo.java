abstract class AbstractCar{
    abstract void runCar();
    void checkForService(){
        System.out.print("Please do service after 15000 kms");
    }
}

class Car extends AbstractCar{
    public void runCar(){
        System.out.println("rotate shaft");
        System.out.println("start buring fuel");
        System.out.println("Rotate wheels");
        System.out.println("Control car statbility");
        System.out.println("Switch off fuel in ideal state");
    }
}

public class  OopsConceptAbstractDemo{
    public static void main(String[] args) {
        AbstractCar car = new Car();
        car.runCar();
    }
}