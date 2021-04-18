import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // We need to get one moment, when we have unordered list...
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        int a = scanner.nextInt();
        int b = 0;
        int c = 0;

        while (a != 0) {
            // It is this moment...
            if ((a < b && b > c || a > b && b < c) && c != 0) {
                result = !result;
            }
            c = b;
            b = a;
            a = scanner.nextInt();
        }
        System.out.println(result);
    }
}