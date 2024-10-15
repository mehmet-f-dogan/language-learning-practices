public class TypeConversion {

    public static void run() {
        System.out.println();
        System.out.println("Java Primitive Conversions:");

        // 1. Integer to other types
        Integer intValue = 123;
        System.out.println("Integer to Double: " + convertPrimitive(intValue, Double.class)); // 123.0
        System.out.println("Integer to Long: " + convertPrimitive(intValue, Long.class)); // 123
        System.out.println("Integer to Float: " + convertPrimitive(intValue, Float.class)); // 123.0
        System.out.println("Integer to Short: " + convertPrimitive(intValue, Short.class)); // 123
        System.out.println("Integer to Byte: " + convertPrimitive(intValue, Byte.class)); // 123
        System.out.println("Integer to Character: " + convertPrimitive(intValue, Character.class)); // {
        System.out.println("Integer to Boolean: " + convertPrimitive(intValue, Boolean.class)); // true

        // 2. Double to other types
        Double doubleValue = 456.78;
        System.out.println("Double to Integer: " + convertPrimitive(doubleValue, Integer.class)); // 456
        System.out.println("Double to Long: " + convertPrimitive(doubleValue, Long.class)); // 456
        System.out.println("Double to Float: " + convertPrimitive(doubleValue, Float.class)); // 456.78
        System.out.println("Double to Short: " + convertPrimitive(doubleValue, Short.class)); // 456
        System.out.println("Double to Byte: " + convertPrimitive(doubleValue, Byte.class)); // 456
        System.out.println("Double to Character: " + convertPrimitive(doubleValue, Character.class)); // ?
        System.out.println("Double to Boolean: " + convertPrimitive(doubleValue, Boolean.class)); // true

        // 3. Long to other types
        Long longValue = 789L;
        System.out.println("Long to Integer: " + convertPrimitive(longValue, Integer.class)); // 789
        System.out.println("Long to Double: " + convertPrimitive(longValue, Double.class)); // 789.0
        System.out.println("Long to Float: " + convertPrimitive(longValue, Float.class)); // 789.0
        System.out.println("Long to Short: " + convertPrimitive(longValue, Short.class)); // 789
        System.out.println("Long to Byte: " + convertPrimitive(longValue, Byte.class)); // 789
        System.out.println("Long to Character: " + convertPrimitive(longValue, Character.class)); // ǽ
        System.out.println("Long to Boolean: " + convertPrimitive(longValue, Boolean.class)); // true

        // 4. Float to other types
        Float floatValue = 3.14f;
        System.out.println("Float to Integer: " + convertPrimitive(floatValue, Integer.class)); // 3
        System.out.println("Float to Double: " + convertPrimitive(floatValue, Double.class)); // 3.14
        System.out.println("Float to Long: " + convertPrimitive(floatValue, Long.class)); // 3
        System.out.println("Float to Short: " + convertPrimitive(floatValue, Short.class)); // 3
        System.out.println("Float to Byte: " + convertPrimitive(floatValue, Byte.class)); // 3
        System.out.println("Float to Character: " + convertPrimitive(floatValue, Character.class)); // ?
        System.out.println("Float to Boolean: " + convertPrimitive(floatValue, Boolean.class)); // true

        // 5. Short to other types
        Short shortValue = 15;
        System.out.println("Short to Integer: " + convertPrimitive(shortValue, Integer.class)); // 15
        System.out.println("Short to Double: " + convertPrimitive(shortValue, Double.class)); // 15.0
        System.out.println("Short to Long: " + convertPrimitive(shortValue, Long.class)); // 15
        System.out.println("Short to Float: " + convertPrimitive(shortValue, Float.class)); // 15.0
        System.out.println("Short to Byte: " + convertPrimitive(shortValue, Byte.class)); // 15
        System.out.println("Short to Character: " + convertPrimitive(shortValue, Character.class)); // ?
        System.out.println("Short to Boolean: " + convertPrimitive(shortValue, Boolean.class)); // true

        // 6. Byte to other types
        Byte byteValue = 5;
        System.out.println("Byte to Integer: " + convertPrimitive(byteValue, Integer.class)); // 5
        System.out.println("Byte to Double: " + convertPrimitive(byteValue, Double.class)); // 5.0
        System.out.println("Byte to Long: " + convertPrimitive(byteValue, Long.class)); // 5
        System.out.println("Byte to Float: " + convertPrimitive(byteValue, Float.class)); // 5.0
        System.out.println("Byte to Short: " + convertPrimitive(byteValue, Short.class)); // 5
        System.out.println("Byte to Character: " + convertPrimitive(byteValue, Character.class)); // ?
        System.out.println("Byte to Boolean: " + convertPrimitive(byteValue, Boolean.class)); // true

        // 7. Character to other types
        Character charValue = 'A';
        System.out.println("Character to Integer: " + convertPrimitive(charValue, Integer.class)); // 65
        System.out.println("Character to Double: " + convertPrimitive(charValue, Double.class)); // 65.0
        System.out.println("Character to Long: " + convertPrimitive(charValue, Long.class)); // 65
        System.out.println("Character to Float: " + convertPrimitive(charValue, Float.class)); // 65.0
        System.out.println("Character to Short: " + convertPrimitive(charValue, Short.class)); // 65
        System.out.println("Character to Byte: " + convertPrimitive(charValue, Byte.class)); // 65
        System.out.println("Character to Boolean: " + convertPrimitive(charValue, Boolean.class)); // true

        // 8. Boolean to other types
        Boolean boolValue = true;
        System.out.println("Boolean to Integer: " + convertPrimitive(boolValue, Integer.class)); // 1
        System.out.println("Boolean to Double: " + convertPrimitive(boolValue, Double.class)); // 1.0
        System.out.println("Boolean to Long: " + convertPrimitive(boolValue, Long.class)); // 1
        System.out.println("Boolean to Float: " + convertPrimitive(boolValue, Float.class)); // 1.0
        System.out.println("Boolean to Short: " + convertPrimitive(boolValue, Short.class)); // 1
        System.out.println("Boolean to Byte: " + convertPrimitive(boolValue, Byte.class)); // 1
        System.out.println("Boolean to Character: " + convertPrimitive(boolValue, Character.class)); //
    }

    public static Object convertPrimitive(Object value, Class<?> targetType) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        if (targetType == Integer.class) {
            return convertToInt(value);
        } else if (targetType == Double.class) {
            return convertToDouble(value);
        } else if (targetType == Long.class) {
            return convertToLong(value);
        } else if (targetType == Float.class) {
            return convertToFloat(value);
        } else if (targetType == Short.class) {
            return convertToShort(value);
        } else if (targetType == Byte.class) {
            return convertToByte(value);
        } else if (targetType == Character.class) {
            return convertToChar(value);
        } else if (targetType == Boolean.class) {
            return convertToBoolean(value);
        } else {
            throw new IllegalArgumentException("Unsupported target type: " + targetType);
        }
    }

    private static Integer convertToInt(Object value) {
        if (value instanceof Number) {
            return ((Number) value).intValue();
        } else if (value instanceof Boolean) {
            return (Boolean) value ? 1 : 0;
        } else if (value instanceof Character) {
            return (int) ((Character) value); // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Integer");
        }
    }

    private static Double convertToDouble(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else if (value instanceof Character) {
            return (double) ((Character) value); // Convert char to its ASCII value
        } else if (value instanceof Boolean) {
            return (boolean) value ? 1d : 0d; // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Double");
        }
    }

    private static Long convertToLong(Object value) {
        if (value instanceof Number) {
            return ((Number) value).longValue();
        } else if (value instanceof Character) {
            return (long) ((Character) value); // Convert char to its ASCII value
        } else if (value instanceof Boolean) {
            return (boolean) value ? 1l : 0l; // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Long");
        }
    }

    private static Float convertToFloat(Object value) {
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        } else if (value instanceof Character) {
            return (float) ((Character) value); // Convert char to its ASCII value
        } else if (value instanceof Boolean) {
            return (boolean) value ? 1f : 0f; // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Float");
        }
    }

    private static Short convertToShort(Object value) {
        if (value instanceof Number) {
            return (short) ((Number) value).intValue();
        } else if (value instanceof Character) {
            return (short) (char) ((Character) value); // Convert char to its ASCII value
        } else if (value instanceof Boolean) {
            return (short) ((boolean) value ? 1 : 0); // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Short");
        }
    }

    private static Byte convertToByte(Object value) {
        if (value instanceof Number) {
            return (byte) ((Number) value).intValue();
        } else if (value instanceof Character) {
            return (byte) (char) ((Character) value); // Convert char to its ASCII value
        } else if (value instanceof Boolean) {
            return (byte) ((boolean) value ? 1 : 0); // Convert char to its ASCII value
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Byte");
        }
    }

    private static Character convertToChar(Object value) {
        if (value instanceof Character) {
            return (Character) value;
        } else if (value instanceof Number) {
            return (char) ((Number) value).intValue();
        } else if (value instanceof Boolean) {
            return (char) ((boolean) value ? 1 : 0); // Convert char to its ASCII value
        } 
        else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Character");
        }
    }

    private static Boolean convertToBoolean(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else if (value instanceof Number) {
            return ((Number) value).intValue() != 0;
        } else if (value instanceof Character) {
            return (Character) value != '\u0000'; // Non-null character is true
        } else {
            throw new IllegalArgumentException("Cannot convert " + value.getClass() + " to Boolean");
        }
    }
}
