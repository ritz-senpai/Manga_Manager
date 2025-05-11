# Manga_Manager
# Manga_Manager

Manga_Manager is a simple Java project that performs CRUD (Create, Read, Update, Delete) operations using Hibernate and a SQL database. It allows users to manage manga records such as title, author, genre, and status.

## Technologies Used

- Java
- Hibernate ORM
- SQL Database (MySQL or any relational DB)
- Maven or Gradle (for dependencies)

## Features

- Add new manga
- View all manga
- Update manga details
- Delete manga records

## How to Run

1. Set up a SQL database and create a table for manga.
2. Configure the `hibernate.cfg.xml` file with your database details.
3. Compile and run the Java files using your IDE or terminal.
4. Interact with the app through the console menu.

## Table Structure Example

```sql
CREATE TABLE manga (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    genre VARCHAR(50),
    status VARCHAR(20)
);
