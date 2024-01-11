import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
            // 백준 18108 번
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           
           System.out.println(Integer.parseInt(br.readLine()) - 543);

           br.close();
    }

}