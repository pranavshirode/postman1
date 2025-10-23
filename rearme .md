# postman
this is an desktop application to do gmail automation program is written in java
# 📬 Postman: Bulk Gmail Scheduler

**Postman** is a desktop-based bulk email scheduler built in Java. It allows users to send personalized emails via Gmail, schedule them for future delivery, and manage recipient lists with ease. Designed with an object-oriented architecture, Postman is scalable, secure, and user-friendly.

---

## 🚀 Features

- ✅ Send bulk emails via Gmail API (OAuth2 authentication)
- 📅 Schedule emails for specific dates and times
- 🧠 Use dynamic templates with placeholders (e.g., `{{name}}`)
- 📁 Import recipient lists from CSV files
- 🖥️ JavaFX-based desktop interface
- 🗃️ MySQL database for persistence
- 📊 Dashboard for sent/scheduled emails *(coming soon)*
- 🔁 Recurring schedules *(planned)*
- 📈 Email analytics *(planned via third-party APIs)*
- 🔔 Notifications for failed jobs *(planned)*

---

## 🧱 Tech Stack

| Layer               | Technology         |
|---------------------|--------------------|
| Language            | Java 11+           |
| UI Framework        | JavaFX             |
| Email API           | Gmail API + OAuth2 |
| Scheduler           | Quartz Scheduler   |
| CSV Parsing         | OpenCSV            |
| Template Engine     | FreeMarker         |
| Database            | MySQL              |
| IDE                 | IntelliJ IDEA      |
| Build Tool          | Maven              |
| Testing             | JUnit, Mockito     |

---

## 🧠 Architecture Overview

Postman follows a modular, object-oriented design:

- `EmailSender`: Sends emails via Gmail API
- `EmailTemplate`: Manages and renders templates
- `Recipient`: Represents email recipient
- `SchedulerService`: Manages Quartz jobs
- `EmailJob`: Executes scheduled email tasks
- `CSVImporter`: Parses CSV files
- `GmailAuthenticator`: Handles OAuth2 authentication
- `EmailLogger`: Logs sent/failed emails
- `UIController`: Manages JavaFX UI interactions
- `DatabaseManager`: Handles MySQL persistence

---

## 📦 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/postman-gmail-scheduler.git
   cd postman-gmail-scheduler