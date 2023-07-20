import java.util.Scanner;

public class GongyueShu {
    public static void main(String[] args) {
        // 求 a 和 b 的最大公约数
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        System.out.println("请输入数字a：");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        System.out.println("请输入数字b：");

        b = num.nextInt();
        d = Math.max(a, b);
        e = Math.min(a, b);
        if (a == 0 || b == 0) {
            System.out.println("ERROR!");
        } else if (a == b && a != 0 && b != 0) {
            System.out.println("最大公约数为:" + a);
        } else if (a != b && a != 0 && b != 0) {
            for (int i = 0; i <= 5; i++) {
                c = (d % e);
                d = e;
                e = c;
                if (e == 0) {
                    break;
                }
            }
            System.out.println("最大公约数为：" + d);
        }
        System.out.println();
    }
}
