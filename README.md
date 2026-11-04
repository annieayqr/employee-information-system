![Java](https://img.shields.io/badge/Java-25-orange)
![SQLite](https://img.shields.io/badge/SQLite-003B57)
![Status](https://img.shields.io/badge/status-in%20development-yellow)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Platform](https://img.shields.io/badge/platform-macOS%20%7C%20Linux%20%7C%20Windows-lightgrey.svg)

# Employee Information System

A console-based Employee Information System built with Java and SQLite. The project is designed to practise Java object-oriented programming, JDBC database integration, SQL operations, and persistent employee record management.


## Features

### Employee Records

- [x] Add a new employee
- [x] View an employee by ID
- [ ] View all employees
- [ ] Update employee information
- [ ] Delete an employee

### Sorting & Filtering

- [ ] Sort employees by selected field in ascending or descending order
- [ ] Filter employees by selected field and comparison operator


## Employee Information

Each employee record may contain:

- Employee ID
- Username
- First name
- Last name
- Date of birth
- Join date
- Location
- Team
- Position
- Manager ID (foreign key)
- Salary
 

## Project Structure

```text
employee-information-system/
├── src/
│   ├── Console.java
│   ├── Database.java
│   ├── Employee.java
│   ├── Main.java
│   └── Operations.java
├── data/
│   └── .gitkeep
├── pom.xml
├── .gitignore
└── README.md