class Addition{

    public int doAddition(int a, int b){
        return a + b;
    }
    public int doAddition(int a, int b, int c){
        return a + b + c;
    }
    public int doAddition(int a, int b, int c, int d){
        return a + b+ c+ d;
    }
    public int doAddition(int a, int b, int c, int d, int e){
        return a + b+ c+ d+e;
    }

    public int doAddition(double a, double b){
        return (int)(a + b);
    }

}

public class CompileTimePolymorphism{
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.doAddition(10, 20));
        System.out.println(addition.doAddition(10, 20, 30));
        System.out.println(addition.doAddition(10, 20, 30, 40, 50));
        System.out.println(addition.doAddition(5.6, 10.2));
    }
}