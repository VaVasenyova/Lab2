import java.util.Scanner;
public class Lab2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); // задание 1
        System.out.print("Введите число n, такое что 0 < n < 15, \n");
        int n = in.nextInt();
        int result = 1;

        if (n<0 | n>15) {
            System.out.print("Ошибка ввода: n - неотрицательное число <15");
        }
        else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.print(n + "! = " + result);
        }
    }
}
