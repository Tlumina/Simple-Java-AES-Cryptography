# 🔐 Simple AES Cryptography in Java

A beginner-friendly **Java project** that demonstrates how to securely encrypt and decrypt data using **AES (Advanced Encryption Standard)**.

This project is perfect for anyone learning **Cryptography** or **Cybersecurity basics**, as it shows how symmetric-key encryption works in a practical way.

---

## 📌 Features
✅ **Encrypt & Decrypt Messages** – Easily protect and recover sensitive information.  
✅ **Random AES Key Generation** – A new secure key is generated for every encryption.  
✅ **Base64 Encoding** – Ensures ciphertext and keys are displayed safely.  
✅ **Command-line Interface** – Simple and interactive user experience.  

---

## 🖥️ How It Works

### 🔑 **Encryption Mode**
1. Enter a plaintext message.  
2. The program generates a random 128-bit AES key.  
3. Your message is encrypted and converted to a Base64 string.  
4. The encrypted message **and** AES key are displayed — save the key to decrypt later.  

### 🔓 **Decryption Mode**
1. Enter an encrypted message and the saved AES key.  
2. The program rebuilds the AES key from the provided string.  
3. The message is decrypted back into readable text.  

---

## 📂 Project Structure

```
SimpleCryptography.java
README.md
```

---

## 🧑‍💻 Code Example

```java
<code omitted for brevity - see SimpleCryptography.java>
```

---

## 🧪 Example Run

```
Welcome to Simple Cryptography: Securing your data.
1. Encrypting
2. Decrypting
Which do you choose: 1 or 2 - 1
Enter your information to be encrypted: Agatha is good.
Your Encrypted information: 9eziaHewC/7YCAZFP18/Y9eBpUgqJszsxNBb95cSLPk=
Encrypted AES key (save this to decrypt later): zRHluDTjqDf3IcCWdvvcog==
```

Then, decrypt using **Option 2** with the same encrypted text and AES key.

---

## 🎓 What I Learned

- **Key Management is Critical** – If the AES key is lost or leaked, the security is compromised.  
- **Symmetric Encryption Basics** – AES is fast and secure for protecting data.  
- **Secure Data Transmission** – Base64 encoding ensures keys and ciphertext can be shared safely.  

---

## 🚀 How to Run

1. Clone this repo:  
```bash
git clone https://github.com/your-username/simple-aes-cryptography.git
cd simple-aes-cryptography
```

2. Compile and run:  
```bash
javac SimpleCryptography.java
java SimpleCryptography
```

3. Follow the prompts to encrypt or decrypt messages.  

---

## 🏷️ License
This project is licensed under the **MIT License** – free to use, modify, and share.
