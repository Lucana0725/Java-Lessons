import java.util.*;
public class D024 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
			System.out.println("三角形のとある角の角度を求めるプログラムです。");
			// System.out.println("最初に2つ、角度を入力してください。");
			System.out.println("角A、角Bの2つの角度を入力してください。");
			System.out.println("まずは角Aの角度を入力してください。ただし、0 < A < 179 とします。");
			
			int radius1 = sc.nextInt();
			if (radius1 <= 0 || radius1 > 178) {
					System.out.println("不正な値が入力されました。");
					System.out.println("処理を中断します。");
			} else {
				System.out.println("次に、角Bの値を入力してください。ただし、0 < B < " + (180 - radius1) + " とします。");
				int radius2 = sc.nextInt();
				if (radius2 <= 0 || (radius1 + radius2) >= 180) {
						System.out.println("不正な値が入力されました。");
						System.out.println("処理を中断します。");
						return;
				}
				int answer = 180 - (radius1 + radius2);

				System.out.println("求める角Cの角度は" + answer + "°です。");
		}

	}




    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("三角形のとある角の角度を求めるプログラムです。");
    //     System.out.println("最初に2つ、角度を入力してください。");
        
    //     int radius1 = sc.nextInt();
    //     int radius2 = sc.nextInt();
    //     int radius3 = 180 - (radius1 + radius2);

    //     System.out.println("求める角度は" + radius3 + "°です。");
    // }

}
