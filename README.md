# LevelSuperMind Appium Assignment

## Objective

The purpose of this project is to automate the login functionality of the LevelSuperMind application using Appium. The test cases cover login scenarios with both email and phone number authentication.

## Directory Structure

| Directory/File                          |
|-----------------------------------------|
| `luhder-levelsupermind_appium_assignment/` |
| ├── `README.md`                         |
| └── `LevelSuperMind/`                   |
|     ├── `pom.xml`                       |
|     ├── `src/test/java/loginEmail/`     |
|     │   └── `ValidLogin.java`           |
|     ├── `src/test/java/loginPhone/`     |
|     │   ├── `InvalidLogin.java`         |
|     │   └── `ValidLogin.java`           |
|     └── `target/`                       |
|         ├── `classes/META-INF/`         |
|         │   ├── `MANIFEST.MF`           |
|         │   └── `maven/`                |
|         └── `test-classes/`             |
|             ├── `loginEmail/`           |
|             └── `loginPhone/`           |


## Preconditions

**Before running the tests, ensure the following prerequisites are met:**

Java Development Kit (JDK) 8 or later - Install and configure the Java environment.

Maven - Ensure Maven is installed and configured properly.

Android Studio - Install Android Studio and set up an emulator or a real device.

Appium Server - Download and install Appium Server.

Node.js and npm - Required for Appium setup.

Android Debug Bridge (ADB) - Ensure ADB is configured and working properly.

Device Settings - Enable Developer Mode and USB Debugging on the test device.

Required Dependencies - Install required dependencies using Maven.

## Setup Instructions**

1. Clone the Repository

git clone <repository_url>
cd luhder-levelsupermind_appium_assignment

2. Install Dependencies

mvn clean install

3. Start Appium Server

appium

4. Connect an Android Device or Start Emulator

Ensure the device is connected or an emulator is running:

adb devices

5. Configure the Test Capabilities

Update the capabilities section in your test scripts:

DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("platformName", "Android");
caps.setCapability("deviceName", "Your_Device_Name");
caps.setCapability("app", "path/to/app.apk");
caps.setCapability("automationName", "UiAutomator2");

6. Run the Tests

To execute the test cases, run:

mvn test

**Test Cases**

Login with Email

Valid Login (ValidLogin.java): Verify login with correct email and password.

Login with Phone

Valid Login (ValidLogin.java): Verify login with a valid phone number and OTP.

Invalid Login (InvalidLogin.java): Verify login fails with an invalid phone number.

**App Link**
-	Android app link - https://play.google.com/store/search?q=level%20supermind&c=apps
-	iOS app link - https://apps.apple.com/in/app/level-meditation-sleep-yoga/id1623828602

