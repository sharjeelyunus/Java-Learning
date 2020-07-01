public class Main {

    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("NumberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("Number= " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("NumberAsString = " + numberAsString);
        System.out.println("Number = " + number);
    }
}
