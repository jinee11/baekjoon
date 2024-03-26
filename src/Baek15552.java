import java.io.*;
import java.util.StringTokenizer;

public class Baek15552 {

        public static void main(String[] args) throws IOException, IOException {

            //입력스트림으로부터 데이터를 읽어오기 위한 객체 /인풋스트림을 통해 표준 입력스트림과 연결
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //버퍼라이터를 사용하여 결과를 출력하는 객체 /아웃스트림을 통해 표준 줄력스트림과 연결
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //테스트 케이스의 갯수(for문에서 몇번 반복할지)
            int t = Integer.parseInt(br.readLine());

            //for문을 돌면서 버퍼에 데이터를 담아둔다
            for (int i = 0; i < t; i++) {

                //1-2. 읽어온 라인을 공백 문자로 분할하여 st에 저장 /1-1.br.readLine()을 사용하여 다음 라인(t다음부터)의 입력을 읽어옴
                StringTokenizer st = new StringTokenizer(br.readLine());
                //2. st.nextToken()을 사용하여 분할된 문자열에서 첫번째 정수를 추출하여 a에 저장
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                //3. a+b 정수를 합치고 줄바꿈
                bw.write((a + b) + "\n");
            }

            br.close(); //닫기
            bw.flush(); //버퍼에 있는 데이터를 출력스트림으로 전송하여 모두 출력
            bw.close(); //닫기
        }
}
