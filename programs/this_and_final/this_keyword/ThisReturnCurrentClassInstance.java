class Teacher{

    void printName(){
        System.out.println("Name is Ranjith");
    }

    Teacher getTeacherInstance(){
        System.out.println("Instantiated");
        return this;
    }

}

class ThisReturnCurrentClassInstance{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.getTeacherInstance().printName();

    }
}
