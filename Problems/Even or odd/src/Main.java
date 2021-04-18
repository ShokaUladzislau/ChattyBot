import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n != 0) {
            System.out.println(n % 2 == 0 ? "even" : "odd");
            n = scanner.nextInt();
        }
    }
}