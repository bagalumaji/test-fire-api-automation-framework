# Test-Fire API Automation Framework

Test-Fire API Automation Framework is a powerful and flexible testing framework designed for automating REST API testing using RestAssured, TestNG, ZeroCell for CSV/Excel data reading, Extent Report for detailed test reporting, listeners for event handling, utilities for common tasks, and Maven for project management.

## Features

- **RestAssured**: Utilize the popular RestAssured library for simplifying API testing.
- **TestNG**: Use TestNG for test execution and parallel test management.
- **ZeroCell**: Read data from CSV and Excel files seamlessly for data-driven testing.
- **Extent Report**: Generate comprehensive and visually appealing test reports.
- **Listeners**: Implement event listeners to handle various test execution events.
- **Utilities**: A collection of utilities to simplify common testing tasks.
- **Maven**: Manage project dependencies and build automation.
- **Lombok**: Reduces boilerplate code, improving code readability.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher installed.
- Maven installed.
- IDE (Eclipse, IntelliJ IDEA, or any of your choice) with TestNG plugin installed (optional).

### Installation

1. Clone the repository:

   git clone https://github.com/bagalumaji/test-fire-api-automation-framework.git

## Build the Project

Navigate to the project directory and run the following command to download dependencies:

- mvn clean install

## Configure Tests

Configure your API endpoints, test data, and other settings in the configuration files (if any).

## Run Tests

   Execute tests using Maven:
   mvn test

## View Reports

After the test execution, you can find Extent Report HTML reports in the **target/reports** directory.



