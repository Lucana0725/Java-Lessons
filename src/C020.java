// import java.util.*;
// import java.math.BigDecimal;

// public class C020 {
//   public static void main(String[] args) throws Exception {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("仕入れ量、仕入れ量に対して販売できた量の割合、売れ残りに対して更に販売できた量の割合 の３つの数を、半角スペース区切りで入力してください。");

//     // 与えられるp, qはパーセンテージであり、計算で小数を扱う必要があるので、受け取り値はdouble型になる。(じゃないと小数点以下が0になる)
//     int m = sc.nextInt();  // 仕入れ量m(kg)
//     int p = sc.nextInt();  // 仕入れ量mに対する、販売できた量p(パーセンテージ)
//     int q = sc.nextInt();  // 売れ残った量に対して販売できた量q(パーセンテージ)
    
//     // m, p, qに対してちゃんと受け取れているかの確認用
//     // System.out.println(m);
//     // System.out.println(p);
//     // System.out.println(q);

//     // 最終的にいくら売れ残ったかの計算。
//     // まずは仕入れ量からどれだけ売れ残ったか(x)を計算。
//     // そのためにまずはpの数値を、小数に変換する
//     double pPer = (double) p / 100;  // 0.8
//     // System.out.println(pPer);
//     // double x = m - (m * pPer);]
//     BigDecimal result = new BigDecimal(Integer.toString(m)).subtract(new BigDecimal(Double.toString(pPer)));
//     double x = result.doubleValue();
//     // System.out.println(x);  // 0.2


//     // System.out.println(x);
//     // xの結果が0.19999999999999996になってしまったので、String.format("%.1f, x")を用いて0.2と丸めてやる。
//     // System.out.println("売れ残り量は" + String.format("%.1f", x) + "kgです。");
    
//     // 次に売れ残ったxから売れた量(y)を計算。
//     double qPer = (double) q / 100;
//     BigDecimal result2 = new BigDecimal(Double.toString(x)).multiply(new BigDecimal(Double.toString(qPer)));
//     double y = result2.doubleValue();
//     // System.out.println(y);

//     BigDecimal result3 = new BigDecimal(Double.toString(x)).subtract(new BigDecimal(Double.toString(y)));
//     double ans = result3.doubleValue();
//     System.out.println(ans);

//   }
// }




// import java.util.*;
// import java.math.BigDecimal;

// public class C020 {
//   public static void main(String[] args) throws Exception {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("仕入れ量、仕入れ量に対して販売できた量の割合、売れ残りに対して更に販売できた量の割合 の３つの数を、半角スペース区切りで入力してください。");

//     // 与えられるp, qはパーセンテージであり、計算で小数を扱う必要があるので、受け取り値はdouble型になる。(じゃないと小数点以下が0になる)
//     int m = sc.nextInt();  // 仕入れ量m(kg)
//     int p = sc.nextInt();  // 仕入れ量mに対する、販売できた量p(パーセンテージ)
//     int q = sc.nextInt();  // 売れ残った量に対して販売できた量q(パーセンテージ)

//     // 計算イメージ
//     // 最初に売れ残った量x: x = m - (m * pPer)
//     // 次に売れ残った量y:   y = x - (x * qPer)

//     // まずは最初に売れ残った量xを計算する
//     double pPer = (double) p / 100;  // 0.8
//     System.out.println("最初に販売できた割合：" + pPer + "(百分率)");
    
//     // System.out.println(m * pPer);
//     double cell1 = m * pPer;
//     System.out.println(cell1);
//     BigDecimal result1 = new BigDecimal(Integer.toString(m)).subtract(new BigDecimal(Double.toString(cell1)));
//     double x = result1.doubleValue();
//     // System.out.println(x);

//     // 次は、２回目売れ残った量yの計算。
//     double qPer = (double) q / 100;
//     // double cell2 = x * qPer;  // 3.5880000000000005
//     BigDecimal cell2 = new BigDecimal(Double.toString(x)).multiply(new BigDecimal(Double.toString(qPer)));
//     // System.out.println(cell2);
//     double y = cell2.doubleValue();
//     // System.out.println(y);

//     // 最後に、xとyを使って求めたい売れ残りを計算する
//     // System.out.println(x-y);
//     BigDecimal ans = new BigDecimal(Double.toString(x)).subtract(new BigDecimal(Double.toString(y)));
//     System.out.println(ans);

//     // BigDecimal cell1 = new BigDecimal(Integer.toString(m)).multiply(new BigDecimal(Double.toString(pPer)));
//     // System.out.println("最初に販売できた量は" + cell1 + "kg");

