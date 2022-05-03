import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Character character = 'a';
            Deque<Character> deque = new ArrayDeque<>();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '(')
                    deque.push(ch);

                else if (ch == ')') {
                    character = deque.pollFirst();
                    if(character == null) { //비어있는데 pop하려는 경우
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(character != null) { //문자들을 스택에 다 넣고 나서
                if (deque.isEmpty()) //스택이 비어있는 경우
                    System.out.println("YES");
                else //아직 스택에 남아있는 경우
                    System.out.println("NO");
            }
        }
    }
}

/*
 * Stack을 이용하면됨. (Java의 실수로 Stack보단 ArrayDeque를 이용하자)
 * Deque<String> deque = new ArrayDeque<>(); 이용하자
 * */
