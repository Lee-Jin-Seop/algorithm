import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int i = 0;
		int j = n - 1;
		int cnt = 0;
		while (i < j) {
			if (arr[i] + arr[j] < m) {
				i++;
			} else if (arr[i] + arr[j] > m) {
				j--;
			} else {
				i++;
				j--;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}