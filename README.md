# Mehmet's Exercises to Learn Programming Languages - <br/>Extensive Programming Language Challenges

Languages targeted are:
- `JVM`: Java, Scala, Kotlin, Groovy
- `Systems`: Go, Rust, V, Zig, Odin, 
- `Erlang VM`: Erlang, Elixir, Gleam
- `Other`: Python, Lua, TypeScript, Ruby, OCaml

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

- **Exercise: Fibonacci Calculation**
  - **Task**: Implement a function that calculates the Fibonacci number of a given order using both iterative and recursive approaches.
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
    - Include methods for adding and deleting items.
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

### 1. Java
1. **Streams and Lambdas**
   - **Task**: Use Java Streams to filter a list of integers, keeping only even numbers, and then square each of them.
   - **Details**: Demonstrate the use of lambda expressions in your solution.

2. **Annotations**
   - **Task**: Create a custom annotation and apply it to a method. Write a program that reads the annotation and prints its values.
   - **Details**: Use reflection to access the annotation.

3. **Generics**
   - **Task**: Implement a generic class that holds a list of items and includes methods to add, remove, and retrieve items.
   - **Details**: Demonstrate the benefits of type safety.

4. **Exception Handling**
   - **Task**: Create a program that reads a file and handles exceptions for file not found and IO errors.
   - **Details**: Implement a custom exception class.

5. **Java 8 Optional**
   - **Task**: Write a method that returns an `Optional<String>` and demonstrates how to use `isPresent()`, `ifPresent()`, and `orElse()`.
   - **Details**: Use this in a program that handles user input.

### 2. Scala
1. **Case Classes**
   - **Task**: Define a case class for a `Book` with attributes like title and author, and implement a method to display its information.
   - **Details**: Use pattern matching to classify books by genre.

2. **Futures and Promises**
   - **Task**: Create an asynchronous computation using Scala's `Future` and `Promise`.
   - **Details**: Handle success and failure cases using callbacks.

3. **Implicits**
   - **Task**: Implement a method that uses implicit conversions to add functionality to an existing type (e.g., adding a method to `String`).
   - **Details**: Demonstrate the implicit class syntax.

4. **Traits and Mixins**
   - **Task**: Define a trait for logging and implement it in multiple classes (e.g., User, Order).
   - **Details**: Use mixin composition to add logging functionality.

5. **Pattern Matching with Extractors**
   - **Task**: Create a custom extractor object that matches specific patterns in strings.
   - **Details**: Use this extractor in pattern matching expressions.

### 3. Kotlin
1. **Data Classes**
   - **Task**: Create a data class for a `Person` and demonstrate destructuring declarations.
   - **Details**: Implement a function that returns a `Person` instance and use destructuring to extract properties.

2. **Coroutines**
   - **Task**: Write a program that uses Kotlin Coroutines to perform a long-running task without blocking the main thread.
   - **Details**: Use `launch` and `async` for concurrent execution.

3. **Extension Functions**
   - **Task**: Implement an extension function for `String` that reverses the string.
   - **Details**: Use this function in a program that processes user input.

4. **Sealed Classes**
   - **Task**: Define a sealed class hierarchy for representing different types of network responses (e.g., Success, Error).
   - **Details**: Implement pattern matching to handle each response type.

5. **Null Safety**
   - **Task**: Create a function that accepts a nullable string and returns its length or zero if it’s null.
   - **Details**: Use safe calls and the Elvis operator.

### 4. Groovy
1. **Closures**
   - **Task**: Write a program that uses a closure to filter a list of integers and return only the even numbers.
   - **Details**: Demonstrate closure syntax and usage.

2. **Dynamic Typing**
   - **Task**: Create a script that defines variables without explicit types and performs operations on them.
   - **Details**: Show how Groovy handles dynamic typing.

3. **GORM for Database Interaction**
   - **Task**: Define a domain class and use GORM to perform basic CRUD operations on a database.
   - **Details**: Implement validations on the domain class.

