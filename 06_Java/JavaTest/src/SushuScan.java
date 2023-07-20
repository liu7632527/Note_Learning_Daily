public class SushuScan{
    public static void main(String[] args) {
    int i,j,N=2;
       System.out.println(N);
       for(i=1;i<=50;i++){
           for(j=3;j<100;j+=2){
               N=2*i-1;
               if(N % j ==0 ){
                   break;
               }
           }
           if(N==j){
               System.out.println(N);
           }
       }
    }
}

//    int i,j;                      //素数
//        for(j=100;j>0;j--){           //1 ~ 100 每个数都尝试一遍
//                for(i=2;i<=j;i++){        //从2开始 对j进行相除
//                if( j % i == 0 ){     //如果出现非自身外的因数，则跳出i自增的循环
//                break;
//                }
//                }
//                if(j==i)                   //如果j的因数是除了1之外的自身，则这个数就是素数
//                {
//                System.out.println(j);     //输出这个素数
//                }
//                }

