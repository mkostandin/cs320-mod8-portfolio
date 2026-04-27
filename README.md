# CS 320: Software Testing, Automation, and Quality Assurance

## Portfolio Artifacts
This repository contains key artifacts demonstrating my proficiency in software testing, automated quality assurance, and defensive programming. 
* **Contact Service (Java/JUnit):** The source code and comprehensive unit test files for a back-end contact management service.
* **Summary and Reflections Report:** A detailed analysis of the testing strategies, boundary value analysis, and quality assurance mindsets applied during development.

## Engineering Reflection

**Ensuring Functionality and Security**
Making sure that software is functional and secure requires adopting a preventative, almost adversarial mindset during development. Instead of testing for ideal conditions, I ensure functionality by aggressively targeting boundary values and edge cases. By enforcing strict data constraints directly in the constructors and setters—such as immediately throwing an `IllegalArgumentException` for invalid inputs—I prevent malformed data from ever entering the system. Furthermore, relying on comprehensive JUnit test suites to maintain high code coverage guarantees that the application remains resilient and secure as it scales, preventing minor digital logic errors from cascading into severe system failures.

**Interpreting and Incorporating User Needs**
Translating user needs into a program means looking beyond the "happy path." While users explicitly ask for features that easily store and retrieve their data, their implicit need is a system that protects their data's integrity at all costs. When provided with business requirements, I incorporate them by translating those rules into hardcoded logic and strict parameter limits. Anticipating user needs means anticipating how the system might be misused, and building invisible guardrails to ensure the end-user experience remains predictable, seamless, and error-free.

**Approaching Software Design**
My approach to software design is heavily rooted in defensive programming and automated continuous integration. A system is only as strong as its weakest component, which is why I design domain objects that are strictly self-validating; they manage their own state and refuse to be instantiated with invalid parameters. By isolating these components and verifying them through rigorous, automated unit testing, I can confidently integrate them into broader services. Treating comprehensive testing as a non-negotiable exit criterion prevents technical debt and ensures the long-term maintainability of the software architecture.
