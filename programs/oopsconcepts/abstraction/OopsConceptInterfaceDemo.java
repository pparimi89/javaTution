interface ICar{
    void runCar();
}

class Car implements ICar{
    public void runCar(){
        System.out.println("rotate shaft");
        System.out.println("start buring fuel");
        System.out.println("Rotate wheels");
        System.out.println("Control car statbility");
        System.out.println("Switch off fuel in ideal state");
    }
}

public class  OopsConceptInterfaceDemo{
    public static void main(String[] args) {
        ICar car = new Car();
        car.runCar();
    }
}