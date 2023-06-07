import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //test 케이스의 갯수
        long[] dp = new long[41];  //DP 배열 초기화
        StringBuilder sb = new StringBuilder();
        dp[1] = 1;//초기값 1저장

        //반복문을 통해 dp배열 계산(피보나치 수열을 계산하고 출력)
        for (int i = 2; i <= 40; i++) {
            dp[i] = dp[i-2] + dp[i-1]; //dp 배열을 채워넣는 과정
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            //0이면 1 0 출력
            if (n == 0) {//피보나치수열에서 0번째 항은 0이고, 1번째 항은 1이기 때문에 특별히 처리
                sb.append("1 0\n");
                continue;
            }
            sb.append(dp[n-1] + " " + dp[n] + "\n"); // 피보나치 수 계산 결과 출력
        }
        System.out.print(sb); //결과 출력
    }

}
