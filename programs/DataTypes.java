public class DataTypes{
    boolean booleanVar;
    byte byteVar;

    float floatVar;
    double doubleVar;
    char charVar;

    char charVar1;
    char charVar2;
    char charVar3;
    char charVar4;

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        //Default values
        System.out.println(dataTypes.booleanVar);
        System.out.println(dataTypes.byteVar);
        System.out.println(dataTypes.floatVar);
        System.out.println(dataTypes.doubleVar);
        System.out.println(dataTypes.charVar);

        //We are changing the values
        dataTypes.booleanVar = true;
        dataTypes.byteVar = 127;
        dataTypes.floatVar = 12.1234556f;
        dataTypes.doubleVar = 12.1234567812345649;

        dataTypes.charVar = 'T';
        dataTypes.charVar1 = 65;
        dataTypes.charVar2 = 97;
        dataTypes.charVar3 = 35;
        dataTypes.charVar4 = 5000;

        //printing the changed values
        System.out.println(dataTypes.booleanVar);
        System.out.println(dataTypes.byteVar);
        System.out.println(dataTypes.floatVar);
        System.out.println(dataTypes.doubleVar);
        System.out.println(dataTypes.charVar);
        System.out.println(dataTypes.charVar1);
        System.out.println(dataTypes.charVar2);
        System.out.println(dataTypes.charVar3);
        System.out.println(dataTypes.charVar4);
    }
}