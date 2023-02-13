/*
Question : Write a program to reverse a given number and check whether the number is palindrome or not.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,temp,temp2 = 0,temp3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        temp3 = a;
        System.out.println("Firstly, printing the reverse number :");
        while (a > 0){
            temp = a % 10;
            System.out.print(temp);
            temp2 = temp2 * 10 + temp;
            a = a / 10;
        }
        System.out.println();
        System.out.println("Finally, printing the result :");
        System.out.println();
        if (temp2 == temp3){
            System.out.println("Yes, number is a palindrome number :" + temp3);
        }else
            System.out.println("No, number is a not a palindrome number :" + temp3);
    }
}
