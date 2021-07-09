public class DataTypesCsting{

    public static void main(String[] args) {
        //Widening
        int i = 100;
        long j = i;
        System.out.println(j);

        //Narrowing
        long k = 100;
        short l = (short) k;
        System.out.println(l);

    }
}