package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2056 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			String tc = br.readLine();
			String year = tc.substring(0, 4);
			String month = tc.substring(4, 6);
			String day = tc.substring(6, 8);
			if (month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07")
					|| month.equals("08") || month.equals("10") || month.equals("12")) {
				if (Integer.parseInt(day) > 31 || day.equals("00")) {
					System.out.println("#" + i + " -1");
				} else {
					System.out.println("#" + i + " " + year + "/" + month + "/" + day);
				}
			} else if (month.equals("04") || month.equals("06") || month.equals("09") || month.equals("11")) {
				if (Integer.parseInt(day) > 30 || day.equals("00")) {
					System.out.println("#" + i + " -1");
				} else {
					System.out.println("#" + i + " " + year + "/" + month + "/" + day);
				}
			} else if (month.equals("02")) {
				if (Integer.parseInt(day) > 28 || day.equals("00")) {
					System.out.println("#" + i + " -1");
				} else {
					System.out.println("#" + i + " " + year + "/" + month + "/" + day);
				}
			} else if (month.equals("00")) {
				System.out.println("#" + i + " -1");
			}
		}
	}

}
