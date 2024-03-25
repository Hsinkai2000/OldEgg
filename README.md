# OldEgg: E-commerce for PC Parts (Database Schema)

**Description**

This repository holds the MySQL database schema for OldEgg, an e-commerce platform designed for browsing and purchasing PC components.

**Database Schema**

The schema consists of several tables representing various entities within the e-commerce system. 

**Prerequisites**

- Java Development Kit (JDK) (https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Apache Tomcat (https://tomcat.apache.org/)
- MySQL (https://www.mysql.com/) Connector/J driver

**Database Setup:**

Install and configure a MySQL database server.
Create a database for Bahoot.
Import the provided schema (refer to sql directory) into the created database.
Project Configuration:

Update the application.properties file with your database connection details (host, port, username, password).
Deployment:

Copy the contents of this repository to the webapps directory of your Tomcat installation.
Start the Tomcat server.

**Using the Schema**

This schema provides a foundation for building the database tier of your OldEgg e-commerce application. You can import the provided SQL files into your MySQL database server.

**Further Development**

This repository serves as a starting point for the database design. You can extend the schema to accommodate additional functionalities and features for your e-commerce platform.

**License**

This project is licensed under the [Apache License 2.0] license.
