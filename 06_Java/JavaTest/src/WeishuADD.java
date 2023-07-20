import java.util.* ;
public class WeishuADD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int i=0,j=0,k=0,nav=0,sum=0;
        nav = num;
        for(j=16 ; j > 0 ;j--){
            num /= 10;
            i++;
            if(num == 0){
                break;
            }
        }
        for( ; i>0 ; i--){
            k = (int) (( (int) (nav / Math.pow(10,i-1)) ) % 10);
            sum += k;
            System.out.println("第"+ i +"位为"+k);
        }
        System.out.println("每个位数求和的结果为=" + sum);
    }
}
