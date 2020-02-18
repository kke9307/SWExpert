package Learn;

public class Binary_search2 {
	int binary_search(int arr[], int num, int key) {
		int up, down, mid;
		down = 0;
		up = num - 1;
		for (;;) {
			mid = (down + up) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] > key) {
				up = mid - 1;
			} else {
				down = mid + 1;
			}

			if (up < down) {
				return -1;
			}
		}
	}

	public static void main(String[] args) {

		Binary_search2 ba = new Binary_search2();
		int arr[] = { 2, 4, 7, 9, 11, 19, 23 };
		int num = arr.length;
		int key = 7;
		System.out.println(ba.binary_search(arr, num, key)+1+" 번째에 있습니다.");
	}

}
