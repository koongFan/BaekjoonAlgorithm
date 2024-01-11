import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
            // 백준 2588 번
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st = new StringTokenizer(br.readLine());

        // int firstValue = Integer.parseInt(st.nextToken());
        // String secondValue =  st.nextToken();

        // bw.write(firstValue*Character.getNumericValue(secondValue.charAt(secondValue.length()-1)) + "\n" + firstValue*Character.getNumericValue(secondValue.charAt(secondValue.length()-2))+ "\n" + firstValue*Character.getNumericValue(secondValue.charAt(secondValue.length()-3)) + "\n" + firstValue*Integer.parseInt(secondValue) );

        // bw.flush();
        // bw.close();
        // br.close();
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = String.valueOf(sc.nextInt());

        System.out.println(A*Character.getNumericValue(B.charAt(B.length()-1)));
        System.out.println(A*Character.getNumericValue(B.charAt(B.length()-2)));
        System.out.println(A*Character.getNumericValue(B.charAt(B.length()-3)));
        System.out.println(A*Integer.parseInt(B));
    }

}