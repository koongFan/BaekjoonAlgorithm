import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());
        int reward;

        if(firstDice == secondDice && firstDice == thirdDice){
            reward = 10000 + (firstDice*1000);
        }
        else if((firstDice == secondDice && firstDice != thirdDice) || (secondDice == thirdDice &&  secondDice != firstDice) || (firstDice == thirdDice &&  secondDice != firstDice)){
            if(firstDice == secondDice || firstDice == thirdDice){
                reward = 1000 + (firstDice*100);
            }
            else{
                reward = 1000 + (secondDice*100);
            }
        }
        else{
            reward = Math.max(firstDice, Math.max(secondDice, thirdDice))*100;
        }
        bw.write(String.valueOf(reward));
        br.close();
        bw.flush();
        bw.close();
     }



}