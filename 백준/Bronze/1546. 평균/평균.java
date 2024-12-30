import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			max = Math.max(max, score);
			sum += score;
		}

		System.out.println(sum * 100.0 / max / n);
	}
}