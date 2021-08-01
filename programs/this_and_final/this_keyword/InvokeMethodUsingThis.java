class Employee{
    void getSal(){
        this.printCompanyName();
        System.out.println("salaray is XXXXX");
    }

    void printCompanyName(){
        System.out.println("Company name is techM");
    }
}

class InvokeMethodUsingThis{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getSal();
    }
}