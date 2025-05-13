# BlockChain-Java

A simple blockchain implementation in Java to understand the core principles behind blockchain technology such as block hashing, proof-of-work mining, and chain validation.

## Overview

This project is educational and demonstrates how blockchains work at a basic level:

- Each block contains data, a hash, the previous block’s hash, a timestamp, and a nonce.
- Implements **proof-of-work** mining with adjustable difficulty.
- Verifies integrity by validating each block’s hash and link.
- Outputs the full chain in pretty-printed JSON using Google's Gson.

---

## Project Structure

```

BlockChain-Java/
├── pom.xml
├── Block.java
├── App.java
└── (other supporting files)

````

---

##  How to Run

###  Prerequisites

- Java 8 or higher
- Maven installed
- Git (optional for cloning)

###  Steps to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/youni20/BlockChain-Java.git
   cd BlockChain-Java
````

2. **Compile the project with Maven**:

   ```bash
   mvn compile
   ```

3. **Run the application**:

   ```bash
   mvn exec:java -Dexec.mainClass="com.younuschains.App"
   ```

> Make sure you're connected to the internet when Maven pulls dependencies (like Gson) for the first time.

---

## Tech Stack

* Java
* Maven
* SHA-256 (MessageDigest)
* Gson (for JSON serialization)

---

## Concepts Demonstrated

*  SHA-256 hashing
*  Block linking via previous hash
*  Proof-of-work algorithm
*  Blockchain validation
*  JSON formatting with Gson

---

## Output Example

```
Trying to Mine block 1...
Block Mined!!! : 00000af3...

Trying to Mine block 2...
Block Mined!!! : 00000bd9...

Blockchain is Valid: true

[
  {
    "data": "The First Block!",
    "hash": "00000af3...",
    "previousHash": "0",
    ...
  },
  ...
]
```

---

##  Author

* **Younus Mashoor**
* GitHub: [@youni20](https://github.com/youni20)