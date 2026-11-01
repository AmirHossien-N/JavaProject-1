import java.util.Scanner;
public class tamrin1 {
    public static void main(String[] args) {
        System.out.println("enter package size in GB");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        System.out.println("enter wallet balance");
        int wallet = input.nextInt();

        if (size <= 0 || wallet < 0){
            System.out.println("invalid input");
        }else{
            int price = size * 5000;

            if (size > 10){
                price = price - (price * 15 / 100);
            }

            if (wallet >= price){
                int remain = wallet - price;
                System.out.println("purchase successful");
                System.out.println("your remaining balance: " + remain);
            }else{
                int need = price - wallet;
                System.out.println("not enough balance");
                System.out.println("you need: " + need + " more");
            }
        }
    }
}