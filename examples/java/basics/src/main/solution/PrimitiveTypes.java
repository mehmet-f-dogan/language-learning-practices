package solution;

public class PrimitiveTypes {
    public static void run() {
        System.out.println();
        System.out.println("Java Primitive Types:");

        boolean booleanValue;
        byte byteValue;
        char charValue;
        short shortValue;

        int intValue;
        float floatValue;

        long longValue;
        double doubleValue;

        booleanValue = true;
        System.out.println("boolean can be only true or false");

        byteValue = -1;
        byteValue = 'a';
        byteValue = 1;
        byteValue = 0x1;
        byteValue = 0b00000001;
        System.out.println("byte can be negative or positive and can be assigned char, hexadecimal or bit values");

        charValue = 1;
        charValue = 'a';
        charValue = 0b1;
        charValue = 0x1;
        System.out.println("chars can be assigned to characters, hex and bit values");

        shortValue = 'a';
        shortValue = 1;
        shortValue = 0x1;
        shortValue = 0b1;
        System.out.println("shorts behave the same as chars");

        intValue = 1;
        intValue = 'a';
        intValue = 0x1;
        intValue = 0b1;
        System.out.println("ints behave the same as chars");

        floatValue = 1;
        floatValue = 1l;
        floatValue = 'a';
        floatValue = 0xf;
        floatValue = 0b1;
        System.out.println("ints behave the same as chars");

        doubleValue = 1;
        doubleValue = 1l;
        doubleValue = 'a';
        doubleValue = 0xf;
        doubleValue = 0b1;
        System.out.println("doubles behave the same as chars");

        longValue = 1;
        longValue = 1l;
        longValue = 'a';
        longValue = 0xf;
        longValue = 0b1;
        System.out.println("longs behave the same as chars");
    }
}
