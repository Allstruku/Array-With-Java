import java.util.Arrays;

public class arrayWithJava {
// Array에 넣을 값이 많다면, 반복적으로 operand를 넣을 수 있는 for loop statement를 사용하면된다

	public static void main(String[] args) {
		int[] iarray = new int[100];
		//"iarray"라는 100 크기의 배열을 새로 만들었
		for(int i = 0; i < iarray.length; i ++) {
			// 윗 for문에 있는 iarray.length는 배열의 크기를 출력해주는 코드로 배열명.length를 붙이면 된다
			iarray[i] = i + 1;
			// iarray의 0 index에는 1, 1 index에는 2, 2 index에는 3 식으로 넣는 식이다
		}
		System.out.println(Arrays.toString(iarray));

// 밑의 코드는 0번 index부터 100번 index의 값을 더해준다 (sum)
		int[] array = new int[100];
		int totalvalue = 0;
		for(int i = 0; i < array.length; i ++) {
			array[i] = i + 1;
			totalvalue = array[i] + totalvalue;
		}
		System.out.println(totalvalue);
		
	}

}
