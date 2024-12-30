import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt = 1;
		int i = 0;
		int j = 0;

		while (j < n) {
			if (sum < n) {
				sum += ++j;
			} else if (sum > n) {
				sum -= i++;
			} else {
				sum += ++j;
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}