import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        // System.out.println("输入两个数得到最大值");
        // int num01 = input();
        // int num02 = input();
        // System.out.println(maxNum(num01, num02)); 

        // System.out.println("请输入您的姓名：");
        // String name = sn.next();
        // System.out.println("请输入您的年龄：");
        // int age = sn.nextInt();
        // System.out.println("请输入您的性别：");
        // String sex = sn.next();
        // System.out.println("请输入您的身高：");
        // double tall = sn.nextFloat();
        // System.out.println("请输入您的婚姻状况(是否单身：");
        // boolean single = sn.nextBoolean();
        // System.out.println("注册成功！");
        // System.out.println("姓名：" +name + "\n" + "年龄："+ age + "\n" + sex + "\n" + tall
        // + "\n" + single);

        // int arr[][] = {{11,22,33},{33,44,55}};
        // for(int i = 0 ; i< arr.length ; i++){
        // for(int j = 0 ; j < arr[i].length ; j++ ){
        // System.out.println(arr[i][j]);
        // }
        // }

        // int[] arr = new int[5];
        // // [I@10f87f48
        // System.out.println(arr);
        // for(int i = 0 ; i < 5; i++){
        // System.out.println(arr[i]);
        // }
        // byte[] bArr = new byte[3];
        // // [B@b4c966a
        // for(int i = 0 ; i < 3; i++){
        // System.out.println(bArr[i]);
        // }
        // System.out.println(bArr);

        // System.out.println("请输入一个三位数整数");
        // int num = sn.nextInt();
        // int gw=0 ,sw=0 ,bw=0;
        // gw = num % 10;
        // sw = num / 10 % 10;
        // bw = num / 100;
        // System.out.println("整数"+num+"的个位为："+gw);
        // System.out.println("整数"+num+"的十位为："+sw);
        // System.out.println("整数"+num+"的百位为："+bw);

        // System.out.println("请输入三角形的高");
        // int count = sn.nextInt();
        // dengyaosanjiao(count);

        // System.out.println("请输入一个成绩，判断是否为优秀：");
        // int sc = sn.nextInt();
        // // boolean select;
        // // if (sc >= 90 && sc <= 100) {
        // // System.out.println(select = true);
        // // } else {
        // // System.out.print(select = false);
        // // }

        // System.out.println("请输入三个数，得到最大值后会打印出去");
        // int num01 = sn.nextInt();
        // int num02 = sn.nextInt();
        // int num03 = sn.nextInt();
        // int num04 =num02 > num03 ? num02 : num03;
        // System.out.println(" \n " + (num01 > num04 ? num01 : num04) );

        // while (true) {
        // System.out.println("请输入成绩");
        // int num = sn.nextInt();
        // if (num >= 95 && num <= 100) {
        // System.out.println("Go for traveling!");
        // } else if (num >= 90 && num < 95) {
        // System.out.println("Go to park ! ");
        // } else if (num >= 80 && num < 90) {
        // System.out.println("Cartoon !");
        // } else if (num < 80 && num >= 0) {
        // System.out.println("Punishment");
        // } else {
        // System.out.println("ERROR! ");
        // continue;
        // }
        // System.out.println("Input 1 to continue:");
        // int ctn = sn.nextInt();
        // if(ctn == 1){
        // }
        // else{
        // break;
        // }
        // }

        // System.out.println("输入周几，确定做什么");
        // int np = sn.nextInt();
        // Zhouji(np);

        // Oushu.xunhuan();
        // sxhs();

    }

    public static void sxhs() {
        int i = 100, gw = 0, sw = 0, bw = 0, count = 0;
        while (i < 1000) {
            gw = i % 10;
            sw = i / 10 % 10;
            bw = i / 100;
            if (i == Math.pow(gw, 3) + Math.pow(sw, 3) + Math.pow(bw, 3)) {
                System.out.println(i + "  --这个数是水仙花数");
                count++;
            }
            i++;
        }
        System.out.println("一共有" + count + "个水仙花数");
    }

    public static void Zhouji(int sc) { // 100 ~ 102 行
        switch (sc) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("星期数字输入错误");
        }
        switch (sc) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("上班");
                break;
            case 6:
            case 7:
                System.out.println("休息");
                break;
            default:
                System.out.println("ERROR！");
        }
    }

    public static void dengyaosanjiao(int i) { // 56 ~ 58 行
        int j = 2 * i - 1;
        int k, l = 0;
        char arr[][] = new char[i][j];
        for (k = 0; k < i; k++) {
            int count = (k + 1) * 2 - 1; // 计算行的 * 数目
            int start = (j - count) / 2; // 计算每行 * 开始的位置
            for (l = 0; l < j; l++) {
                if (l >= start && l < (count + start)) {
                    arr[k][l] = '*';
                } else {
                    arr[k][l] = ' ';
                }
            }
        }
        System.out.println("k = " + k + "\n l = " + l);
        for (i = 0; i < k; i++) {
            for (j = 0; j < l; j++) {
                System.out.print(arr[i][j]);
            }
        System.out.println("");
        }
    }

    public static int maxNum(int i, int j) {
        return i > j ? i : j;
    }
    public static int input(){
        Scanner sco = new Scanner(System.in);
        int a = sco.nextInt();
        return a ;
    }

}

// class Oushu {
//     static void xunhuan() {
//         int sum = 0;
//         for (int i = 1; i <= 100; i++) {
//             sum += ((i % 2 == 0) ? i : 0);
//         }
//         System.out.println(sum);
//     }

// }
