package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2007_복습하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			String str = br.readLine().trim();
			
			int wavelength = 0;
			for (int j = 1; j < str.length(); j++) {
				String grx = str.substring(0, j);
				String grxpttn = str.substring(j, j + j);
				if (grx.equals(grxpttn)) {
					wavelength = j;
					break;
				}
			}
			System.out.format("#%d %d\n", i, wavelength);
		}
	}

}
