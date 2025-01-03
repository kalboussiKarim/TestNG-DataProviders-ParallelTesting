# TestNG DataProviders & Parallel Testing

This project provides practical demonstrations of advanced TestNG features such as `@DataProvider` and `@Parameters` annotations, along with examples of sequential and parallel testing using XML configuration.

## Features and Examples

### 1. **Using @DataProvider**
   - Demonstrates the use of `@DataProvider` to supply data to test cases.
   - Shows how to utilize the `dataProvider` attribute of the `@Test` annotation.
   - Explains how TestNG executes a test method as many times as the data provided, without the need for manual loops.
   - Provides a clear example of how to test with multiple data sets.

### 2. **Using @Parameters for XML-Based Configuration**
   - Introduces the `@Parameters` annotation to receive parameters from a TestNG XML file.
   - Includes an example of passing a browser driver type (e.g., Chrome, Firefox, Safari, Edge) to test cases.

### 3. **Sequential Testing with Multiple Drivers**
   - Demonstrates how to execute sequential testing with three different drivers: Chrome, Firefox, and Edge.
   - Explains the importance of sequential execution in specific scenarios.

### 4. **Parallel Testing with XML Configuration**
   - Illustrates how to configure parallel testing using the `parallel` attribute in TestNG XML files.
   - Provides a separate XML file example to demonstrate the parallel execution of tests across different drivers.
   - Explains the benefits of parallel testing in reducing execution time and increasing efficiency.

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/kalboussiKarim/TestNG-DataProviders-ParallelTesting.git
   ```
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Explore the examples in the provided code files.
4. Run the tests directly or via the provided TestNG XML configuration files.

## Prerequisites
- Java Development Kit (JDK) installed.
- TestNG library integrated with your project.
- A basic understanding of Java programming and Selenium WebDriver (if using browser examples).

## Learning Outcomes
By exploring this project, you will:
- Master the use of `@DataProvider` to supply data to test cases efficiently.
- Learn how to pass parameters from XML files using `@Parameters`.
- Understand the setup and execution of sequential testing across multiple drivers.
- Gain experience in configuring and executing parallel tests to optimize test suite performance.

