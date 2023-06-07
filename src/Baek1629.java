import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1629 {



    public static final int INF = 100000000;

    public static long pow(long a, long b, long c) {
        if(b == 1) { //1. b가 1이라면, a를 c로 나눈 나머지를 리턴
            return a%c;
        }

        //2. b를 2로 나눈 몫을 구함,
        //pow(a, b/2, c)를 호출하여 재귀적으로 a^(b/2)를 c로 나눈 나머지를 구함
        long temp = pow(a,b/2,c);


        if(b%2 == 1) { //3. b가 홀수라면

            //3-1. a^(b/2)를 c로 나눈 나머지를 temp에 저장한 뒤, temptempa를 c로 나눈 나머지를 리턴
            return temp*temp%c*a%c;
        }
        //3-2. 홀수가 아니면 a^(b/2)를 c로 나눈 나머지를 temp에 저장한 뒤, temp*temp를 c로 나눈 나머지를 리턴
        return temp*temp%c;
    }

    //사용자로부터 정수를 입력받고 pow 메서드를 호출하여 결과값을 출력
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b,c));
    }


}
