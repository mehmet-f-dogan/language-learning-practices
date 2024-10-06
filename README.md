# Mehmet's Exercises to Learn Programming Languages - <br/>Extensive Programming Language Challenges

## 1. Basics

### 1.1 Primitive Types
- **Exercise: Declare Variables**
  - **Task**: Create variables for different primitive types (e.g., integer, float, boolean, character, string) and perform operations on them.
  - **Details**: 
    - Declare a variable for each type.
    - Print their values and types.
    - Perform arithmetic operations with integers and floats.
    - Concatenate strings and output the results.
  
- **Exercise: Type Conversion**
  - **Task**: Implement a function that converts between different types (e.g., int to float, string to int).
  - **Details**: 
    - Handle invalid conversions gracefully.
    - Return the converted value or an error message.

### 1.2 Control Structures
- **Exercise: FizzBuzz Variations**
  - **Task**: Write a program that prints numbers from 1 to 100, replacing:
    - Multiples of 3 with "Fizz"
    - Multiples of 5 with "Buzz"
    - Multiples of both with "FizzBuzz"
    - Multiples of 7 with "Bazz"
  - **Details**: 
    - Use loops (for/while) and conditional statements.

- **Exercise: Factorial Calculation**
  - **Task**: Implement a function that calculates the factorial of a given number using both iterative and recursive approaches.
  - **Details**: 
    - Validate input to ensure it’s a non-negative integer.
    - Output the result along with the time taken for each approach.

- **Exercise: Number Guessing Game**
  - **Task**: Create a simple number guessing game where the user has to guess a randomly generated number.
  - **Details**: 
    - Give hints (too high/too low) after each guess.
    - Keep track of the number of attempts.

### 1.3 Arrays and Collections
- **Exercise: Array Rotation**
  - **Task**: Write a function to rotate an array to the right by a given number of steps.
  - **Details**: 
    - Handle cases where the number of steps exceeds the array length.
    - Return the modified array.

- **Exercise: Merge Two Sorted Arrays**
  - **Task**: Create a function that merges two sorted arrays into a single sorted array.
  - **Details**: 
    - Handle edge cases where one or both arrays are empty.
    - Demonstrate efficiency in terms of time complexity.

- **Exercise: Unique Elements**
  - **Task**: Implement a function that returns only the unique elements from an array.
  - **Details**: 
    - Use data structures (like sets) for efficiency.
    - Return the unique elements in their original order.

### 1.4 Functions
- **Exercise: Lambda Expressions**
  - **Task**: Write functions using lambda expressions for common operations (e.g., squaring a number, checking even/odd).
  - **Details**: 
    - Demonstrate the use of lambda in higher-order functions.

- **Exercise: Function Chaining**
  - **Task**: Create multiple small functions and chain them to perform a series of operations on an input.
  - **Details**: 
    - Implement the ability to pass the output of one function to the next.

## 2. Intermediate

### 2.1 Common Algorithms
- **Exercise: Implement Search Algorithms**
  - **Task**: Implement linear search and binary search algorithms.
  - **Details**: 
    - Compare their time complexities and performance on large datasets.
    - Return the index of the target value or an error if not found.

- **Exercise: Selection Sort and Insertion Sort**
  - **Task**: Implement selection sort and insertion sort algorithms.
  - **Details**: 
    - Explain the time complexity of each algorithm.
    - Sort an array of random numbers and print the sorted output.

### 2.2 Data Structures
- **Exercise: Queue Implementation**
  - **Task**: Implement a queue data structure with enqueue, dequeue, and peek methods.
  - **Details**: 
    - Use an array or linked list for the implementation.
    - Handle error conditions for empty queue operations.

- **Exercise: Binary Tree Operations**
  - **Task**: Create a binary tree and implement methods for insertion, deletion, and traversal (in-order, pre-order, post-order).
  - **Details**: 
    - Print the values during traversal to verify the structure.

- **Exercise: Hash Table Implementation**
  - **Task**: Implement a basic hash table with collision handling.
  - **Details**: 
    - Include methods for adding, retrieving, and deleting items.
    - Discuss the hashing function and how collisions are resolved.

### 2.3 Object-Oriented Programming
- **Exercise: E-commerce System**
  - **Task**: Create classes for a simple e-commerce system (Product, Cart, Order).
  - **Details**: 
    - Implement methods to add/remove products from the cart and place an order.
    - Use inheritance to create specialized product types (e.g., Electronics, Clothing).

- **Exercise: Shape Class Hierarchy**
  - **Task**: Create a base class `Shape` and derive classes like `Circle`, `Rectangle`, and `Triangle`.
  - **Details**: 
    - Implement a method to calculate the area and perimeter in each derived class.
    - Use polymorphism to handle different shape types.

## 3. Advanced

### 3.1 Web Development Basics
- **Exercise: Build a Static Site**
  - **Task**: Create a static website with multiple pages (HTML/CSS).
  - **Details**: 
    - Include a navigation bar and footer.
    - Ensure the site is responsive.

- **Exercise: RESTful API with Authentication**
  - **Task**: Build a RESTful API that includes user authentication (login/logout).
  - **Details**: 
    - Use token-based authentication (JWT).
    - Protect certain routes to require authentication.

### 3.2 Handling JSON
- **Exercise: JSON CRUD Operations**
  - **Task**: Create a program that performs CRUD operations on a collection of JSON objects.
  - **Details**: 
    - Implement functions to Create, Read, Update, and Delete objects in JSON format.
    - Output the JSON to a file and read from it.

- **Exercise: Nested JSON Parsing**
  - **Task**: Write a program to parse nested JSON data and extract specific information.
  - **Details**: 
    - Handle various data types (arrays, objects).
    - Return the extracted information in a user-friendly format.