//     // BigDecimal
//     // System.out.println("最初に売れ残った量：" + x + "kg");  // 0.2
    
//     // 次に売れ残ったxから売れた量(y)を計算。
//     // double qPer = (double) q / 100;
//     // System.out.println("次に販売した割合：" + qPer + "(百分率)");
//     // BigDecimal result2 = new BigDecimal(Double.toString(x)).multiply(new BigDecimal(Double.toString(qPer)));
//     // double y = result2.doubleValue();
//     // System.out.println("次に販売できた量" + y + "kg");  // 0.8

//     // BigDecimal result3 = new BigDecimal(Double.toString(x)).subtract(new BigDecimal(Double.toString(y)));
//     // double ans = result3.doubleValue();
//     // System.out.println("最終的に売れ残った量：" + ans);

//   }
// }







// import java.util.*;
// public class C020 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();
//         String[] lines = line.split(" ");

//         int[] inputs = new int[lines.length];
//         for (int i = 0; i < lines.length; i++) {
//             inputs[i] = Integer.parseInt(lines[i]);
//         }
//         double P_per = (double)inputs[1] / 100;
//         double Q_per = (double)inputs[2] / 100;
        
//         double X = inputs[0] - inputs[0] * P_per;
//         double Y = X - X * Q_per;
//         System.out.println(Y);
//     }
// }




// import java.math.BigDecimal;

// public class C020 {
//   public static void main(String[] args) throws Exception {
//     int m = 1;
//     int p = 80;

//     double pPer = (double) p / 100;
//     System.out.println(pPer);
    
//     BigDecimal result = new BigDecimal(Integer.toString(m)).subtract(new BigDecimal(Double.toString(pPer)));
//     System.out.println("計算結果" + result);

//   }
// }







// // デバッグ用
// import java.util.*;
// import java.math.BigDecimal;

// public class C020 {
//   public static void main(String[] args) {
//     // System.out.println(1 - 0.8);
//     // System.out.println(1.0 - 0.8);
//     BigDecimal result = new BigDecimal("1").subtract(new BigDecimal("0.8"));
//     double value = result.doubleValue();

//     System.out.println(value);
//     System.out.println(5 + value);
//   }
// }

// import java.util.*;

// public class C020 {
//   public static void main(String[] args) {
//     // int m = 1;
//     // int p = 80;
//     // int q = 40;

//     // double pPer = (double) p / 100;
//     // System.out.println(pPer);
//     System.out.println(1.5 + 0.8);
//     System.out.println(1.5 - 0.8);
//     System.out.println(1.5 * 0.8);
//     System.out.println(1.5 / 0.8);
//   }
// }

import java.util.*;
import java.math.BigDecimal;

public class C020 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("仕入れ量、仕入れ量に対して販売できた量の割合、売れ残りに対して更に販売できた量の割合 の３つの数を、半角スペース区切りで入力してください。");

    // 与えられるp, qはパーセンテージであり、計算で小数を扱う必要があるので、受け取り値はdouble型になる。(じゃないと小数点以下が0になる)
    int m = sc.nextInt();  // 仕入れ量m(kg)
    int p = sc.nextInt();  // 仕入れ量mに対する、販売できた量p(パーセンテージ)
    int q = sc.nextInt();  // 売れ残った量に対して販売できた量q(パーセンテージ)

    // 計算イメージ
    // 最初に売れ残った量x: x = m - (m * pPer)
    // 次に売れ残った量y:   y = x - (x * qPer)

    // まずは最初に売れ残った量xを計算する
    double pPer = (double) p / 100;  // 0.8
    
    // System.out.println(m * pPer);  // 3.1
    // double cell1 = m * pPer;
    BigDecimal sell = new BigDecimal(Integer.toString(m)).multiply(new BigDecimal(Double.toString(pPer)));
    // System.out.println(cell1);
    double sell1 = sell.doubleValue();
    BigDecimal result1 = new BigDecimal(Integer.toString(m)).subtract(new BigDecimal(Double.toString(sell1)));
    double x = result1.doubleValue();
    // System.out.println(x);

    // 次は、２回目売れ残った量yの計算。
    double qPer = (double) q / 100;
    // double cell2 = x * qPer;  // 3.5880000000000005
    BigDecimal result2 = new BigDecimal(Double.toString(x)).multiply(new BigDecimal(Double.toString(qPer)));
    double cell2 = result2.doubleValue();

    BigDecimal y = new BigDecimal(Double.toString(x)).subtract(new BigDecimal(Double.toString(cell2)));
    System.out.println(y);


  }
}