//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.

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
