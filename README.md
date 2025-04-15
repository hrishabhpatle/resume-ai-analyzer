# 📄 Resume AI Analyzer

A Spring Boot-based application that analyzes uploaded resumes using OpenAI and provides smart insights for recruitment or self-improvement.

---

## 🚀 Features

- ✅ Upload PDF resume
- ✅ Extract text from the uploaded resume using Apache PDFBox
- ✅ Analyze resume content using OpenAI API (via OpenAiService)
- ✅ RESTful API endpoints for upload and analysis
- ✅ Java 21 + Spring Boot backend
- ✅ Modular, clean codebase with service-layer abstraction
- ✅ Git and GitHub integrated for version control

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Apache PDFBox
- OpenAI API
- Maven
- Git & GitHub

---

## 📂 Project Structure
resume-ai-analyzer/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── resume/
│       │           └── analyzer/
│       │               ├── ResumeAiAnalyzerApplication.java
│       │               ├── controller/
│       │               │   └── ResumeController.java
│       │               └── service/
│       │                   ├── ResumeAnalysisService.java
│       │                   └── PdfTextExtractorService.java
│       └── resources/
│           ├── application.properties
│           └── static/
│           └── templates/

---

## 📌 How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/your-username/resume-ai-analyzer.git
   cd resume-ai-analyzer
   
2. Configure your application.properties
 openai.api.key=your_api_key

3. Build and run
mvn clean install
mvn spring-boot:run

4 Test the API

POST /upload → Upload resume (PDF)

POST /analyze → Get AI analysis result

👨‍💻 Author
[Hrishabh Patle]
Made with ❤️ using Spring Boot & OpenAI


📬 API Endpoints

Method	Endpoint	Description
POST	/upload	Upload resume PDF
POST	/analyze	Analyze uploaded resume
