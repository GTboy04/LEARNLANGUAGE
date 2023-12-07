package File_01;

/**
 * @author Gt_boy
 * @description: TODO 阶乘（递归）
 * @date 2023/11/16 20:54
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }

    public static int recursion(int n){
        if (n>1){
            return recursion(n-1)*n;
        }else {
            return 1;
        }
    }

}
