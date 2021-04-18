import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a <= b && h < a) {
            System.out.println("Deficiency");
        } else if (a <= b && h > b) {
            System.out.println("Excess");
        } else if (a <= b && h >= a && h <= b) {
            System.out.println("Normal");
        }
    }
}