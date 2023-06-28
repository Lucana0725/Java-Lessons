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

    // // 以下、resultsの確認用
    // for (int i = 0; i < input_times; i++) {
    //   for (int j = 0; j < 2; j++) {
    //     System.out.print(results[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // resultsの中に"n"があったときのループのカウンター変数をListとして保持する(可変長である必要があるため)
    ArrayList<Integer> check_n = new ArrayList<Integer>();
    
    // resultsをループさせ、resultsの要素に"n"があるか判断する
    for (int i = 0; i < input_times; i++) {
      boolean has_n = false;  // nが含まれていればtrueにする。まずはfalseで初期化
      for (int j = 0; j < 2; j++) {
        if (results[i][j].equals("n")) {
          has_n = true;
          break;  // このif文を抜ける
        }
      }
      if (has_n) {  // 先のループでhas_nがtrueであれば
        check_n.add(i);  // リストcheck_nにループのカウンター変数iを保持させる。
      }
    }

    // 解き直す問題数とその番号の表示
    System.out.println("解き直す問題数： " + check_n.size());
    for (int i = 0; i < check_n.size(); i++) {
      if (check_n.size() != 0) {
        // System.out.println("問題No. " + check_n.get(i+1));
        int count = check_n.get(i);  // そのままcheck_nを出力すると期待値-1される(0スタート)のでcountという変数に格納する。
        System.out.println("問題No. " + (count+1));
      }
    }


  }
}