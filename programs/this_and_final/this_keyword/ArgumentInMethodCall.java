class Shop {

    void getAndPrintName(Shop shop) {
        System.out.println("Method printname");
        shop.printArea();
    }

    void printName() {
        System.out.println("Name is Amazon partner shop");
        getAndPrintName(this);
    }

    void printArea(){
        System.out.println("Azerrabad");
    }
}
 class ArgumentInMethodCall {
     public static void main(String[] args) {
         Shop shop = new Shop();
         shop.printName();
     }
 }
