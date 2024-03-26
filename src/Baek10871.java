import java.io.IOException;
import java.util.Scanner;

public class Baek10871 {

        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); //n : 배열의 크기와 배열 a를 이루는 정수
            int x = sc.nextInt(); //x : 정수와 비교할 값
            int a[] = new int[n]; //크기가 n인 배열 a선언

            for(int i = 0; i < n; i++){//n개의 정수를 입력받고 각 정수를 배열a에 저장
                a[i] = sc.nextInt();
            }

            sc.close();

            for(int i = 0; i < n; i++){ //배열 a를 처음부터 반복
                if(a[i] < x){ //배열 a를 반복하면서 x보다 작은 값일 경우 출력
                    System.out.print(a[i]+" ");
                }
            }

        }

}
