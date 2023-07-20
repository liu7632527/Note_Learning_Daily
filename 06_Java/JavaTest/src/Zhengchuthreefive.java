import java.util.*;
public class Zhengchuthreefive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, i = 1, j = 0;
        System.out.print("请输入第一个数:");
        int put1 = input.nextInt();    
        System.out.print("请输入第二个数:");
        int put2 = input.nextInt();
        
        int max = put1 > put2 ? put1 : put2;
        int min = put1 < put2 ? put1 : put2;
        
        for(i = min ; i <= max ; i++ ){
            num = i;
            if (num % 3 == 0 && num % 5 == 0) {
                j++;
                System.out.println(num);
            }
        }
       
        System.out.println("一共有" + j + "个数");

        
        // int stunum = 100;
        // double goodsprice = 55.55;
        // String age = "4600000000";
        // boolean detail = false;
        // System.out.print(stunum+"\n"+goodsprice+"\n"+age+"\n"+detail);
        // Scanner input = new Scanner(System.in);
        // System.out.print("请输入姓名：");
        // String name = input.next();
        // System.out.print("请输入性别(男/女)：");
        // String sex = input.next();
        // System.out.print("请输入年龄：");
        // int age = input.nextInt();
        // System.out.print("请输入地址：");
        // String address = input.next();
        // System.out.print("请输入饭卡余额：");
        // double leftmoney = input.nextDouble();
        
        // for(int i = 0; i<25 ; i++){
        //     System.out.print("*");
        // }
        
        // System.out.println(
        //     "\n"+
        //     "我的姓名是：" + name + "\n" +
		// 	"我的性别是：" + sex + "\n" +
		// 	"我的年龄是：" + age +"岁\n" +
		// 	"我的地址是：" + address + "\n" +
		// 	"我的饭卡余额是：" + leftmoney + "元\n"                 
        //  );
        
        //     for(int i = 0; i<25 ; i++){
        //     	System.out.print("*");
        // 	}
    }
}
