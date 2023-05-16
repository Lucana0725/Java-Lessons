import java.util.*;
public class D024 {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("三角形のとある角の角度を求めるプログラムです。");
        System.out.println("最初に2つ、角度を入力してください。");
        
        int radius1 = sc.nextInt();
        int radius2 = sc.nextInt();
        int radius3 = 180 - (radius1 + radius2);

        System.out.println("求める角度は" + radius3 + "°です。");
    }

}
