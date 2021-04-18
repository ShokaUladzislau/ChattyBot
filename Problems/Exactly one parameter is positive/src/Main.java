import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean r1 = a > 0 && b <= 0 && c <= 0;
        boolean r2 = a <= 0 && b > 0 && c <= 0;
        boolean r3 = a <= 0 && b <= 0 && c > 0;


        System.out.println(r1 || r2 || r3);
    }
}