import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //����һ�� int ���͵�����, Ԫ�ظ���Ϊ 100, ����ÿ��Ԫ����������Ϊ 1 - 100
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
