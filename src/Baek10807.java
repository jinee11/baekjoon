import java.io.IOException;
import java.util.Scanner;

public class Baek10807 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] += sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(a[i] == v){
                count++;
            }
        }
        System.out.println(count);




    }
}
