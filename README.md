# 📦 Java CLI Inventory Management System

> **A lightweight, command-line utility designed to help small businesses track inventory and process customer orders efficiently.**

---

## 📑 Table of Contents
- [Overview](#-overview)
- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Environment Setup](#-environment-setup)
- [Installation & Execution](#-installation--execution)
- [Testing Instructions](#-testing-instructions)
- [Screenshots](#-screenshots)

---

## 📖 Overview
This project is a standalone Java Command Line Interface (CLI) application. It digitizes the manual tracking of retail stock and customer orders using core Object-Oriented Programming (OOP) principles and standard File I/O for data persistence. 

*Note: This application is designed to be fully executable from a terminal environment without requiring any GUI-based setup.*

## ✨ Features
- **Inventory Control:** Add, view, and update product details (Name, Price, Stock).
- **Order Processing:** Log customer orders and automatically deduct quantities from the active inventory.
- **Data Persistence:** Utilizes Java File I/O to save data locally (`inventory.txt`), ensuring records are maintained between sessions.
- **Input Validation:** Error handling to prevent invalid inputs and application crashes.

## 🛠 Technologies/Tools Used
- **Language:** Java (JDK 8 or higher)
- **Storage:** Flat file storage via standard Java File I/O
- **Version Control:** Git & GitHub

---

## ⚙️ Environment Setup & Configuration
To run this project, ensure your environment meets the following prerequisites. **No external dependencies, frameworks, or database servers are required.**

1. **Java Development Kit (JDK):** Ensure JDK 8 or a newer version is installed on your machine.
   - Verify installation by running `java -version` and `javac -version` in your terminal.
2. **System Path:** Ensure the `java` and `javac` commands are added to your system's environment variables.

---

## 🚀 Installation & Execution
Follow these step-by-step instructions to compile and run the project strictly via the command line.

**Step 1: Clone the Repository**
Open your terminal and run:
```bash
git clone [https://github.com/yourusername/java-inventory-cli.git](https://github.com/yourusername/java-inventory-cli.git)
cd java-inventory-cli
