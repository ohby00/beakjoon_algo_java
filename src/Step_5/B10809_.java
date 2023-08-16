package Step_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B10809_ {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {	// 배열 출력
            System.out.print(val + " ");
        }
    }
}
