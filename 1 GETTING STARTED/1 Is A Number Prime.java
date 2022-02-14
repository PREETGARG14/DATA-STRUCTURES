import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int t = scn.nextInt();   //t no of input
    for (int i = 0; i < t; i++) {
      int count = 0;
      int num = scn.nextInt();
      for (int j = 2; j * j <= num; j++) {
        if (num % j == 0) {
          count++;
          break;
        }
      }
      if (count == 0)
        System.out.println("prime");
      else
        System.out.println("not prime");
    }

  }
}
