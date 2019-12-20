package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class PR1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= tc; i++) {
			list.clear();
			int N = Integer.parseInt(br.readLine());
			if (5 <= N || N <= 50) {
				String NC = br.readLine();
				StringTokenizer st = new StringTokenizer(NC);
				for (int j = 0; j < N; j++) {
					list.add(Integer.parseInt(st.nextToken()));
				}
				Collections.sort(list);
				System.out.print("#" + i + " ");
				for (int j = 0; j < N; j++) {
					System.out.print(list.get(j) + " ");
				}
				System.out.println();
			}
		}
	}

}
