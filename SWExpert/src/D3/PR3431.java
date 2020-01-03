package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR3431 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int answer = 0;
			String LUX[] = br.readLine().split(" ");
			if (Integer.parseInt(LUX[0]) <= Integer.parseInt(LUX[2])
					&& Integer.parseInt(LUX[2]) <= Integer.parseInt(LUX[1])) {
				answer = 0;
			}
			else if(Integer.parseInt(LUX[0]) <= Integer.parseInt(LUX[2])
					&& Integer.parseInt(LUX[1]) <= Integer.parseInt(LUX[2])) {
				answer = -1;
			}
			else if(Integer.parseInt(LUX[2]) <= Integer.parseInt(LUX[0])
					&& Integer.parseInt(LUX[2]) <= Integer.parseInt(LUX[1])) {
				answer = Integer.parseInt(LUX[0])-Integer.parseInt(LUX[2]);
			}
			System.out.format("# %d %d \n",i,answer);
		}
	}

}
