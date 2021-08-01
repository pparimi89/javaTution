class University{

    University(Department department){
        System.out.println("Department ");
        department.printDepartmentName();
    }

}

class Department{

    Department(){
        University university = new University(this);
    }
    void printDepartmentName(){
        System.out.println("CSE tech group");
    }
}

class ThisWithConstructorArgument{

    public static void main(String[] args) {
        Department department = new Department();
    }
}
