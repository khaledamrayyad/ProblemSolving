import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LimakWeight = scanner.nextInt();
        int BobWeight = scanner.nextInt();
        int years=0;
        while (LimakWeight <= BobWeight) {
            LimakWeight = LimakWeight*3;
            BobWeight = BobWeight*2;
            years++;
        }

         System.out.println(years);
    }
}