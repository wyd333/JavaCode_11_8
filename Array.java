import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] array = new int[100];
        for (int i = 1; i <= array.length; i++) {
            array[i-1] = i;
        }
/*        for (int x : array
             ) {
            System.out.println(x);
        }*/
        System.out.println(Arrays.toString(array));
    }
}
