    import java.util.Scanner;

    public class Fib {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            System.out.println(Fib(n));
        }

        public static int Fib(int n) {
            if(n == 1 || n == 2) {
                return 1;
            }
            return Fib(n-1)+Fib(n-2);
        }
    }
