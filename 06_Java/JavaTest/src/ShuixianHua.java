import java.util.*;
public class ShuixianHua {
    public static void main(String[] args){  //创建对象
//        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 5 位 所有的水仙花数：");
//        int scan = sc.nextInt();

        int gw=0,sw=0,bw=0,qw=0,ww=0,scan=0,j=0;
//        gw = scan % 10;
//        sw = scan / 10 % 10;
//        bw = scan / 100 % 10;
//        qw = scan / 1000 % 10;
//        ww = scan / 10000 % 10;

//        for(int i = 10; i > 0 ; i--){
//            num = num / 10;
//            j++;
//            if(num == 0 ){
//                break;
//            }
//        }
        for(int i = 1;i<100000;i++) {

            gw = i % 10;
            sw = i / 10 % 10;
            bw = i / 100 % 10;
            qw = i / 1000 % 10;
            ww = i / 10000 ;

            if (i>0 && i<10) {
                System.out.println(i);
                j++;
            } else if ( i >= 10 && i<100 && i == Math.pow(gw, 2) + Math.pow(sw, 2)) {
                System.out.println(i);
                j++;
            } else if ( i >= 100 && i<1000 && i == Math.pow(gw, 3) + Math.pow(sw, 3) + Math.pow(bw, 3)) {
                System.out.println(i);
                j++;
            } else if ( i >= 1000 && i<10000 && i == Math.pow(gw, 4) + Math.pow(sw, 4) + Math.pow(bw, 4) + Math.pow(qw, 4)) {
                System.out.println(i);
                j++;
            } else if ( i >= 10000 && i<100000 && i == Math.pow(gw, 5) + Math.pow(sw, 5) + Math.pow(bw, 5) + Math.pow(qw, 5) + Math.pow(ww, 5)) {
                System.out.println(i);
                j++;
            }
        }
        System.out.println("水仙花的总数为：" + j );

    }
}





//  if (j == 1) {
//          System.out.println(scan);
//          } else if (j == 2 && scan == Math.pow(gw, 2) + Math.pow(sw, 2)) {
//          System.out.println(scan);
//          } else if (j == 3 && scan == Math.pow(gw, 3) + Math.pow(sw, 3) + Math.pow(bw, 3)) {
//          System.out.println(scan);
//          } else if (j == 4 && scan == Math.pow(gw, 4) + Math.pow(sw, 4) + Math.pow(bw, 4) + Math.pow(qw, 4)) {
//          System.out.println(scan);
//          } else if (j == 5 && scan == Math.pow(gw, 5) + Math.pow(sw, 5) + Math.pow(bw, 5) + Math.pow(qw, 5) + Math.pow(ww, 5)) {
//          System.out.println(scan);
//          }