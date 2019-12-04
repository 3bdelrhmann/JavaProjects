import java.util.Scanner;
public class CalcSeconds {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int hours = num / 3600;
    int rem = num % 3600;
    int min = rem / 60;
    int sec = rem % 60;
    System.out.println(hours);    
    System.out.println(min);
    System.out.println(sec);
  }
}
