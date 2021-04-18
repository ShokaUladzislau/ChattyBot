import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int count = 0;
        double result = 0;

        for (int i = a; i <= b; i++){
            if(i % 3 == 0){
                sum += i;
                count++;
            }
        }
        if(count == 0){
            result = 0;
        }else {
            result = 1.0 * sum/count;
        }

        System.out.println(result);

    }
}