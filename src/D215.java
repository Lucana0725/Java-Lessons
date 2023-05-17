import java.util.*;
public class D215 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String password = "Guitar";  // パスワード
    int chance = 3;  // 入力可能回数

    int fail = 0;  // 認証失敗回数をカウントしていく。

    for (int i = 0; i < chance; i++) {
      // パスワードを求められるフェーズ
      System.out.println("パスワードを入力してください。");
      String input = sc.nextLine();

      if (input.equals(password)) {
        System.out.println("パスワードを認証しました。");
        break;  //  パスワードが一致したらその時点でループを抜ける
      } else {
        fail++;  // 認証失敗ごとにfailを1増加していく
        System.out.println("fail:" + fail);

        System.out.println("パスワードが違います。");

        // 間違えた回数に応じた条件分岐
        if (fail > (chance-1) && !(input.equals(password))) {  // 規定回数以上間違えた場合
          System.out.println(fail + "回間違えたので、システムは強制終了されます。さようなら。");
        } else {  // 間違え回数が規定回数を越していない場合
          System.out.println("あと" + (chance-(i+1)) + "回間違えるとシステムはダウンします。");
        }
      }

    }

  }
}
