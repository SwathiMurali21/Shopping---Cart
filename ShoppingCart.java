
import java.util.Scanner;

class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int products[] = new int[10]; // max 10 products
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. View Total");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter product price: ");
                products[count] = sc.nextInt();
                count++;
            }
            else if(choice == 2){
                int total = 0;

                for(int i = 0; i < count; i++){
                    total += products[i];
                }

                System.out.println("Total Amount = " + total);

                // Discount logic
                if(total > 2000){
                    total = total - (total * 10 / 100);
                    System.out.println("After 10% Discount = " + total);
                }

                // Premium user
                System.out.print("Are you premium user (true/false)? ");
                boolean isPremium = sc.nextBoolean();

                if(isPremium){
                    total = total - 100;
                    System.out.println("Premium Discount Applied! Final = " + total);
                } else {
                    System.out.println("Final Amount = " + total);
                }
            }

        } while(choice != 3);

        System.out.println("Thank you for shopping!");
    }
}