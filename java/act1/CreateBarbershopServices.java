import java.util.*;

public class CreateBarbershopServices {
    public static void main(String[] args) {
        String inputServiceDescription;
        double inputPrice;

        BarbershopService firstService = new BarbershopService();
        BarbershopService secondService = new BarbershopService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first service: ");
        inputServiceDescription = scanner.nextLine();    
        System.out.print("Enter price: ");
        inputPrice = scanner.nextDouble();

        firstService.setServiceDescription(inputServiceDescription);
        firstService.setPrice(inputPrice); 

        System.out.print("Enter second service: ");
        inputServiceDescription = scanner.nextLine();    
        System.out.print("Enter price: ");
        inputPrice = scanner.nextDouble();

        secondService.setServiceDescription(inputServiceDescription);
        secondService.setPrice(inputPrice); 

        System.out.println("First Service: " + firstService.getServiceDescription() + " " + firstService.getPrice());
        System.out.println("Second Service: " + secondService.getServiceDescription() + " " + secondService.getPrice());

        scanner.close();
    }
}