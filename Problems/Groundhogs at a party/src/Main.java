import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean usualDay = cups >= 10 && cups <= 20 && !weekend;
        boolean weekEndDay = cups >= 15 && cups <= 25 && weekend;
        System.out.println(weekEndDay || usualDay);
    }
}