4. **Meta-programming**
   - **Task**: Use Groovy's meta-programming features to dynamically add methods to a class at runtime.
   - **Details**: Demonstrate how to manipulate class properties and methods.

5. **AST Transformations**
   - **Task**: Implement a custom AST transformation that adds a method to a class during compilation.
   - **Details**: Explain how the transformation affects the class.

### 5. Rust
1. **Ownership and Borrowing**
   - **Task**: Write a function that demonstrates ownership by transferring ownership of a vector and attempts to use it afterward.
   - **Details**: Show the compiler's error messages.

2. **Pattern Matching with Enums**
   - **Task**: Create an enum to represent different shapes and implement a function that calculates the area of each shape using pattern matching.
   - **Details**: Use `match` to handle each variant.

3. **Traits**
   - **Task**: Define a trait for a `Shape` with methods for area and perimeter, and implement this trait for different shapes.
   - **Details**: Use generics to work with different shapes.

4. **Lifetimes**
   - **Task**: Write a function that demonstrates how lifetimes work by preventing dangling references.
   - **Details**: Provide examples of lifetime annotations.

5. **Concurrency with Threads**
   - **Task**: Create a multithreaded program that counts to a number using multiple threads.
   - **Details**: Use `Arc` and `Mutex` to share state safely.

### 6. Go
1. **Structs and Interfaces**
   - **Task**: Create structs for different types of animals and implement an interface for them with methods like `Speak()`.
   - **Details**: Demonstrate polymorphism in action.

2. **Goroutines**
   - **Task**: Write a program that spawns multiple goroutines to perform calculations concurrently.
   - **Details**: Use a wait group to synchronize completion.

3. **Channels**
   - **Task**: Implement a simple producer-consumer model using Go channels.
   - **Details**: Demonstrate how to pass data between goroutines.

4. **Error Handling**
   - **Task**: Write a function that returns an error and handle it gracefully in the calling code.
   - **Details**: Create a custom error type.

5. **Reflection**
   - **Task**: Use the `reflect` package to inspect the fields of a struct at runtime.
   - **Details**: Demonstrate how to dynamically access field values.

### 7. Vlang
1. **Structs and Methods**
   - **Task**: Define a struct for a `Car` and implement methods to start and stop the car.
   - **Details**: Use V's method syntax to show how to invoke these methods.

2. **Error Handling**
   - **Task**: Write a function that reads a file and handles errors appropriately.
   - **Details**: Return errors using V's error handling mechanism.

3. **Immutable Variables**
   - **Task**: Demonstrate V's immutability feature by creating variables that cannot be changed.
   - **Details**: Show the compiler's behavior when attempting to change an immutable variable.

4. **Modules**
   - **Task**: Create a simple module that provides utility functions for string manipulation.
   - **Details**: Demonstrate how to import and use this module in another file.

5. **Concurrency**
   - **Task**: Write a program that uses V's concurrency features to perform tasks in parallel.
   - **Details**: Demonstrate how to manage shared state safely.

### 8. Zig
1. **Error Handling**
   - **Task**: Implement a function that can return an error and handle it using Zig's error unions.
   - **Details**: Provide examples of successful and failed function calls.

2. **Compile-Time Evaluation**
   - **Task**: Use Zig's compile-time capabilities to create a constant that calculates the factorial of a number.
   - **Details**: Demonstrate how this can be used in a program.

3. **Structs and Unions**
   - **Task**: Define a struct with various data types and a union that can hold different types of values.
   - **Details**: Show how to access and use these types.

4. **Defer Statement**
   - **Task**: Write a program that demonstrates the use of the `defer` statement for cleanup tasks.
   - **Details**: Use it in a file handling context.

5. **Testing in Zig**
   - **Task**: Create unit tests for a simple function in Zig.
   - **Details**: Demonstrate how to run the tests and check results.

