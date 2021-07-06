public class DataTypes{
    boolean booleanVar;
    byte byteVar;

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        //Default values
        System.out.println(dataTypes.booleanVar);
        System.out.println(dataTypes.byteVar);

        //We are changing the values
        dataTypes.booleanVar = true;
        dataTypes.byteVar = 127;

        //printing the changed values
        System.out.println(dataTypes.booleanVar);
        System.out.println(dataTypes.byteVar);
    }
}