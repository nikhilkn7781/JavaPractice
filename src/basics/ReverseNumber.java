package basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");

        int num=s.nextInt();
        int rev=0;
        for (int i = 0; i < num; i++) {
            int rem=num%10;
            rev=rev+rem;
            num=num/10;
        }
    }
}

