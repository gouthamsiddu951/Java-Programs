public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        boolean booleanValue = false; // Default value: false
        char charValue = '\u0000'; // Default value: '\u0000' (null character)
        byte byteValue = 0; // Default value: 0
        short shortValue = 0; // Default value: 0
        int intValue = 0; // Default value: 0
        long longValue = 0L; // Default value: 0L
        float floatValue = 0.0f; // Default value: 0.0f
        double doubleValue = 0.0; // Default value: 0.0

        // Print data types and their properties
        System.out.println("Data Type\tSize (bytes)\tDefault Value");
        System.out.println("------------------------------------------------");
        System.out.printf("boolean\t\t\t1\t\t%s%n", booleanValue);
        System.out.printf("char\t\t\t2\t\t'%c'%n", charValue);
        System.out.printf("byte\t\t\t1\t\t%d%n", byteValue);
        System.out.printf("short\t\t\t2\t\t%d%n", shortValue);
        System.out.printf("int\t\t\t4\t\t%d%n", intValue);
        System.out.printf("long\t\t\t8\t\t%d%n", longValue);
        System.out.printf("float\t\t\t4\t\t%.1f%n", floatValue);
        System.out.printf("double\t\t\t8\t\t%.1f%n", doubleValue);
    }
}