# DSA
📘 Data Structures Assignment (CDAC)
👨‍💻 Author

Name: Tejas Warade
Course: CDAC

📌 Overview

This repository contains implementations of fundamental Data Structures in Java, including:

Array Operations
Stack (Resizable Array)
Queue (Fixed Size & Generic Resizable Queue)
Abstract Data Types (ADT)
🧩 Questions Covered
🔹 Q1: Delete Element from Array
Deletes an element from a specified position in an array.
Maintains logical size of the array.
Throws exception for invalid position.

Key Concepts:

Array shifting
Logical vs Physical size
Exception handling
🔹 Q2: Stack Implementation (Resizable Array)
Implements stack using array.
Dynamically resizes when full.

Operations:

push()
pop()
peek()
isEmpty()
isFull()

Features:

Automatic resizing
Exception handling on empty stack
🔹 Q3: Queue as ADT
Defines Queue using interface (ADT).
Implements fixed-size queue.

Operations:

enqueue()
dequeue()
peek()
isEmpty()
isFull()

Features:

Circular queue implementation
Exception handling
🔹 Q4: Generic Resizable Queue
Generic queue implementation using array.
Supports dynamic resizing.

Features:

Generic type support (<T>)
Circular queue logic
Dynamic resizing

🛠️ Technologies Used
Java
OOP Concepts
Data Structures

📂 Project Structure
org.cdac.day2               → Array operations
org.cdac.Stack              → Stack implementation
org.cdac.queue              → Queue ADT & Fixed Queue
org.cdac.genericqueue       → Generic Resizable Queue

🚀 How to Run
Open project in Eclipse / IntelliJ
Compile all classes
Run the App classes:
Stack → App.java
Queue → App.java
Generic Queue → App.java

⚠️ Exception Handling
Stack underflow → Exception
Queue overflow → Exception
Invalid array position → Exception

📊 Key Learnings
Implementation of core data structures
Understanding ADT concepts
Dynamic memory handling (resizing arrays)
Exception handling in Java

📌 Conclusion

This assignment demonstrates practical implementation of Stack and Queue data structures along with array manipulation techniques, reinforcing core programming and problem-solving skills.
