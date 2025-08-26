Online Quiz Management System

📌 Description

The Online Quiz Management System is a Java + MySQL based project that automates the entire quiz process. It provides a user-friendly platform where Admins can manage quizzes and questions, Students can attempt quizzes and track their progress, and Faculty can monitor student performance and results. This system reduces manual effort, ensures quick evaluation with auto-scoring, and maintains secure records in a database-driven environment.


---

🚀 Features

Admin Panel: Create, update, and delete quizzes and questions.

Student Module: Attempt quizzes, view instant scores, and track past performance.

Faculty Module: Manage quizzes and monitor student participation and results.

Auto-Scoring System: Evaluates answers instantly and stores results securely.

Leaderboard: Displays top-performing students.

Authentication: Secure login for Admins and Students.

Database Support: MySQL for reliable data storage and management.



---

🛠 Tech Stack

Frontend: HTML, CSS, JavaScript 

Backend: Core Java 

Database: MySQL 



---

📂 Project Structure

OnlineQuizManagementSystem/
├── src/
│   ├── Student.java
│   ├── Admin.java
│   ├── Quiz.java
│   ├── Question.java
│   ├── Result.java
│   ├── DatabaseUtil.java
│   ├── dao/
│   │   ├── StudentDAO.java
│   │   ├── AdminDAO.java
│   │   ├── QuizDAO.java
│   │   └── QuestionDAO.java
│   └── Main.java
├── README.md
└── screenshots/


---

⚙ Workflow

1. Admin logs in → Creates quizzes & adds questions.


2. Student registers/logs in → Attempts available quizzes.


3. System evaluates answers instantly → Stores results in MySQL.


4. Student can view results & track past attempts.


5. Faculty can view student performance & generate reports.

---

OOP Concept

Classes represent entities like Student, Admin, Quiz.

Encapsulation secures data like passwords and scores.

Inheritance avoids duplication by using a common User class.

Polymorphism allows login to act differently for Admin and Student.

Abstraction hides the complex result calculation from the user.



