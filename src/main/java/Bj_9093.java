
/*
* 시간 초과
* */

import java.util.Scanner;
public class Bj_9093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<num; i++) {
            String s = sc.nextLine();
            String[] strArr = s.split(" ");

            for (int j = 0; j < strArr.length; j++) {
                char[] chArr = strArr[j].toCharArray();
                for (int k = 0; k < (strArr[j].length()) / 2; k++) {
                    char temp = chArr[k];
                    chArr[k] = chArr[strArr[j].length() - k - 1];
                    chArr[strArr[j].length() - k - 1] = temp;
                }

                for(int l =0; l<chArr.length; l++)
                    System.out.print(chArr[l]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}

