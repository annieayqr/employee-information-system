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
                case 1: // Add employee
                    addEmployeeInterface();
                    break;

                case 2: // View employee
                    break;

                case 3: // Search employee  
                    break;

                case 4: // Modify employee
                    break;

                case 5: // Delete employee
                    break;

                case 6: // Sort employees
                    break;

                case 7: // Filter employees
                    break;

                case 0: // Exit
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
