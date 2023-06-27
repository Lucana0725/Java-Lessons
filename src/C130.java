import java.util.*;
public class C130 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("解く問題集の問題数を入力してください");
    int input_times = sc.nextInt();

    sc.nextLine();  // 入力回数の改行文字の読み飛ばし

    System.out.println("解けた問題は「y」を、解けなかった問題は「n」を、半角スペース区切りで入力してください。");

    // 入力がinput_times + 1回されてしまうので、以下削除
    // for (int i = 0; i < input_times; i++) {
    //   String result = sc.next();
    //   sc.nextLine();
    // }

    String[][] results = new String[input_times][2];

    for (int i = 0; i < input_times; i++) {
      String line = sc.nextLine();
      String[] tokens = line.split(" ");
      for (int j = 0; j < 2; j++) {
        // results[i][j] = sc.next();
        results[i][j] = tokens[j];
      }
    }

    // 以下、resultsの確認用
    for (int i = 0; i < input_times; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(results[i][j] + " ");
      }
      System.out.println();
    }

  }
}