### 9. Odin
1. **Structs and Methods**
   - **Task**: Define a struct for a `Rectangle` and implement methods for calculating area and perimeter.
   - **Details**: Use method syntax to invoke these methods.

2. **Concurrency**
   - **Task**: Write a simple concurrent program using Odin's goroutines.
   - **Details**: Demonstrate how to manage shared data safely.

3. **Arrays and Slices**
   - **Task**: Create and manipulate arrays and slices, showing the differences in how they are handled.
   - **Details**: Implement functions to modify both types.

4. **Error Handling**
   - **Task**: Write a function that can return an error and demonstrate how to handle it.
   - **Details**: Provide clear examples of error checking.

5. **Modules**
   - **Task**: Create a simple module that exports functions for mathematical operations.
   - **Details**: Show how to import and use these functions in a main program.

### 10. OCaml
1. **Pattern Matching**
   - **Task**: Write a function that uses pattern matching to evaluate different shapes (e.g., circle, rectangle) and calculate area.
   - **Details**: Define types for the shapes.

2. **Higher-Order Functions**
   - **Task**: Create a higher-order function that takes a list and a function as parameters, applying the function to each element of the list.
   - **Details**: Use it to implement map and filter.

3. **Immutable Data Structures**
   - **Task**: Demonstrate the use of immutable lists and how to transform them without modifying the original.
   - **Details**: Provide examples of list operations.

4. **Modules and Functors**
   - **Task**: Create a module for a simple stack and implement a functor that can work with different types.
   - **Details**: Show how to use the functor with various types.

5. **Recursion**
   - **Task**: Implement a recursive function for calculating the greatest common divisor (GCD) of two numbers.
   - **Details**: Compare it with an iterative solution.

### 11. Erlang
1. **Processes and Message Passing**
   - **Task**: Create a simple process that receives messages and responds based on the content.
   - **Details**: Demonstrate how to send and receive messages.

2. **Supervision Trees**
   - **Task**: Implement a supervision tree that manages child processes and restarts them on failure.
   - **Details**: Use different restart strategies.

3. **Records**
   - **Task**: Define a record for storing user information and demonstrate how to create and manipulate it.
   - **Details**: Show how to use record syntax.

4. **List Comprehensions**
   - **Task**: Use list comprehensions to generate a list of squares for a given range.
   - **Details**: Explain the syntax and how it works.

5. **Functional Programming**
   - **Task**: Write functions that demonstrate higher-order programming concepts like map, reduce, and filter.
   - **Details**: Provide examples of each.

### 12. Elixir
1. **Modules and Functions**
   - **Task**: Create a module with a set of utility functions for string manipulation.
   - **Details**: Demonstrate how to import and use the module.

2. **Pattern Matching**
   - **Task**: Implement a function that uses pattern matching to parse different types of messages.
   - **Details**: Use this in a real-world scenario, like processing input.

3. **GenServer**
   - **Task**: Create a GenServer that maintains state for a simple counter application.
   - **Details**: Implement methods for incrementing and getting the current count.

4. **Protocols**
   - **Task**: Define a protocol for rendering different shapes and implement it for various shape types.
   - **Details**: Show how to use protocols in Elixir.

5. **Task and Asynchronous Programming**
   - **Task**: Write a program that uses `Task.async` and `Task.await` to perform asynchronous computations.
   - **Details**: Handle errors in the asynchronous context.

### 13. Gleam
1. **Type-safe Functions**
   - **Task**: Write a type-safe function that calculates the sum of a list of integers.
   - **Details**: Demonstrate how Gleam's type system prevents errors.

2. **Pattern Matching**
   - **Task**: Create a function that uses pattern matching to handle different shapes and calculates their areas.
   - **Details**: Define types for the shapes.

3. **Modules and Imports**
   - **Task**: Create a module that provides basic mathematical operations and import it in another module.
   - **Details**: Show how to structure Gleam projects with modules.

