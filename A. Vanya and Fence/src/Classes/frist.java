import java.util.Scanner;

public class frist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friendsNum = scanner.nextInt();
        int hight = scanner.nextInt();
        int sum=0;
        for (int i = 0; i < friendsNum; i++) {
            int personHight = scanner.nextInt();
            if (personHight > hight) {
                sum++;                
            }
            sum++;
            
        }

         System.out.println(sum);
    }
}