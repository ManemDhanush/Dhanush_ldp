This file is part of the design patterns

Builder pattern:
    The Builder design pattern is a creational pattern that provides a flexible and readable way to construct complex objects. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

    In the code provided, the Builder design pattern is used to construct a Person object with multiple attributes:

    Person Class:
        - Represents the object being constructed.
        - Contains private fields for various attributes such as firstName, lastName, age, address, etc.
        - Provides getter methods for all attributes.
    PersonBuilder Class (Builder):
        - Nested static class within the Person class.
        - Provides a way to construct a Person object step by step.
        - Contains a constructor that takes mandatory attributes (e.g., firstName, lastName) as parameters.
        - Provides setter methods for optional attributes (e.g., age, address) to customize the object being constructed.
        - Returns this reference in the setter methods to enable method chaining.
        - Defines a build() method that creates a new Person object using the provided attributes and returns it.
    The key advantages of using the Builder design pattern in this code are:
        - It simplifies the process of creating Person objects by providing a clear and readable way to set attributes.
        - It allows constructing objects step by step and adding optional attributes as needed.
        - It avoids the need for multiple constructors or telescoping constructors with numerous parameters.
        - It ensures the immutability of the Person object once it is constructed, as the Person class has only getter methods and no public setter methods.

    To create a Person object, the client code uses the PersonBuilder class to set the desired attributes and calls the build() method to obtain the final Person object.

    By utilizing the Builder design pattern, the code achieves a clean separation between the construction logic and the representation of the Person object. It improves the readability, flexibility, and maintainability of the code, especially when dealing with complex objects with many attributes.




Factory pattern:
    The Factory Method design pattern is a creational pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate. In the calculator implementation, the Factory Method pattern is used to create different calculator instances based on the selected mode.

    The key components of the code are as follows:

    1. Calculator Interface:
        - Defines the common interface for all calculator implementations.
    2. Calculator Implementations:
        - BasicCalculator: Implements the Calculator interface and performs basic arithmetic calculations (+, -, *, /).
        - ScientificCalculator: Implements the Calculator interface and extends the BasicCalculator to include additional scientific operations (square root, power).
        - ProgrammerCalculator: Implements the Calculator interface and provides specialized calculations for programmers.
    3. CalculatorFactory:
        - A factory class that encapsulates the logic for creating the appropriate calculator instance based on the selected mode.
        - Provides a static method createCalculator that takes the mode as a parameter and returns the corresponding calculator instance.
    4. Main Class:
        - Contains the main entry point of the program.
        - Uses a do-while loop to repeatedly prompt the user for calculator mode selection and perform calculations.
        - Utilizes a switch case to handle different calculator modes and create the corresponding calculator instance using the CalculatorFactory.
        - The performCalculation method handles user input for numbers and operators, performs the calculation using the selected calculator, and displays the result.
        - Handles exceptions such as ArithmeticException and UnsupportedOperationException to provide appropriate error messages.
    
    
    The Factory Method pattern in this calculator implementation provides a way to create calculator objects without exposing the instantiation logic to the client. It allows for easy extensibility by adding new calculator modes without modifying existing code.

    By utilizing the Factory Method design pattern, the code achieves a separation of concerns, maintains code modularity, and provides a flexible way to create different calculator instances based on the desired mode.