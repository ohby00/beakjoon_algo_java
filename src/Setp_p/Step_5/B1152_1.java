package Setp_p.Step_5;
import java.io.IOException;
public class B1152_1 {  // 원시적인 방법
    public static void main(String[] args) throws IOException {

        int count = 0;
        int pre_str = 32;	// 공백을 의미한다.
        int str ;

        while(true) {
            str = System.in.read();

            // 입력받은 문자가 공백일 때,
            if(str == 32) {
                // 이전의 문자가 공백이 아니면
                if(pre_str != 32) count++;
            }

            // 입력받은 문자가 개행일때 ('\n')
            else if(str == 10) {
                // 이전의 문자가 공백이 아니면
                if(pre_str != 32) count++;
                break;
            }

            pre_str = str;

        }

        System.out.println(count);
    }
}