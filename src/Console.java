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
                    insertInterface();
                    break;

                case 2: // View employee
                    viewInterface();
                    break;

                case 3: // View all employees
                    // viewAllInterface();
                    break;

                case 4: // Update employee
                    // updateInterface();
                    break;

                case 5: // Delete employee
                    // deleteInterface();
                    break;

                case 6: // Sort employees
                    // sortInterface();
                    break;

                case 7: // Filter employees
                    // filterInterface();
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
            2. View Employee
            3. View All Employees
            4. Update Employee
            5. Delete Employee
            6. Sort Employees
            7. Filter Employees
            0. Exit
        """);
    }

    private static void insertInterface() {
        System.out.println("\n=== Add Employee ===");

        System.out.print("Employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Location: ");
        String location = scanner.nextLine();

        System.out.print("Team: ");
        String team = scanner.nextLine();

        System.out.print("Position: ");
        String position = scanner.nextLine();

        System.out.print("Manager ID: ");
        String managerid = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Join date: ");
        String joinDate = scanner.nextLine();

        Employee employee = new Employee(
            id,
            username,
            firstName,
            lastName,
            location,
            team,
            position,
            managerid,
            salary,
            dateOfBirth,
            joinDate
        );

        Operations.insert(employee);
    }

    private static void viewInterface() {
        System.out.println("Enter employee ID: ");
        String id = scanner.nextLine();

        Employee employee = Operations.view(id);

        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("\n=== Employee Information ===");
        System.out.println("ID: " + employee.getID());
        System.out.println("Username: " + employee.getUsername());
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Location: " + employee.getLocation());
        System.out.println("Team: " + employee.getTeam());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Manager ID: " + employee.getManagerID());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Date of Birth: " + employee.getDateOfBirth());
        System.out.println("Join Date: " + employee.getJoinDate());
    }
}
