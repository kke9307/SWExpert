package Learn;

import java.io.IOException;
import java.util.Scanner;

public class Array_gravity {
	static final int BOX = 1;
	static final int EMPTY = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[][] room = new int[100][100];
		int testCase;// 입력받을 테스트 케이스
		int T;// 테스트 케이스 변수
		int i, j, k;// 빅오 n^3
		int roomWidth;// 방의 너비
		int roomHeight;// 방의 높이
		int boxHeight;// 상자가 쌓인 높이
		int maxFallen;// 최대 낙차 크기
		int countEmptySpace;// 빈 공간의 갯수

		testCase = sc.nextInt();

		for (T = 0; T < testCase; T++) {
			roomWidth = sc.nextInt();
			roomHeight = sc.nextInt();
			for (i = 0; i < roomWidth; i++) {
				for (j = 0; j < roomHeight; j++) {
					room[i][j] = EMPTY;// room을 0으로 초기화
				}
			}
			maxFallen = 0; // 최대 낙차 크기 초기화

			for (i = 0; i < roomWidth; i++) {// 회전 시켜서 저장하기
				boxHeight = sc.nextInt();
				for (j = 0; j < boxHeight; j++) {// 높이가 0 이면 생략 높이대로 j 찍힘
					room[i][j] = BOX;
					// System.out.print(room[i][j]+" ");
				}
				// System.out.println();
			}

			for (i = 0; i < roomWidth; i++) { // 각 낙상의 차를 구하기
				for (j = 0; j < roomHeight; j++) {
					// room[i][j]가 박스일 때, 빈칸의 개수를 셈으로 써 낙차를 구한다.
					if (room[i][j] == BOX) { // room[i][j]가 박스일때 조건 탐
						countEmptySpace = 0; // 빈 공간 카운트 초기화
						for (k = i + 1; k < roomWidth; k++) { // 박스 밑칸으로 내려가 회전했기 때문에 width
							if (room[k][j] == EMPTY) {// 밑에 칸이 EMPTY 면
								countEmptySpace += 1; // 카운트 증가
							}
						}
						if (countEmptySpace > maxFallen) {
							maxFallen = countEmptySpace; // 최대 낙차
						}
					}
				}
				
			}
			System.out.println(maxFallen);
		}
	}
}
