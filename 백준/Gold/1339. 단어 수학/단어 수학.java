import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int[] alphabet = new int[26];

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        for(int i=0; i<arr.length; i++){
            int temp = (int)Math.pow(10, arr[i].length()-1);
            for(int j=0; j<arr[i].length(); j++){
                alphabet[(int)arr[i].charAt(j)-'A']+=temp;
                temp /= 10;
            }
        }

        Arrays.sort(alphabet);

        int index = 9;
        int sum =0;
        for(int i=alphabet.length-1; i>=0; i--){
            if(alphabet[i] == 0){
                break;
            }
            sum+= alphabet[i]*index;
            index--;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();

    }
}
