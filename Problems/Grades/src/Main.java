import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < students; i++) {
            int z = scanner.nextInt();
            if (z == 2) {
                ++d;
            } else if (z == 3) {
                ++c;
            } else if (z == 4) {
                ++b;
            } else if (z == 5) {
                ++a;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}