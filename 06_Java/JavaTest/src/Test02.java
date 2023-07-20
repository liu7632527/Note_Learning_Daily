import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num01 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int num02 = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int num03 = sc.nextInt();
        paiXu(num01, num02, num03);

    }

    public static void paiXu(int i, int j, int k) {
        int sum = i + j + k;
        int max = (i > j ? i : j) > k ? (i > j ? i : j) : k;
        int min = (i < j ? i : j) < k ? (i < j ? i : j) : k;
        int mid = sum - max - min;
        // int temp1 = i > j ? i : j;
        // int max = temp1 > k ? temp1 : k;
        // int temp2 = i < j ? i : j;
        // int min = temp2 < k ? temp2 : k;
        // int mid = i + j + k - max - min;
        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);
    }

}

// System.out.print("输入一个数，判断是不是回文数字：");
// int input = sn.nextInt();
// boolean panduan = false;
// int wei = 0, quanzhi = 0, temp = input, sum = 0 , i = 0 , j = 0 , k = 0 ;

// for(i = 0 ; i < 100 ; i++) {
// input = input / 10;
// quanzhi++;
// if (input == 0) {
// break;
// }
// } //计算出位数 quanzhi

// for (j = quanzhi ; j > 0; j--) {
// wei = (temp / (int)Math.pow(10, j - 1) % 10 * (int)Math.pow(10, k));
// k++;
// sum += wei;
// }
// if (sum == temp) {
// System.out.println(panduan = true);
// } else {
// System.out.println(panduan);
// }

// Scanner sc = new Scanner(System.in);
// System.out.print("请输入被除数：");
// int dividend = sc.nextInt();
// System.out.print("请输入除数：");
// int divisor = sc.nextInt();
// int count = 0;
// if (divisor != 0) {
// while (true) {
// dividend -= divisor;
// count++;
// if (dividend < divisor) {
// break;
// }
// }
// System.out.println("商为" + count + "\n余数为" + dividend);
// } else {
// System.out.println("除数不能为0！ ");
// }

// Scanner sn = new Scanner(System.in);
// System.out.print("请输入一个整数：");
// int num = sn.nextInt();
// int wei = weiShu(num);
// System.out.println(num + "是" + wei + "位数字");
// }

// public static int weiShu(int i) {
// int j = 0;
// while (true) {
// i /= 10;
// j++;
// if (i == 0) {
// break;
// }
// }
// return j;
// }