package File_01;

/**
 * @author Gt_boy
 * @description: TODO 1~n的和
 * @date 2023/11/16 21:44
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(recursion(100));
    }


    public static int recursion(int n){
        if(n==1){
            return n;
        }else {
            return recursion(n-1)+n;
        }
    }
}
