import java.util.Scanner;
public class petan {

    public static void main(String[] args) {
        int a;
      Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
      for (int i = 1; i <= a; ++i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print("* ");
        }
        System.out.println();
      }

    }
}
