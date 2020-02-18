package Learn;

public class Array_Bit_Subset {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = 3;
		bit(arr, n);
		System.out.println(1 << n);
	}

	static void bit(int[] arr, int n) {
		for (int i = 0; i < 1 << n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i & 1 << j) != 0)
					System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
