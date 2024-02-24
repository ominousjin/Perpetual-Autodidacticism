# SQL

SQL or Structured Query Language is a query programming language for managing RDBMS i.e. Relational Database Management System).

1. Database 

   In a database, tables are used to organize and store data, similar to how files are organized within a folder. Just as you can have multiple files within a folder, a database can contain multiple tables, each storing different types of data.

   <i><ins>Note:</ins> SQL commands should be ended by a semicolon `;` symbol.</i>

2. Creating a database

   ```
   CREATE DATABASE myDB;
   ```

3. Accessing a database

   ```
   USE myDB;
   ```

4. Deleting a database

   ```
   DROP DATABASE myDB;
   ```

5. Altering a database

   - Setting database to read only:

     If the database is in read-only mode, we can't make any modifications to it but we can still access the data within.

     ```
     ALTER DATABASE myDB READ ONLY = 1;
     ```

     In this case, let's say we tried to drop the database. This will return `Error Code: 3989. Schema 'mydb' is in read only mode` as the database has been set to read only. To disable read only, we can set the value to `0`.

   - Enabling encryption:

     ```

     ```

6. Tables

   A table in a RDBMS consist of rows and columns, like an Excel spreadsheet.

7. Creating a table

   ```
   CREATE TABLE employees (
      employee_id INT,
       first_name VARCHAR(50),
       last_name VARCHAR(50),
       hourly_pay DECIMAL(5, 2),
       hire_date DATE
   );
   ```
   
   - Syntax: `CREATE TABLE <table-name> ();`
   - Within parenthesis, we will list the columns (or attributes).
   - Each column is followed by its respective data type.
   - Each column is separated by a comma.

8. Selecting a table

   ```
   SELECT * FROM employees;
   ```

9. Renaming a table

   ```
   RENAME TABLE employees to workers;
   ```

   <i><ins>Note:</ins> use `RENAME TABLE workers TO employees;` to revert back.</i>

10. Deleting a table

   ```
   DROP TABLE employees;
   ```