# Lab-Seatwork-4-Solid-Principles

**1.** The following object violates the **Single Responsibility Principle (SRP)**. Make the adjustments in the form of Java code to correct the violation.

![image](https://github.com/user-attachments/assets/48bf49fa-a9cf-4839-accd-5d34a584693f)

**2.** The following code violates the **Open/Close Principle**.  Refactor the program to remove the violation. 

```java
public class Customer {

  private String name;
  private String type; // "Student", "Senior Citizen", or "Regular"

  public Customer(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public double calculateDiscount(double amount) {
    if (type.equalsIgnoreCase("Student")) {
      return amount * 0.05;
    } else if (type.equalsIgnoreCase("Senior Citizen")) {
      return amount * 0.10;
    } else {
      return 0.0; // No discount for Regular
    }
  }

  public double applyDiscount(double amount) {
    return amount - calculateDiscount(amount);
  }
}
```

**3.** The following design has the following problem:
* The <span style="color:green">SmartPhone</span> interface defines methods for making calls, sending SMS, browsing the web, and taking pictures.
* While  smartphones (<span style="color:green">iPhone</span> and <span style="color:green">Samsung</span>) can utilize all functionalities, a basic phone (<span style="color:green">BasicPhone</span>) only needs calling and SMS capabilities.
* Forcing the <span style="color:green">BasicPhone</span> class to implement unused methods (<span style="color:green">browseWeb</span> and <span style="color:green">takePicture</span>) violates ISP. <br><br>
![image](https://github.com/user-attachments/assets/b3b36cb8-1bd6-42e0-b848-cb61988bd9e9)


&nbsp;&nbsp;&nbsp;&nbsp;Show your solution in codes on how to remove the **Interface Segregation** problem. 

**4.** Refactor the following codes applying the **Dependency Inversion Principle**:

```java
public class PaymentProcessor {

  public void processPayment(Order order) {
    String paymentMethod = order.getPaymentMethod();

    if (paymentMethod.equals("ewallet")) {
      EWallet ewallet = new EWallet();
      ewallet.pay(order.getAmount());
      System.out.println ("You are paying in GCash")
    } else if (paymentMethod.equals("cash")) {
      System.out.println ("You are paying in Cash").
    } else if (paymentMethod.equals("creditcard")) {
      CreditCard creditCard = new CreditCard();
      creditCard.charge(order.getAmount());
      System.out.println ("You are paying using Credit Card")
    } else {
      throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
    }

  }
}
```

### Naming Conventions:
**1.**  Class name must be a NOUN (singular).  
**2.**  Class names must start with capital letters.  
**3.**  Attribute name and method name should start with a small letter.  
**4.**  Method name should be a verb.  
