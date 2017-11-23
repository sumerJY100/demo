package demo.stringDemo;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		for(int i=0;i<arr.length;i++){
			Arrays.fill(arr[i], 0);
		}
		for (int i = 1; i <= 9; i++) {
			arr[0][i-1] = i;
		}

		// 考虑第二行
		Integer[] tempArr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> tempList = Arrays.asList(tempArr);
		for (int i = 1; i <= 9; i++) {
			int temp = tempList.get((int) (Math.random() * tempList.size()));
			while (temp == arr[0][i-1]) {
				int location = (int) (Math.random() * tempList.size());
				location = location >=tempList.size()?(tempList.size() -1):location;
				temp = tempList.get(location);
				if (temp != arr[0][i-1]) {
					arr[1][i-1] = temp;
					System.out.println(location);
//					tempList.
					
					break;
				}
			}
		}
		printArr(arr);
	}

	public static void printArr(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println();
		}
	}
}
