package demo.stringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class SystemDemo {
	public static void output(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.arraycopy(src, srcPos, dest, destPos, length);
		// System.arraycopy方法效率比Array.copyOf的效率高
		// Arrays.copyOf(original, newLength);

		int[] array = new int[5];

		// 填充数组

		Arrays.fill(array, 5);

		System.out.println("填充数组：Arrays.fill(array, 5)：");

		SystemDemo.output(array);

		// 将数组的第2和第3个元素赋值为8

		Arrays.fill(array, 2, 4, 8);

		System.out.println("将数组的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：");

		SystemDemo.output(array);

		int[] array1 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };

		// 对数组的第2个到第6个进行排序进行排序

		Arrays.sort(array1, 2, 7);

		System.out.println("对数组的第2个到第6个元素进行排序进行排序：Arrays.sort(array,2,7)：");

		SystemDemo.output(array1);

		// 对整个数组进行排序

		Arrays.sort(array1);

		System.out.println("对整个数组进行排序：Arrays.sort(array1)：");

		SystemDemo.output(array1);

		// 比较数组元素是否相等

		System.out.println("比较数组元素是否相等:Arrays.equals(array, array1):" + "\n"
				+ Arrays.equals(array, array1));

		int[] array2 = array1.clone();

		System.out.println("克隆后数组元素是否相等:Arrays.equals(array1, array2):" + "\n"
				+ Arrays.equals(array1, array2));

		// 使用二分搜索算法查找指定元素所在的下标（必须是排序好的，否则结果不正确）

		Arrays.sort(array1);

		System.out.println("元素3在array1中的位置：Arrays.binarySearch(array1, 3)："
				+ "\n" + Arrays.binarySearch(array1, 3));

		// 如果不存在就返回负数

		System.out.println("元素9在array1中的位置：Arrays.binarySearch(array1, 9)："
				+ "\n" + Arrays.binarySearch(array1, 9));

	}
	
	//关于数组的equals方法与deepEquals方法
	/**
	 * 1、deepEquals用于判定两个指定数组彼此是否深层相等，此方法适用于任意深度的嵌套数组。

        2、equals用于判定两个数组是否相等，如果两个数组以相同顺序包含相同元素，则返回true，否则返回false。

        3、通过比对“代码一”和“代码二”我们可以得出这样一个结论：如果两个数组使用equals返回true，则使用deepEquals也返回true，
        	也就是说在比较的两个数组均为一维数组的前提下，equals和deepEquals的比较结果没有差别；

        4、如果要比较多为数组，则需要使用deepEquals方法；
	 */
	public static void testEquals(){
		String[][] name1 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};  
        String[][] name2 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};  
  
        System.out.println(Arrays.equals(name1, name2));    // false  
        System.out.println(Arrays.deepEquals(name1, name2));// true  
        
        String[] name3 = {"G","a","o","H","u","a","n","j","i","e"};  
        String[] name4 = {"G","a","o","H","u","a","n","j","i","e"};  
        System.out.println(Arrays.equals(name3, name4));      // true  
        System.out.println(Arrays.deepEquals(name3, name4));  // true  
	}

}
