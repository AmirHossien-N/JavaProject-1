import java.util.Scanner;
public class tamrin3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("enter total cost");
            String costText = input.next();
            double cost = Double.parseDouble(costText);

            System.out.println("enter number of people");
            String peopleText = input.next();
            int people = Integer.parseInt(peopleText);

            if (cost < 0){
                System.out.println("cost cannot be negative");
            }else if (people < 0){
                System.out.println("number of people cannot be negative");
            }else if (people == 0){
                System.out.println("number of people cannot be zero");
            }else{
                double share = cost / people;
                System.out.println("each person pays: " + share);
            }

        } catch (NumberFormatException e){
            System.out.println("invalid input");
        }

    }
}