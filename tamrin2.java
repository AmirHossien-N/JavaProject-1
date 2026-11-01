import java.util.Scanner;
public class tamrin2 {
    public static void main(String[] args) {
        boolean notifications = true;

        System.out.println("1: enable notifications");
        System.out.println("2: disable notifications");
        System.out.println("3: show notification status");
        System.out.println("4: reset to default");
        System.out.println("select an option");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice){
            case 1:
                notifications = true;
                System.out.println("notifications enabled");
                break;
            case 2:
                notifications = false;
                System.out.println("notifications disabled");
                break;
            case 3:
                if (notifications == true){
                    System.out.println("notifications are ON");
                }else{
                    System.out.println("notifications are OFF");
                }
                break;
            case 4:
                notifications = true;
                System.out.println("settings reset to default (ON)");
                break;
            default:
                System.out.println("invalid option");
        }
    }
}