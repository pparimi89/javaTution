class FinalKeywordWaysOfInitialization{
    //Normal way
    final String studentName = "Jeyachandra";
    final String departmentName;
    final static String teacherName;

    //Static block initialization
    static {
        System.out.println("here in static");
        teacherName = "Prof.Shiva";
    }

    //Constructor initialization
    FinalKeywordWaysOfInitialization(){
        System.out.println("here in constructor");
        this.departmentName = "CSC Dept";
    }


    public static void main(String[] args) {
        final String str = "test";
         System.out.println(str);
    }
}