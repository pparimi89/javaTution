class Student{
    private String name = "Ramesh";//readonly
    private String city; // read and write
    private String state; // read and write
    private String zipCode; // read and write

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

}

public class EncapsulationDemo{

    public static void main(String[] args) {
        Student student = new Student();
        student.setCity("Nellore");
        student.setState("AP");
        student.setZipCode("524004");
        System.out.println(student.getName());
        System.out.println(student.getCity());
        System.out.println(student.getState());
        System.out.println(student.getZipCode());
    }

}