4. **Records**
   - **Task**: Define a record for a `User` and implement functions to create, update, and display user information.
   - **Details**: Demonstrate how to work with records in Gleam.

5. **Error Handling**
   - **Task**: Write a function that performs a calculation and returns either a result or an error.
   - **Details**: Show how to handle the error in the calling function.


### 14. Lua
1. **Tables and Metatables**
   - **Task**: Create a table to represent a simple bank account with methods for deposit and withdrawal.
   - **Details**: Use metatables to implement operator overloading for the addition of account balances.

2. **Coroutine Basics**
   - **Task**: Implement a simple producer-consumer model using coroutines.
   - **Details**: Demonstrate how coroutines can yield and resume execution.

3. **Module Creation**
   - **Task**: Create a Lua module that provides utility functions for string manipulation.
   - **Details**: Implement functions like reversing a string and counting vowels.

4. **Error Handling**
   - **Task**: Write a program that includes pcall to handle errors gracefully when performing file I/O operations.
   - **Details**: Show how to catch and handle errors without crashing the program.

5. **OOP with Metatables**
   - **Task**: Create a class-like structure using metatables for a simple `Shape` class with subclasses for `Circle` and `Rectangle`.
   - **Details**: Implement methods for calculating area and perimeter.

### 15. Python
1. **Decorators**
   - **Task**: Create a decorator that logs the execution time of a function.
   - **Details**: Demonstrate its use with a sample function.

2. **Context Managers**
   - **Task**: Implement a context manager that handles opening and closing files.
   - **Details**: Use the `with` statement to ensure the file is properly closed.

3. **List Comprehensions**
   - **Task**: Write a list comprehension that generates a list of squares for even numbers between 1 and 20.
   - **Details**: Show how to apply conditional logic within the comprehension.

4. **Generators**
   - **Task**: Create a generator function that yields Fibonacci numbers indefinitely.
   - **Details**: Demonstrate how to use `next()` to retrieve values from the generator.

5. **Error Handling with Exceptions**
   - **Task**: Write a function that divides two numbers and handles division by zero using custom exceptions.
   - **Details**: Define and raise a custom exception when division by zero occurs.

### 16. TypeScript
1. **Interfaces and Types**
   - **Task**: Define an interface for a `User` and create a function that accepts an object of that type.
   - **Details**: Implement the function to log user details.

2. **Generics**
   - **Task**: Implement a generic stack class that supports push and pop operations.
   - **Details**: Demonstrate type safety by using different data types.

3. **Union Types**
   - **Task**: Write a function that accepts either a string or a number and returns its type as a string.
   - **Details**: Use type guards to differentiate between the two types.

4. **Decorators**
   - **Task**: Create a simple class with a method that uses a decorator to log method calls.
   - **Details**: Show how to apply the decorator to the class method.

5. **Async/Await**
   - **Task**: Write a function that fetches data from a mock API using `async` and `await`.
   - **Details**: Handle potential errors with try/catch.


### 17. Ruby
- **Exercise: Blocks and Procs**
  - **Task**: Implement a method that takes a block and applies it to an array of numbers.
  - **Details**: 
    - Return a new array with the results of the block applied.

- **Exercise: Modules and Mixins**
  - **Task**: Create a module for logging and mix it into multiple classes.
  - **Details**: 
    - Demonstrate how to use the module methods in the classes.

- **Exercise: Active Record Basics**
  - **Task**: Use ActiveRecord to interact with a SQLite database.
  - **Details**: 
    - Implement a simple model with validations and queries.

- **Exercise: Metaprogramming**
  - **Task**: Write a method that dynamically creates getter and setter methods for a class.
  - **Details**: 
    - Use `define_method` to create methods at runtime.

- **Exercise: Enumerator and Lazy Evaluation**
  - **Task**: Create an enumerator that lazily generates Fibonacci numbers.
  - **Details**: 
    - Use the `Enumerator` class to create an infinite sequence.


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

