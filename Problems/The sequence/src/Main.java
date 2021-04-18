import java.util.Scanner;

class TheSequence {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);
        int lenSeq = sysIn.nextInt();
        int countSeq = 0;

        for (int i = 1; countSeq < lenSeq; i++) {
            for (int j = 0; j < i && countSeq++ < lenSeq; j++) {
                System.out.print(i + " ");
            }
        }
    }
}