import java.util.Scanner;

public class Console {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        int choice;

        do {
            showMenu();
            
            System.out.print("Enter option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add Employee");
                    break;

                case 2:
                    System.out.println("View Employees");
                    break;

                case 3:
                    System.out.println("Search Employee");
                    break;

                case 4:
                    System.out.println("Modify Employee");
                    break;

                case 5:
                    System.out.println("Delete Employee");
                    break;

                case 6:
                    System.out.println("Sort Employees");
                    break;

                case 7:
                    System.out.println("Filter Employees");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        
        } while (choice != 0); 
    }

    private static void showMenu() {
        System.out.println("""
            === Employee Information System ===
            1. Add Employee
            2. View Employees
            3. Search Employee
            4. Modify Employee
            5. Delete Employee
            6. Sort Employees
            7. Filter Employees
            0. Exit
            """);
    }
}
