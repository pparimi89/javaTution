class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

}
class ThisKeywordDemo{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Ramesh kumar");
        System.out.println(st.name);
    }

}