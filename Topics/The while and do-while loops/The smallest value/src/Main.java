import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long fact = 1;
        long calc = 1;
        while (calc <= input) {
            calc = calc * fact;
            fact++;
        }

        System.out.println(fact-1);
    }
}