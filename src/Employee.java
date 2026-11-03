public class Employee {

    public enum Field {
        ID,
        FIRST_NAME,
        LAST_NAME,
        LOCATION,
        POSITION,
        TEAM,
        DATE_OF_BIRTH,
        JOIN_DATE,
        SALARY
    }

    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String joinDate;
    private String location;
    private String team;
    private String position;
    private String managerid;
    private double salary;

    public Employee(String id, String firstName, String lastName, String dateOfBirth, String joinDate, 
                    String location, String team, String position, String managerid, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.joinDate = joinDate;
        this.location = location;
        this.team = team;
        this.position = position;
        this.managerid = managerid;
        this.salary = salary;
    }

    public String getID() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getJoinDate() { return joinDate; }
    public String getLocation() { return location; }
    public String getTeam() { return team; }
    public String getPosition() { return position; }
    public String getManagerID() { return managerid; }
    public double getSalary() { return salary; }
}