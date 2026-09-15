# 🎯 𝐏𝐫𝐨𝐣𝐞𝐜𝐭 𝐒𝐭𝐚𝐭𝐞𝐦𝐞𝐧𝐭: 𝐈𝐧𝐯𝐞𝐧𝐭𝐨𝐫𝐲 & 𝐎𝐫𝐝𝐞𝐫 𝐌𝐚𝐧𝐚𝐠𝐞𝐦𝐞𝐧𝐭 𝐒𝐲𝐬𝐭𝐞𝐦

> *Transforming manual retail operations through a lightweight, command-line digital solution.*

---

## 🚨 𝟏. 𝐏𝐫𝐨𝐛𝐥𝐞𝐦 𝐒𝐭𝐚𝐭𝐞𝐦𝐞𝐧𝐭
Small retail shops and independent sellers frequently struggle to track stock levels and process daily orders efficiently. Relying on physical paper ledgers or disorganized spreadsheets often leads to **human error**, resulting in:
* 📉 Inaccurate inventory counts.
* ❌ Lost order records.
* ⏳ Difficulty identifying when to restock critical items.

*There is a critical need for a streamlined, digital solution to maintain accurate records without requiring the business owner to invest in or learn complex, heavy software systems.*

---

## 🔭 𝟐. 𝐒𝐜𝐨𝐩𝐞 𝐨𝐟 𝐭𝐡𝐞 𝐏𝐫𝐨𝐣𝐞𝐜𝐭
This project will deliver a **standalone Java Command Line Interface (CLI) application** designed to completely digitize manual inventory and order tracking. 

**The system will:**
* Process core **CRUD** (Create, Read, Update, Delete) operations for retail stock.
* Handle **automated stock deductions** when new customer orders are processed.
* Rely entirely on **local Java File I/O** for data persistence (e.g., `inventory.txt`), maintaining simplicity and portability by removing the need for external database servers or GUI configurations.

---

## 👥 𝟑. 𝐓𝐚𝐫𝐠𝐞𝐭 𝐔𝐬𝐞𝐫𝐬

| User Group | Core Need |
| :--- | :--- |
| 🏪 **Small Retail Shop Owners** | A reliable, zero-cost method to track daily stock and overall sales. |
| 📦 **Independent Sellers** | A fast, keyboard-driven tool to process orders quickly without complex menus. |
| 🛒 **Retail Staff/Cashiers** | A highly straightforward interface to log transactions during busy hours. |

---

## ✨ 𝟒. 𝐇𝐢𝐠𝐡-𝐋𝐞𝐯𝐞𝐥 𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬
* 📝 **Inventory Management:** Add new products (ID, name, price, quantity), update active stock levels, and view a comprehensive, formatted catalog of all available items.
* ⚙️ **Automated Order Processing:** Log customer orders by inputting a product ID; the system calculates the total and dynamically deducts the purchased quantity.
* 💾 **Local Data Persistence:** Instantly serializes and saves all data to local text files, ensuring records are safely maintained between application sessions.
* 🛡️ **Robust Input Validation:** Continuously monitors user inputs to prevent system crashes caused by invalid data entry (e.g., entering letters for numeric menus or negative stock values).

---
