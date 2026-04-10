# Inventory Management System

## Introduction
This project is a simple Inventory Management System developed using Java and MySQL. It helps store and manage details like products, customers, suppliers, and transactions in an easy way. The system provides a user-friendly interface to perform operations such as adding, updating, and deleting records, along with managing stock automatically.

## Features

- Manage product inventory (Add, Update, Delete)
- Maintain customer and supplier records
- Perform sales and purchase transactions
- Automatic stock update after each transaction
- Role-based login system (Administrator and Employee)
- Search functionality in each module
- User activity logging (login and logout time tracking)

---

## Technologies Used

- Java (Swing) – GUI Development
- JDBC – Database Connectivity
- MySQL – Database Management
- IntelliJ IDEA – Development Environment
- JDK 17

---

## Database Structure

The project uses a MySQL database named `inventory` which includes the following tables:

- `users` – Stores user login credentials and roles
- `products` – Stores product details
- `customers` – Stores customer information
- `suppliers` – Stores supplier data
- `salesinfo` – Records sales transactions
- `purchaseinfo` – Records purchase transactions
- `currentstock` – Tracks available stock
- `userlogs` – Maintains login/logout logs

---

## How to Run the Project

1. Import the database:
    - Open MySQL Workbench or Command Line
    - Import the provided SQL file:
      ```
      InventoryDB.sql
      ```

2. Configure database connection:
    - Open `DBCredentials.xml`
    - Update username and password if required:
      ```xml
      <entry key="username">root</entry>
      <entry key="password">root</entry>
      ```

3. Run the application:
    - Execute the file:
      ```
      InventoryManagement.jar
      ```

4. Login to the system:
   Username: root
   Password: root


---

## Application Modules

- **Login Page** – Authenticates user credentials
- **Dashboard** – Main navigation interface
- **Products** – Manage product details
- **Current Stock** – View stock availability
- **Customers** – Manage customer records
- **Suppliers** – Manage supplier records
- **Sales** – Handle product sales
- **Purchase** – Handle product purchases
- **Users** – Manage system users (Admin only)
- **User Logs** – Track user activity

---

## My Contribution

In this project, I have contributed by:

- Setting up and configuring the MySQL database using the provided SQL file
- Managing database connectivity using JDBC and modifying `DBCredentials.xml`
- Performing CRUD operations on various modules such as Products and Customers
- Debugging issues related to login authentication and database connection
- Testing all functionalities including Sales, Purchase, and Stock Management
- Cleaning and organizing the project structure for final submission

---

## Future Enhancements

- Convert the application into a web-based system
- Add graphical reports and analytics
- Implement cloud-based database storage
- Add barcode scanning functionality

---

## Author

Name: Manaswi  
Project: Inventory Management System  
Technologies: Java, MySQL
