⚡ Electric Charge Billing System

A simple Java console-based application that calculates the total electricity bill based on the number of units consumed. The program applies slab-wise billing rates and includes an 18% surcharge (tax).

📌 Features

Accepts electricity unit consumption as input

Calculates bill using slab-based pricing

Adds 18% surcharge to total bill

Allows repeated calculations until user exits

Simple and user-friendly console interface

| Units Consumed | Rate per Unit (₹) |
| -------------- | ----------------- |
| 0 – 50         | ₹8                |
| 51 – 75        | ₹10               |
| 76 – 100       | ₹12               |
| Above 100      | ₹15               |


ElectricChargeBillingSystem/
│
├── ElectricChargeUnit.java
└── README.md

💻 Technologies Used

Java

Java Scanner Class (for user input)



📖 How It Works

User enters total electricity units consumed.

Program calculates the bill based on predefined slabs.

18% surcharge is added.

Final bill amount is displayed.

User can type:

YES → To calculate another bill

NO → To exit the program
