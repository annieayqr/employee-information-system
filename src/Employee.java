public class Employee {
    
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String location;
    private String team;
    private String position;
    private String managerid;
    private double salary;
    private String dateOfBirth;
    private String joinDate;

    public Employee(String id, String username, String firstName, String lastName, String location, String team,  
                    String position, String managerid, double salary, String dateOfBirth, String joinDate) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.team = team;
        this.position = position;
        this.managerid = managerid;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.joinDate = joinDate;
    }

    public String getID() { return id; }
    public String getUsername() { return username; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getLocation() { return location; }
    public String getTeam() { return team; }
    public String getPosition() { return position; }
    public String getManagerID() { return managerid; }
    public double getSalary() { return salary; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getJoinDate() { return joinDate; }
}