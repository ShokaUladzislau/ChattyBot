import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int t = 0;


        while (m < k) {
            m = m + m * p / 100;
            ++t;
        }
        System.out.println(t);
    }
}