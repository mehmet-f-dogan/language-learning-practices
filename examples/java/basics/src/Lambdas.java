public class Lambdas {

    interface AddFunction {
        int add(int amount);
    }

    public static void run(){
        System.out.println();
        System.out.println("Java Lambdas:");

        var addOne = createAddFunction(1);
        var addTwo = createAddFunction(2);
        
        System.out.println("One plus one is " + addOne.add(1));
        System.out.println("One plus two is " + addTwo.add(1));
    }

    public static AddFunction createAddFunction(int addAmount){
        return (value) -> value + addAmount;
    }
}
