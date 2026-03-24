# MVC Bookstore Application — Setup and Execution Steps in Eclipse

## Objective

To implement a simple Model-View-Controller (MVC) architecture for a Java application that simulates a basic online bookstore.
The application allows users to:

- View available books
- Add books to a cart
- View cart contents

---

# Project Structure

The project follows the MVC design pattern with separate packages for Model, View, and Controller.

Expected folder structure:

Q5-MVC-Bookstore

```
BookstoreApp.java

controller
    Bookstorecontroller.java

model
    Book.java
    Cart.java

view
    Bookstoreview.java
```

---

# Software Requirements

Before running the program, ensure the following software is installed:

1. Java Development Kit (JDK) — version 8 or higher
2. Eclipse IDE for Java Developers

---

# Steps to Run the MVC Bookstore Application in Eclipse

## Step 1 — Open Eclipse

Start the Eclipse IDE.

---

## Step 2 — Create a New Java Project

Click:

File → New → Java Project

Enter project name:

Q5-MVC-Bookstore

Click:

Finish

---

## Step 3 — Create Packages

Inside the src folder, create the following packages:

controller
model
view

Steps:

Right-click src
New → Package
Enter package name
Click Finish

Repeat for all three packages.

---

## Step 4 — Create Java Files

Create the following files in the respective packages.

In src folder:

BookstoreApp.java

In controller package:

Bookstorecontroller.java

In model package:

Book.java
Cart.java

In view package:

Bookstoreview.java

Steps:

Right-click package
New → Class
Enter class name
Click Finish

---

## Step 5 — Paste the Code

Copy and paste the respective code into each file.

Save all files.

Shortcut:

Ctrl + S

---

## Step 6 — Compile the Project

Click:

Project → Build Project

Eclipse will compile all Java files.

---

## Step 7 — Run the Application

Right-click:

BookstoreApp.java

Click:

Run As → Java Application

---

# Expected Output

The console will display a list of available books.

Example:

Available Books:

1. Think and Grow Rich — $12.99
2. Deep Work — $14.49
3. Clean Code — $18.75
4. Atomic Habits — $11.50

The user can:

- Enter a book number to add to cart
- Enter 0 to view cart
- Enter -1 to exit

---

# Technologies Used

Java
MVC Architecture
Eclipse IDE
