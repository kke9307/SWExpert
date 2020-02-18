package Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedyAlgorithm {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int change[] = { 500, 250, 100, 50, 10 };
		int count [] = new int [change.length+1];
		int money = Integer.parseInt(br.readLine());
		int i = 0;
		while(money != 0 ) {// 거스름돈을 많이 준 경우
			if(money < 0) {
				count[i]--;
				money += change[i++];
			}
			else {
				count[i]++;
				money -= change[i];
				System.out.println("i : "+i+"current money : "+money);
			}
			
		}
		for(i = 0 ; i < 5 ; i ++) {
			System.out.format("#%d %d %d\n",i, change[i], count[i]);
		}

	}
}
