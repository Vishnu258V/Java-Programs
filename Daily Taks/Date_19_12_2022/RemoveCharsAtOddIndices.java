package Date_19_12_2022;

import java.util.Scanner;


class RemoveCharsAtOddIndices {
public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s  = "";
        
        for(int i = 0; i < str.length();  i++) {
            if(i%2 == 0) {
                s = s+str.charAt(i);
            }
        }
             System.out.println(s);
    }
}