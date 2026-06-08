<div align="center">

# 🏥 Novena Hospital Web Application

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"/>
<img src="https://img.shields.io/badge/JSP-007396?style=for-the-badge&logo=java&logoColor=white" alt="JSP"/>
<img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" alt="Bootstrap"/>

**A comprehensive, full-stack hospital management and appointment booking platform.**

</div>

<br>

## 🚀 Key Features

* **🩺 Online Appointment Booking:** Patients can easily schedule consultations through a dedicated booking interface.
* **🏥 Department & Service Listings:** Detailed pages outlining hospital specialties and medical services.
* **👨‍⚕️ Doctor Profiles:** Browse through hospital staff, view individual doctor qualifications, and read patient testimonials.
* **📞 Contact & Support:** Integrated "Contact Us" functionality for patient inquiries.
* **📱 Fully Responsive UI:** A mobile-friendly frontend ensuring the application looks great on all devices.

<br>

## 🛠️ Tech Stack

<table>
  <tr>
    <th>Backend</th>
    <th>Frontend</th>
    <th>Database</th>
  </tr>
  <tr>
    <td>
      <ul>
        <li>Java</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>Maven</li>
      </ul>
    </td>
    <td>
      <ul>
        <li>JSP (JavaServer Pages)</li>
        <li>HTML5 / CSS3 / SCSS</li>
        <li>Bootstrap UI</li>
        <li>jQuery / JavaScript</li>
      </ul>
    </td>
    <td>
      <ul>
        <li>SQL Database</li>
        <li>Hibernate (ORM)</li>
      </ul>
    </td>
  </tr>
</table>

<br>

## 📁 Project Structure

```text
novena-hospital/
├── src/main/java/com/doctor/appoinment/
│   ├── Controllers/       # HTTP request handlers
│   ├── Services/          # Core business logic
│   ├── Repositories/      # Database interaction interfaces
│   ├── Entities/          # Database models
│   └── AppointmentApplication.java # Application runner
│
├── src/main/webapp/views/ # Frontend JSP files 
│
└── src/main/resources/
    ├── static/            # CSS, SCSS, JS, Images, and Plugins
    └── application.properties # App configurations
