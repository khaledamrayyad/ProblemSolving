import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGames = scanner.nextInt();
        String str = scanner.next();
        StringBuilder string = new StringBuilder(str);
        int numOfA = 0;
        int numOfD = 0;
        for (int i = 0; i < numOfGames; i++) {
            if (string.charAt(i) == 'A') {
                numOfA++;
            } else if (string.charAt(i) == 'D') {
                numOfD++;
            }
        }
        if (numOfA == numOfD) {
            System.out.println("Friendship");
        } else if (numOfA > numOfD) {
            System.out.println("Anton");
        } else{
            System.out.println("Danik");
        }

    }
}