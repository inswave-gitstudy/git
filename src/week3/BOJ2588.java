package week3;

import java.util.Scanner;

public class BOJ2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int sum = 0, place = 1; // 합, 자릿수
        while (b > 0) {
            int digit = b % 10;
            int product = digit * a;
            System.out.println(product);
            b /= 10;
            sum += product * place;
            place *= 10;
        }
        System.out.println(sum);
    }
}
