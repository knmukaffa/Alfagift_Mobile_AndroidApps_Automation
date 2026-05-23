# Alfagift Mobile Android Apps Automation

Mobile Automation Testing framework using:

* Java 17
* Appium
* Selenium
* TestNG
* Cucumber BDD
* Maven
* Page Object Model (POM)

This project is created for Mobile Automation Testing using Android real device with Appium framework.

---

# Tech Stack

| Tools            | Version     |
| ---------------- | ----------- |
| Java             | JDK 17      |
| Maven            | 3.9.x       |
| Appium Server    | 2.x         |
| Node JS          | 18+         |
| Android SDK      | Latest      |
| Appium Inspector | Latest      |
| IntelliJ IDEA    | Recommended |

---

# Prerequisites

Before running this project, make sure the following tools are installed:

## 1. Install Java JDK 17

Verify installation:

```bash
java -version
```

Expected result:

```bash
java version "17"
```

---

## 2. Install Maven

Verify installation:

```bash
mvn -version
```

---

## 3. Install Node JS

Verify installation:

```bash
node -v
npm -v
```

---

## 4. Install Appium

Install Appium globally:

```bash
npm install -g appium
```

Verify installation:

```bash
appium -v
```

---

## 5. Install Appium Doctor

```bash
npm install -g appium-doctor
```

Verify:

```bash
appium-doctor
```

---

## 6. Install Android Studio

Install:

* Android SDK
* Platform Tools
* SDK Command Line Tools

---

# Environment Variables

Add the following environment variables:

## ANDROID_HOME

```text
C:\Users\YOUR_USERNAME\AppData\Local\Android\Sdk
```

---

## JAVA_HOME

```text
C:\Program Files\Java\jdk-17
```

---

# Add to PATH

```text
%ANDROID_HOME%\platform-tools
%ANDROID_HOME%\cmdline-tools\latest\bin
%JAVA_HOME%\bin
```

---

# Verify ADB Connection

Connect Android real device with USB Debugging enabled.

Run:

```bash
adb devices
```

Expected result:

```bash
List of devices attached
XXXXXXXX device
```

---

# Start Appium Server

Run Appium server:

```bash
appium
```

Expected result:

```bash
Appium REST http interface listener started
```
---

# Open Project

Open project using IntelliJ IDEA.

---

# Install Dependencies

Reload Maven project or run:

```bash
mvn clean install
```

---

# Running Automation Test

Run test using:

```bash
mvn clean test
```

or run specific runner:

```bash
TestRunner.java
```

---

# Author

Khairun Najmi M

Created for QA Automation Technical Test.


# Automation Script Test Run Sample:

https://drive.google.com/file/d/1_119BwNHLD__iJEGgVw3eC-P5v4C52tB/view?usp=drive_link
