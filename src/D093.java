import java.util.*;
public class D093 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("ゾロ目の場合、その数字が出力されます。そうでない場合は'No'が出力されます。");
    System.out.println("4桁の数字を入力してください。");

    // 入力値をString型でnextLine()で受け取った場合
    String input = sc.nextLine();
    String[] nums = input.split("");
    // System.out.println(Arrays.toString(nums));  // 入力値がちゃんと配列になってるか確認用

    // 入力値が4桁かどうかの判定
    if (input.length() == 4) {
      // ゾロ目かどうかの判定if文
      if (nums[0].equals(nums[1]) && nums[0].equals(nums[2]) && nums[0].equals(nums[3])) {
        // System.out.println(input);
        System.out.println(input + "：ゾロ目の数が入力されました。");
      } else {
        System.out.println(input + "：入力された値はゾロ目ではありません。");
      }
    } else {
      System.out.println(input + "：4桁の数ではありません。処理を中断します。");
    }



    
    // // 入力値をint型でnextInt()で受け取った場合
    // int num = sc.nextInt();
    // int[] nums = new int[4];
    // for (int i = 0; i < 4; i++) {
    //   nums[i] = num % 10;
    //   num /= 10;
    //   // System.out.println("nums[" + i + "]" + nums[i]);  // 確認用出力
    // }

    // // numが出力されるか検証用。0になったのをみるあたり、計算してnumsにしたからnumの値が上書きされていってなくなったのかも？
    // // System.out.println(num);

    // // なぜか合致するときに0が出力されてしまう。(numの値が定義されていないことになってる？)
    // if (nums[0] == nums[1] && nums[0] == nums[2] && nums[0] == nums[3]) {
    //   // System.out.println("nums[0]" + "nums[1]" + "nums[2]" + "nums[3]");
    //   System.out.println("" + nums[0] + nums[1] + nums[2] + nums[3]);
    // } else {
    //   System.out.println("No");
    // }
    // // if (nums[0] == nums[3]) {
    // //   System.out.println("Yes");
    // // } else {
    // //   System.out.println("No");
    // // }
  }
}
