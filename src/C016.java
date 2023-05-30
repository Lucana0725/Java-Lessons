import java.util.*;
public class C016 {
  public static void main (String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("入力された文字列をLEET文字列に変換します。");
    System.out.println("好きな英単語を入力してください。");
    
    String input = sc.nextLine();  // 文字列の入力の受け取り
    // System.out.println(input);  // 確認用出力
    String[] letters = input.split("");  // input文字列を一文字ずつ分解、配列lettersへ。

    HashMap<String, String> hmap = new HashMap<String, String>();  // LEET文字を連想配列で格納
    // 以下、LEET文字の元文字(key)と変換後文字(value)
    hmap.put("A", "4");
    hmap.put("E", "3");
    hmap.put("G", "6");
    hmap.put("I", "1");
    hmap.put("O", "0");
    hmap.put("S", "5");
    hmap.put("Z", "2");

    // System.out.println(hmap.get("A"));  // とりあえず連想配列の作成と出力は期待通りできている。
    for (int i = 0; i < letters.length; i++) {
      if (hmap.containsKey(letters[i])) {
        letters[i] = hmap.get(letters[i]);
        // System.out.println()
      }
    }

    String reLetters = String.join("", letters);
    System.out.println(reLetters);
    

  }
}