# 🧪 Pathology Lab Management - Test Automation

This project contains automated tests for the **Pathology Lab Management Web Application** using **Selenium with Java** and **TestNG**. The tests cover key functionalities like login, test cost calculation, and patient management.

---

## 📌 Application Under Test (AUT)

**URL:** [https://gor-pathology.web.app/](https://gor-pathology.web.app/)

### 🔑 Test Credentials
- **Username:** test@kennect.io
- **Password:** Qwerty@1234

---

## ⚙️ Tech Stack

| Tool/Framework | Version |
|---|---|
| Selenium WebDriver | 4.x |
| Java | 17+ |
| TestNG | Latest |
| Maven | Latest |
| ChromeDriver | Compatible with Chrome 133+ |

---

## ✅ Covered Test Scenarios

| Feature | Test Case |
|---|---|
| Login Page | Valid Login, Invalid Login |
| Home Page | Verify todos list, Navigate to Cost Calculator |
| Cost Calculator | Calculate cost of tests, Apply discounts |
| Patient Management | Add patient details, Create test request, Verify test in todos list |

---

## 📥 Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/chaitrahegde22/pathology-test.git
   ```

2. **Open in IDE** (IntelliJ / Eclipse)

3. **Install Dependencies**:
   Run:
   ```bash
   mvn clean install
   ```

4. **Update ChromeDriver Path (if needed)**:
   Update this line in `WebDriverManager.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
   ```

---

## ▶️ Running Tests

Run all tests using Maven:

```bash
mvn test
```

Or run individual tests directly from your IDE.

---

## 📊 Test Report
After execution, TestNG generates a test report under:
```
target/surefire-reports/index.html
```

---
