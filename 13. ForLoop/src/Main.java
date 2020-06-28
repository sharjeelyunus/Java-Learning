public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,2.0));

        System.out.println("***************************");

        for (int i=2; i<9; i++) {
            System.out.println("10000 at " +i +"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("***************************");

        for (int i=8; i>=2; i--) {
            System.out.println("10000 at " +i +"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
