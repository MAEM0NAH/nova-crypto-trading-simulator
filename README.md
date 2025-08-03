# nova-crypto-trading-simulator

**Nova** is a Java-based cryptocurrency trading simulator that models the basic components of a trading system, including:

- 🧑‍💼 **Broker**
- 💰 **Wallet**
- 📊 **CryptoCurrency**
- 🏛️ **Trading Platform**

The application is designed for educational purposes to help users understand trading logic and Java object-oriented programming through simulation of buy/sell operations.

---

## 🚀 Features

- Simulates buying and selling crypto assets
- Tracks asset balances through a wallet
- Includes basic broker interaction logic
- Fully object-oriented Java architecture
- Console-based interaction (can be extended to GUI)

---

## 🏗️ Project Structure

├── Broker.java             # Handles the execution of buy and sell operations between the user and cryptocurrencies
├── Wallet.java             # Manages the user's crypto balances (deposit, withdraw, check balance)
├── CreptoCurrency.java     # Represents cryptocurrency objects (e.g., Bitcoin, Ethereum)
├── PlatFormNova.java       # Coordinates operations between the wallet, broker, and crypto assets
└── Nova.java               # Entry point of the program (contains the main method)
