import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int num = reader.nextInt();
            System.out.println(sum(num));
        }
    }
    //дһ���ݹ鷽��������һ���Ǹ����������������������֮��
    public static int sum(int num) {
        if(num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
}
