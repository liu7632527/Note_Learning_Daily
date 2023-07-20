public class Chengfabiao {
    public static void Calc() {
        //9 x 9 乘法表
    int i,j;
        for(j = 1; j <10 ; j++){
        for (i = 1; i <= j; i++) {
        System.out.print(i + "x" + j + "=" + i*j + " ");
        }
        System.out.println();
        }
    }
}
