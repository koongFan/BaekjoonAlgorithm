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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstValue = Integer.parseInt(br.readLine());
        String secondValue =  br.readLine();
            int firstOfSecondValue = Character.getNumericValue(secondValue.charAt(secondValue.length()-3));
            int secondOfSecondValue = Character.getNumericValue(secondValue.charAt(secondValue.length()-2));
            int thirdOfSecondValue = Character.getNumericValue(secondValue.charAt(secondValue.length()-1));

        bw.write(firstValue*thirdOfSecondValue 
                + "\n" 
                + firstValue*secondOfSecondValue
                + "\n" 
                + firstValue*firstOfSecondValue 
                + "\n" 
                + firstValue*Integer.parseInt(secondValue) 
                );

        bw.flush();
        bw.close();
        br.close();
    }

}