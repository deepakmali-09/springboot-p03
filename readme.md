# Spring Boot Project - Payment System with ApplicationContext and Bean  

This project implements a simple payment system using **ApplicationContext** and **Bean** in Spring Boot. It is designed to demonstrate how to dynamically select and use payment providers based on user input.  

## **Features**  
- Modular implementation of multiple payment providers.  
- Dynamic selection of payment providers based on user input.  
- Demonstrates the power of Spring's `ApplicationContext` for managing beans and dependencies.  

## **Technologies Used**  
- **Spring Boot**: Framework for building Java-based applications.  
- **Java**: Programming language used for the implementation.  
- **Maven**: Build automation tool.  

## **How It Works**  
1. Users make an online purchase and select their preferred payment provider (e.g., Paytm, RozerPay, etc.).  
2. The application retrieves the corresponding payment provider bean using `ApplicationContext`.  
3. The selected provider processes the payment and displays its name on the console.  

## **How to Run**  
1. Clone this repository:  
   ```bash  
   git clone https://github.com/deepakmali-09/springboot-p03.git
