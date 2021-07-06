import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int sum2 = 0;
        StringBuilder str = new StringBuilder(scanner.nextLine());;
        for (int j = 0; j < n; j++) {
            str = new StringBuilder(scanner.nextLine());
            for (int i = 0; i <= 4; i++) {
                if (str.charAt(i) == '1') {
                    sum++;
                }
            }
            if (sum >= 2) {
                sum2++;
            }
            sum = 0;

        }
        System.out.println(sum2);
    }
}