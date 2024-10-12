package solution;


class Value{
    private int value;

    public Value(int value){
        this.value = value;
    }
    
    public Value doubleValue(){
        return new Value(value * 2);
    }

    public Value squareValue(){
        return new Value(value * value);
    }

    public int getValue(){
        return value;
    }
}

public class FunctionChaining {

    public static void run() {
        System.out.println();
        System.out.println("Java Function Chaining:");

        var value = new Value(3);

        System.out.println("3 doubled then squared is " + value.doubleValue().squareValue().getValue());
        System.out.println("3 squared then doubled is " + value.squareValue().doubleValue().getValue());
    }
}
