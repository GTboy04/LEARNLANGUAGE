package ThreadCreate;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 16:56
 */
public class Account {
    private int money;

    public Account() {
    }

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void drawMoney(int n) {
        Thread thread = Thread.currentThread();
        if (money>=n){
            System.out.println(thread.getName()+"前来取"+n+"元");
            money-=n;
            System.out.println(thread.getName()+"前来取后还剩"+money+"元");
        }else {
            System.out.println(thread.getName()+"钱不够你取几把");
        }

    }
}
