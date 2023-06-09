import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek17478 {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 사용자로부터 입력받은 n 값을 저장하고
        n = Integer.parseInt(br.readLine());


        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        recur(0, ""); //2. recur 함수를 호출

    }

    public static void recur(int depth, String under) {
//3. 현재 출력할 문자열의 깊이(depth)와 빈칸 문자열(under)을 매개변수로 받음
//        String under = "";
//        for (int i = 1; i <= depth; i++) {
//            under += "____";
//        }

        if (depth == n) {
            //4-1. 깊이가 n과 같아졌을 때 출력 후 종료
            System.out.println(under + "\"재귀함수가 뭔가요?\"");
            System.out.println(under + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(under + "라고 답변하였지.");
            return;

        }

        //4-2. n과 다를 경우 출력
        System.out.println(under + "\"재귀함수가 뭔가요?\"");
        System.out.println(under + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(under + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(under + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        //5. recur 함수를 다시 호출,depth를 1 증가시키고,
        //빈칸 문자열(under)에 "____"을 추가한 문자열을 매개변수로 받음
        recur(depth + 1, under + "____");

        //6. 마지막 출력후 종료
        System.out.println(under + "라고 답변하였지.");
    }

}
