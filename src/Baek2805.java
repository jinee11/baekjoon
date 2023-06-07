
import java.io.IOException;
import java.util.Scanner;

public class Baek2805 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); //나무의 수
        int M = in.nextInt(); //가져갈 나무의 길이

        int[] tree = new int[N]; //나무의 높이를 저장하기 위한 배열

        //이분 탐색을 시작하기 위한 범위 설정(나무 높이)
        int min = 0; //최소 설정
        int max = 0; //초기화

        //입력된 나무의 높이를 배열에 저장하고 최대 높이를 찾기
        for(int i = 0; i < N; i++) {
            tree[i] = in.nextInt(); //입력받은 나무 높이를 각 방에 저장

            if(max < tree[i]) { //입력받은 나무 높이가 max보다 크다면
                max = tree[i]; // max 값을 갱신
            }
        }

        // 이분 탐색(min 값이 max 값보다 작은 동안 반복)
        while(min < max) {

            int mid = (min + max) / 2; // 중간 값(=자르는 위치)을 구한다.
            long sum = 0; //자른 나무들의 합


            //tree를 반복하면서 각 나무의 높이에 대해 자르는 위치 mid를
            //적용하여 잘린 길이를 구하고 그 길이를 합산하는 for문
            //for-each 문법사용(tree 배열의 각 원소 treeHeight에 대해 반복)
            for(int treeHeight : tree) {

                //나무의 높이-자르는 위치(mid) = 0보다 큰 경우 잘린 길이 합산
                //mid가 나무의 높이보다 클 경우가 있을 수 있기 때문에(양수만 합산하기)
                if(treeHeight - mid > 0) {
                    sum += (treeHeight - mid);//mid로 잘린 모든 나무의 길이의 합
                }
            }

            //절단기의 높이 조정(절단기의 높이를최적화)
            if(sum < M) { //자른 나무 길이의 합이 목표보다 작음
                max = mid; //max 값을 mid로 갱신
            }


            else { //자른 나무 길이의 합이 목표보다 크거나 같다
                min = mid + 1; //절단기의 높이를 높인다
            }
        }


        //이분 탐색이 끝난 후
        //min 값에 1을 빼서 결과를 출력
        //이분 탐색의 특성 상 min 값은 구하고자 하는 최대 절단기 높이를 의미하므로
        // 하나 작은 값이 정답(상근이가 가져갈 나무 길이m)
        System.out.println(min - 1);

    }

}
