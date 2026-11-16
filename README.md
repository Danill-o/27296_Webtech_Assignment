# 27296_Webtech_Assignment

 1. Problem Analysis and Database Design
    
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
  
<img width="512" height="449" alt="image" src="https://github.com/user-attachments/assets/6e46a5e6-93b3-43f1-af42-9a3aacc79a2e" />

 3. Screenshots demonstrating successful table generation and relationship mappings

    <img width="1262" height="567" alt="Tables" src="https://github.com/user-attachments/assets/d2cac5a6-844f-484b-b2dd-a2faeec0fbff" />

   
