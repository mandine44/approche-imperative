package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = { 3, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 3 };
		boolean bool = false;

		if (array.length > 0 && array[0] ==  array[array.length - 1]) {
			bool = true;
		}

		System.out.println(bool);

	}

}
