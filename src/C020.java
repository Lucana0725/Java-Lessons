import java.util.*;
public class C020 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("仕入れ量、仕入れ量に対して販売できた量の割合、売れ残りに対して更に販売できた量の割合 の３つの数を、半角スペース区切りで入力してください。");

    int m = sc.nextInt();  // 仕入れ量m(kg)
    int p = sc.nextInt();  // 仕入れ量mに対する、販売できた量p(パーセンテージ)
    int q = sc.nextInt();  // 売れ残った量に対して販売できた量q(パーセンテージ)
    
    // m, p, qに対してちゃんと受け取れているかの確認用
    // System.out.println(m);
    // System.out.println(p);
    // System.out.println(q);

    
  }
}
