class LogicalOperators{

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean e = true;
        boolean f = false;

        boolean c = a && b && e && f;
        boolean d = a || b || e || f;

        System.out.println(c);
        System.out.println(d);

    }
}