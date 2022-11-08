import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int num = reader.nextInt();
            System.out.println(sum(num));
        }
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sum(int num) {
        if(num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
}
