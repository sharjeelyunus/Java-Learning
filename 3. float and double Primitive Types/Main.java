public class Main {

    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value =" + myMinFloatValue);
        System.out.println("Float maximum value =" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =" + myMinDoubleValue);
        System.out.println("Double maximum value =" + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2;
        double myDoubleValue = 5d / 2;
        System.out.println("My Int Value =" + myIntValue);
        System.out.println("My Float Value =" + myFloatValue);
        System.out.println("My Double Value =" + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilogram = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilogram);
    }
}
