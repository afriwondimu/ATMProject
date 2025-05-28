# Java ATM Interface 🏧

A console-based ATM Interface built in Java, simulating banking operations like PIN verification, balance checks, withdrawals, and deposits. This project, assigned by our instructor [**Fasika Abera**](https://www.linkedin.com/in/fasika-abera-204033188?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app), showcases Object-Oriented Programming (OOP) principles: encapsulation, inheritance, polymorphism, and abstraction. 🌟

## 📑 Table of Contents

- [Overview](#overview-)
- [Features](#features-)
- [Project Structure](#project-structure-)
- [OOP Concepts](#oop-concepts-)
- [OOP Lessons Learned](#oop-lessons-learned-)
- [Prerequisites](#prerequisites-)
- [Setup](#setup-)
- [How to Run](#how-to-run-)
- [Usage](#usage-)
- [Group Members](#group-members-)
- [License](#license-)

## Overview ✨

This Java ATM Interface mimics a real ATM, letting users manage Savings or Checking accounts via a console. It supports secure PIN authentication, transactions with fees, and robust error handling, all while adhering to Java Mini Project guidelines for clean code and OOP principles. 🏦

## Features 🚀

- 🔒 **PIN Verification**: Secure 4-digit PIN access.
- 💰 **Account Types**: Savings ($0.5 fee) and Checking ($0.2 fee).
- 🖱️ **Operations**:
  - Check balance
  - Withdraw funds (with fees)
  - Deposit funds
  - Exit
- ⚠️ **Error Handling**: Friendly messages for invalid inputs or insufficient funds.
- 🛠️ **OOP Principles**: Fully implements encapsulation, inheritance, polymorphism, and abstraction.

## Project Structure 📂

```
ATMProject/
├── src/
│   └── atmproject/
│       ├── Account/
│       │   ├── Account.java          # Abstract account class
│       │   ├── CheckingAccount.java  # Checking account logic
│       │   ├── SavingAccount.java   # Savings account logic
│       ├── models/
│       │   ├── ATM.java             # ATM console interface
│       │   └── ATMOperations.java   # ATM operations interface
│       └── Main.java                # Program entry point
├── .vscode/
│   ├── launch.json                  # Debugging config
│   └── settings.json                # Project settings
└── README.md                        # You're here! 😊
```

## OOP Concepts 🛠️

- **Encapsulation**: Private `balance` and `pin` fields with getters/setters. 🔐
- **Inheritance**: `SavingAccount` and `CheckingAccount` extend `Account`. 🌳
- **Polymorphism**: `getTransactionFee()` varies by account type. 🔄
- **Abstraction**: `ATMOperations` interface and `Account` class hide details. 🎭

## OOP Lessons Learned 📚

Building this project taught us:

- 🔒 **Encapsulation** protects data (e.g., PIN, balance).
- 🌳 **Inheritance** reuses code across account types.
- 🔄 **Polymorphism** allows flexible transaction fees.
- 🎭 **Abstraction** simplifies complex logic for maintainability.
- 💡 Applying OOP makes code modular and scalable.

## Prerequisites 🛠️

- ☕ **JDK**: Version 11 or later.
- 💻 **IDE**: VS Code (recommended) or any Java IDE.
- 🔌 **VS Code Extensions**: Java Extension Pack (Microsoft).

## Setup 🔧

1. **Clone the Repo**:

   ```bash
   git clone https://github.com/afriwondimu/ATMProject.git
   cd ATMProject
   ```

2. **Open in VS Code**:

   - Open `ATMProject` folder (`File > Open Folder`).
   - Install Java Extension Pack for syntax support.

3. **Check Structure**:

   - Place files in:
     - `src/atmproject/Account/` for account classes.
     - `src/atmproject/models/` for ATM classes.
     - `src/atmproject/` for `Main.java`.
   - Ensure package declarations:
     - `package atmproject.Account;`
     - `package atmproject.models;`
     - `package atmproject;`

4. **Configure VS Code** (optional):

   - Add `.vscode/settings.json`:

     ```json
     {
         "java.project.sourcePaths": ["src"],
         "java.project.outputPath": "bin",
         "java.project.referencedLibraries": []
     }
     ```

## How to Run ▶️

1. **Compile**:

   ```bash
   javac src/atmproject/**/*.java -d bin
   ```

2. **Run**:

   ```bash
   java -cp bin atmproject.Main
   ```

3. **VS Code**:

   - Open `Main.java` and click "Run" above the `main` method.

## Usage 💻

1. **Start**: See group members and select account type (1: Savings, 2: Checking).
2. **Authenticate**: Enter PIN (`1234`).
3. **Menu**:
   - `1`: Check balance
   - `2`: Withdraw (with fees)
   - `3`: Deposit
   - `4`: Exit
4. **Errors**: Clear messages for invalid inputs.

**Sample Output**:

```
=== ATM Interface Project ===
Group Members:
1. Afri Wondimu - ID: 373677
2. Abrham Solomon - ID: 248574-16
3. Abrham Fekede - ID: 9767-16
4. Dagim Aboneh - ID: 364215-16
5. Mesay Mesfin - ID: 655392-16
6. Yabsira Zenebe - ID: 469869-16
===========================

Select account type:
1. Savings Account
2. Checking Account
Enter choice (1 or 2): 1
Savings Account selected. Initial balance: $1000.0
Enter PIN: 1234

=== ATM Menu ===
1. Check Balance
2. Withdraw
3. Deposit
4. Exit
Choose an option: 1
Current balance: $1000.0
```

## Group Members 👥

- Afri Wondimu - ID: 373677
- Abrham Solomon - ID: 248574-16
- Abrham Fekede - ID: 9767-16
- Dagim Aboneh - ID: 364215-16
- Mesay Mesfin - ID: 655392-16
- Yabsira Zenebe - ID: 469869-16

**Instructor**: [**Fasika Abera**](https://www.linkedin.com/in/fasika-abera-204033188?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app)

## License 📜

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
