//ʵ��һ������ printArray, ������Ϊ����, ѭ�����������е�ÿ��Ԫ��, ��ӡÿ��Ԫ�ص�ֵ.

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {3,4,5,2,6,7,10,9};
        printArray(array);

    }
    public static void printArray(int[] array) {
        for (int x:
             array) {
            System.out.println(x);
        }
    }
}
