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

   `SELECT` is also used for querying.

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

11. Altering a table

    We can use `ALTER` to edit/alter the table.

    - Adding a column:

      `ADD` to add a new column i.e. `phone_number`.

      ```
      ALTER TABLE employees
      ADD phone_number VARCHAR(15);
      ```
    - Renaming a column:

      `RENAME COLUMN <old-name> TO <new-name>` to rename column.

      ```
      ALTER TABLE employees
      RENAME COLUMN phone_number TO email;
      ```

    - Modifying a column:

      `MODIFY COLUMN <column-name> <data-type>` to modify datatype of a column.

      ```
      ALTER TABLE employees
      MODIFY COLUMN email VARCHAR(100);
      ```

    - Changing position of a column:

      `AFTER` to change position of a column.

      ```
      ALTER TABLE employees
      MODIFY COLUMN email VARCHAR(100)
      AFTER last_name;
      ```
    - Changing position of a column to first:

      `FIRST` to change position of a column to first.

      ```
      ALTER TABLE employees
      MODIFY COLUMN email VARCHAR(100)
      FIRST;
      ```

    - Deleting a column:

      ```
      ALTER TABLE employees
      DROP COLUMN email;
      ```

12. Inserting a row into the table

    - Syntax:

      ```
      INSERT INTO <table-name>
      VALUES (value_1, value_2, value_3, ...);
      ```

    - Example:

      ```
      INSERT INTO employees
      VALUES (1, "Eugene", "Krabs", 25.50, "2023-01-02");
      ```

      Date format: `YYYY-MM-DD`

13. Inserting multiple rows into the table
   
    - Syntax: 

      ```
      INSERT INTO employees
      VALUES (), (), (), ();
      ```

      <i><ins>Note:</ins> Number of brackets are equivalent to number of rows that you want to insert.</i>

    - Example: 

      ```
      INSERT INTO employees
      VALUES (2, "Squidward", "Tentacles", 21.99, "2023-03-04"),
             (3, "Spongebob", "Squarepants", 22.67, "2022-05-06"),
             (4, "Patrick", "Star", 26.42, "2021-07-08"),
             (5, "Sandy", "Cheeks", 29.82, "2020-09-12");
      ```

14. Inserting row with "missing" data

    ```
    INSERT INTO employees
    VALUES (6, "Sandy", "Cheeks");
    ```

    Results in `Error Code: 1136. Column count doesn't match value count at row 1`.

    One way to deal with it is to add data to only selected columns.

    Example:

    ```
    INSERT INTO employees (employee_id, first_name, last_name)
    VALUES (6, "Sandy", "Cheeks");
    ```