### 3.3 Environment Variables
- **Exercise: Secure Configuration**
  - **Task**: Create a configuration management system that uses environment variables.
  - **Details**: 
    - Validate that required variables are set and provide defaults where necessary.
    - Output the configuration settings after loading.

- **Exercise: Application Settings with Environment Variables**
  - **Task**: Build an application that adjusts its behavior based on environment variables.
  - **Details**: 
    - Include different modes (development, production) and change settings accordingly.

### 3.4 TCP Handling
- **Exercise: File Transfer Application**
  - **Task**: Implement a TCP client-server application that transfers files.
  - **Details**: 
    - Ensure proper error handling for file operations.
    - Display progress of file transfer.

- **Exercise: HTTP Request Handler**
  - **Task**: Build a TCP server that handles HTTP requests manually.
  - **Details**: 
    - Parse incoming HTTP requests and send appropriate responses.
    - Implement basic GET and POST request handling.

## 4. Language-Specific Exercises

### Java, Scala, Kotlin, Groovy
- **Java**: 
  - **Exercise: Streams and Collectors**
    - **Task**: Use Java Streams to filter a list of integers and collect the even numbers.
    - **Details**: 
      - Print the filtered list.

- **Scala**: 
  - **Exercise: Immutable Collections**
    - **Task**: Create an immutable list and demonstrate its operations.
    - **Details**: 
      - Show how to map, filter, and reduce the list.

- **Kotlin**: 
  - **Exercise: Coroutines for Asynchronous Programming**
    - **Task**: Implement a simple coroutine that fetches data asynchronously.
    - **Details**: 
      - Use `suspend` functions and show how to launch coroutines.

- **Groovy**: 
  - **Exercise: Grape for Dependency Management**
    - **Task**: Use Grape to manage dependencies in a Groovy script.
    - **Details**: 
      - Implement a script that fetches and uses a library.

### Rust
- **Exercise: Lifetimes**
  - **Task**: Create a function that uses lifetimes to ensure safe borrowing.
  - **Details**: 
    - Demonstrate how lifetimes prevent dangling references.

- **Exercise: Traits and Generics**
  - **Task**: Implement a generic function that works with different numeric types.
  - **Details**: 
    - Use traits to define operations that can be performed.

### Go
- **Exercise: Middleware in HTTP Server**
  - **Task**: Implement middleware for logging and authentication in a Go HTTP server.
  - **Details**: 
    - Chain multiple middleware functions and demonstrate their use.

- **Exercise: Go Module Management**
  - **Task**: Create a Go module and manage dependencies.
  - **Details**: 
    - Use `go.mod` to define dependencies and demonstrate versioning.

### Vlang
- **Exercise: Web Server with V**
  - **Task**: Create a web server that serves static files.
  - **Details**: 
    - Implement routes to handle different file types.

### Zig
- **Exercise: Error Handling in Zig**
  - **Task**: Write a program that demonstrates Zig's error handling.
  - **Details**: 
    - Use `!` syntax to propagate errors and handle them gracefully.

### Odin
- **Exercise: Basic HTTP Client**
  - **Task**: Implement a simple HTTP client that performs GET requests.
  - **Details**: 
    - Parse the response and print relevant information.

### OCaml
- **Exercise: Pattern Matching with Lists**
  - **Task**: Write a function that performs operations on lists using pattern matching.
  - **Details**: 
    - Handle empty lists and non-empty lists separately.

### Erlang, Elixir, Gleam
- **Exercise: Process Communication in Erlang**
  - **Task**: Create a simple application where processes communicate using messages.
  - **Details**: 
    - Demonstrate sending and receiving messages between processes.

- **Exercise: LiveView in Elixir**
  - **Task**: Build a simple interactive web application using LiveView.
  - **Details**: 
    - Implement real-time updates based on user interactions.

### Python, Lua, TypeScript
- **Python**: 
  - **Exercise: Flask Web Application**
    - **Task**: Create a basic web application using Flask.
    - **Details**: 
      - Implement routing, templating, and handling form submissions.

- **Lua**: 
  - **Exercise: Simple Scripting with Lua**
    - **Task**: Write a script that automates a simple task (e.g., file renaming).
    - **Details**: 
      - Handle file I/O operations in Lua.

- **TypeScript**: 
  - **Exercise: Type Guards**
    - **Task**: Implement type guards to differentiate between types in a union.
    - **Details**: 
      - Demonstrate how to use type guards in function definitions.

## 5. Dockerization
- **Exercise: Multi-Stage Dockerfile**
  - **Task**: Write a multi-stage Dockerfile for a web application.
  - **Details**: 
    - Optimize the final image size by separating build and runtime environments.

- **Exercise: Docker Health Checks**
  - **Task**: Implement health checks for a Docker container.
  - **Details**: 
    - Ensure the container can restart automatically if it fails.

- **Exercise: Continuous Deployment with Docker**
  - **Task**: Set up a CI/CD pipeline that builds and deploys a Docker container.
  - **Details**: 
    - Use GitHub Actions or similar tools for automation.

## 6. Capstone Projects
- **Exercise: Full-Stack Application**
  - **Task**: Build a full-stack application using a chosen technology stack (e.g., MERN, LAMP).
  - **Details**: 
    - Implement both the frontend and backend with a database connection.

- **Exercise: Blogging Platform**
  - **Task**: Create a blogging platform where users can write, edit, and delete posts.
  - **Details**: 
    - Implement user authentication and commenting features.

- **Exercise: Personal Portfolio Website**
  - **Task**: Design a personal portfolio website to showcase your projects and skills.
  - **Details**: 
    - Include sections for about, projects, and contact information.

