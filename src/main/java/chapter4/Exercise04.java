// 2개의 주사위를 던졌을 때 합이 5가 될때까지 반복하는 프로그램

package chapter4;

public class Exercise04 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        while (num1 + num2 != 5) {
            num1 = (int)(Math.random() * 6) + 1;
            num2 = (int)(Math.random() * 6) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");
        }
    }
}
