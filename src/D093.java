import java.util.*;
public class D093 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("ゾロ目の場合、その数字が出力されます。そうでない場合は'No'が出力されます。");
    System.out.println("4桁の数字を入力してください。");

    // String[] input = sc.nextLine().split("");  // 入力値をString型として受け、一文字ずつに分解。
    String input = sc.nextLine();
    String[] nums = input.split("");
    // System.out.println(Arrays.toString(nums));  // 入力値がちゃんと配列になってるか確認用

    if (nums[0].equals(nums[1]) && nums[0].equals(nums[2]) && nums[0].equals(nums[3])) {
      System.out.println(input);
    } else {
      System.out.println("No");
    }
  }
}
