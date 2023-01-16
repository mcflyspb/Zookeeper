import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int count = 0;


        while (input != 0) {
            input = scanner.nextInt();
            count++;
        }

        System.out.println(count-1);

    }
}