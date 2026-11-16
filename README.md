# 27296_Webtech_Assignment

 1. Problem Analysis 
    
The university currently keeps academic records manually, which makes it hard to manage students, organise courses, assign lecturers and track registrations. The system must store departments, students and their personal profiles, lecturers, courses, and the registrations that link students to courses. Each registration must also record the registration date, academic year, semester, status (PENDING, APPROVED or REJECTED) and the grade obtained.
Key rules extracted from the statement:

• A department offers many courses and employs many lecturers.

• Every department has exactly one lecturer as its head.

• A student belongs to one department.

• A student has exactly one profile, and a profile belongs to exactly one student.

• A course belongs to one department.

• Lecturers and courses are many-to-many, and this must be done without a separate entity (so a join table).

• Students and courses are many-to-many, but the link carries extra data (so a join entity).

 2.  Entity Relationship Diagram (ERD)
  
<img width="467" height="458" alt="image" src="https://github.com/user-attachments/assets/2bc91881-8328-48f6-a8e1-c19beb651423" />


 3.The successful Spring Boot startup log showing Hibernate SQL/table generation.
 
   <img width="992" height="680" alt="image" src="https://github.com/user-attachments/assets/b2633c40-3b7e-4cf3-b8e1-101fee6ddda3" />

 4. Screenshots demonstrating successful table generation and relationship mappings

    <img width="1262" height="567" alt="Tables" src="https://github.com/user-attachments/assets/d2cac5a6-844f-484b-b2dd-a2faeec0fbff" />

   
