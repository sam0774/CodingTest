
import java.util.Scanner;

public class Bj_9093_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n; i++) {
            String s = sc.nextLine();
            String[] strArr = s.split(" ");
            for(int j = 0; j<strArr.length; j++) {
                String str = new StringBuilder(strArr[j]).reverse().toString();
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
/*
*String과 StringBuffer(StringBuilder)의 차이점은 일단 String은 고정된 길이의 불변(immutable) 문자열이다.
 불변이므로 String 객체를 변경시 실제로 변경되는 것이 아닌 새로운 String 객체를 생성한다.
 반면에 StringBuffer와 StringBuilder는 변경이 가능하다.(String 처럼 새로운 객체를 생성하는 것이 아닌 그 객체 자체가 변경된다.)
 그러므로 문자열의 변경이 잦은 작업이라면 String 대신 StringBuffer 또는 StringBuilder의 사용을 고려한다.
 StringBuffer와 StringBuilder의 차이는 멀티스레드 환경에서 thread-safe 여부가 다르다.
 StringBuffer는 thread-safe 하므로 여러 쓰레드에서 동시에 해당 문자열에 접근한다면 사용을 고려하고, 그렇지 않다면 StringBuilder를
 사용하는 것이 성능에 더 유리하다. (성능과 thread-safe는 반비례라고 생각하면 된다.)

정리하면
1. 문자열 변경이 빈번하지 않는다면 String 사용을 고려
2. 문자열이 빈번하게 변경되면서 멀티쓰레드 환경이라면 StringBuffer 사용을 고려
3. 문자열이 빈번하게 변경되면서 멀티쓰레드 환경이 아니라면 StringBuilder 사용을 고려
출처: https://yangbox.tistory.com/58 [양's World]*/