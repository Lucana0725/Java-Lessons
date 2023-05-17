import java.util.*;
public class D215 {
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    Scanner sc = new Scanner(System.in);
    // System.out.println("あるシステムのパスワードは'Guitar'です。");
    String password = "Guitar";
    System.out.println("パスワードを入力してください。");
    String input = sc.nextLine();
    
    if (input.equals(password)) {
      System.out.println("認証しました。");
    } else {
      System.out.println("認証に失敗しました。");
    }
  }
}