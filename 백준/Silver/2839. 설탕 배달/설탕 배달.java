import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        if (N == 4 || N == 7) {
			answer = -1;
		}
		else if (N % 5 == 0) {
			answer = N / 5;
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			answer = (N / 5) + 1;
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			answer = (N / 5) + 2;
		}

        bw.write(String.valueOf(answer));
        bw.flush();
        br.close();
        bw.close();
        

    }
}
