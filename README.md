# **AI Job Suggestion System: Java + Python Integration**

This project integrates a **Java-based GUI** with a **Python script** to provide **job recommendations** based on the user's qualifications and skills. The user enters their details through the Java GUI, and the Python script processes these details to generate relevant job suggestions using the Google Custom Search API.

---

## **Project Structure**

├── Java_Project/ # Java application files (GUI and logic)

│ ├── src/ # Java source code

│ ├── user_input.txt # Input file for user details

│ ├── ai_output.txt # Output file containing job suggestions

│ ├── Java_GUI.java # Java GUI logic

│ └── ...

├── PythonProject1/ # Python-based AI processing files

│ ├── ai_insight.py # Python script for job recommendations

│ └── ...

└── README.md # Project documentation


---

## **Features**

- **Java GUI**: Allows users to input personal details, including qualifications and skills.
- **Python Script**: Processes input using AI to generate job recommendations based on the user's profile.
- **Integration**: Java application runs the Python script and displays results to the user.

---

## **Setup Instructions**

### **Prerequisites**

1. **Java**: Make sure you have Java installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   
2. **Python**: Install Python 3.x from [here](https://www.python.org/downloads/). Ensure you also install the required libraries.

3. **Python Libraries**: Make sure you have the required libraries for the Python script.

```bash
pip install requests
