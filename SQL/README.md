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

     In this case, let's say we tried to drop the database. This will return `Error Code: 3989. Schema 'mydb' is in read only mode`as the database has been set to read only.

   - Enabling encryption:

     ```

     ```