# Eclipse Paho MQTT v3 Sample Application

This project is a sample MQTT v3 Java application using the **Eclipse Paho** client library. It demonstrates how to connect to an MQTT broker, publish, and subscribe to topics using the `org.eclipse.paho.client.mqttv3` library.

The project is built using **Apache Maven** and includes a configuration to generate a **runnable JAR** file with all dependencies bundled, making it easy to execute from the command line.

---

## Project Structure and `pom.xml` Overview

The `pom.xml` is based on the parent Paho project `java-parent` and includes the following key configurations:

- Java Version: 1.8
- Dependency: `org.eclipse.paho.client.mqttv3` version `1.2.5`
- Plugins:
  - `maven-compiler-plugin`: Compiles the Java code.
  - `maven-assembly-plugin`: Bundles dependencies into a single runnable JAR with a `Main-Class` defined.

Here’s the relevant snippet from the `pom.xml`:
```xml
<mainClass>org.eclipse.paho.sample.mqttv3app.Main</mainClass>
```
If your application's main class is different, be sure to update this value accordingly.

---

## How to Run the Sample

### Prerequisites

- Java 1.8 installed and configured in your `JAVA_HOME`
- Apache Maven installed and accessible via `mvn` command
---

### Step 1: Clone or Download the Project

```bash
git clone https://github.com/eclipse-paho/paho.mqtt.java.git
cd org.eclipse.paho.sample.mqttv3app
```
---

### Step 2: Build the Project

Use Maven to compile the project and create a runnable JAR:

```bash
mvn clean package
```

This will generate a file like:

```
target/org.eclipse.paho.sample.mqttv3app-1.2.5-jar-with-dependencies.jar
```

---

### Step 3: Run the Application

Run the JAR using the following command:

```bash
java -jar target/org.eclipse.paho.sample.mqttv3app-1.2.5-jar-with-dependencies.jar <sample-you-want-to-run>
```

If your `Main` class expects arguments (like broker URL, topic, etc.), provide them accordingly:

```bash
java -jar target/org.eclipse.paho.sample.mqttv3app-1.2.5-jar-with-dependencies.jar <sample-you-want-to-run> -a <action> -b <broker> -u <user>
```

---

## Customize the Application

The main class defined in the `pom.xml` is:

```xml
<mainClass>org.eclipse.paho.sample.mqttv3app.Main</mainClass>
```

You can replace this with your own class that contains the `public static void main(String[] args)` method.

If you change the main class name, don’t forget to update the `<mainClass>` tag in the `maven-assembly-plugin` section of the `pom.xml`.

---
