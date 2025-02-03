# SQL/PLSQL - MCQs Questions

### 1. We cannot use WHERE clause with TRUNCATE. True or False?
- a. False
- b. True

**Correct Answer:** b. True

### 2. Which operator gives the result if the condition(s) is not satisfied?

- a. IN
- b. NOT
- c. OR
- d. AND

**Correct Answer:** b. NOT

### 3. 
### Consider the below table, CATEGORY

| Name  | Null    | Type          |
|-------|--------|--------------|
| ID    | NOT NULL | NUMBER(38)  |
| NAME  | NOT NULL | VARCHAR2(20) |
| PRICE | NOT NULL | NUMBER(5,2)  |

What is the output of the below query?

```sql
INSERT INTO CATEGORY VALUES (2, 'POLO', 2500.99);
```
- a. The row gets inserted successfully
- b. Query gives an SQL Error
- c. Insert syntax error
- d. None of the options

**Correct Answer:** b. Query gives an SQL Error

### 4.
### Consider the below table `Category`

| ID  | Name | Price    |
|-----|------|---------|
| 1   | W    | 35      |
| 2   | LP   | 1200.99 |
| 3   | POLO | 1000.49 |
| 4   | LEVI | 900     |
| 5   | HRX  | (null)  |

What is the output of the below query?

```sql
SELECT AVG(Price) FROM Category;
```
- a 
`AVG(PRICE)  
  ==========  
  78d.12  
`
- b `AVG(PRICE)  
==========  
627.296  `
- c 
`AVG(PRICE)  
  ==========  
  88d.28 `

- d Cannot retrieve the output due to null values in the table


**Correct Answer:** c. AVG(PRICE) = 627.296

#### **Explanation:**
- The `AVG()` function in SQL ignores `NULL` values.
- The valid `Price` values are: **35, 1200.99, 1000.49, 900**
- Sum = **35 + 1200.99 + 1000.49 + 900 = 3136.48**
- Count = **4** (excluding NULL)
- Average = **3136.48 / 4 = 627.296**

### 5. Which is not a system defined exception in PLSQL?
- a. INVALID_INPUT
- b. CURSOR_ALREADY_OPEN
- c. NO_DATA_FOUND
- d. INVALID_CURSOR

**Correct Answer:** d. INVALID_INPUT

### 6. What is the meaning of the below fetch statement?
```sql 
FETCH c1 INTO ename, empno, sal;
EXIT WHEN (c1%ROWCOUNT > 5) OR (c1%NOTFOUND);
```
- a. fetch statement ends only when no records returned by the cursor
- b. fetch statement ends either when the number of rows returned by the cursor is greater than 5 or no
records returned by the cursor
- c. Syntax error
- d. None of the options

**Correct Answer:** b.

### 7. To get the server output result and display it into the screen, you need to write
- a. set serveroutput on
- b. set output on
- c. set dbmsoutput on
- d. set dbms output on
 
**Correct Answer:** a. set serveroutput on

### 8. ________ is also known as static variable

- a. Class variables
- b. Local variables
- c. Instance variables
- d. All of the options

### 9. In how many ways can a standalone procedure be called in PLSQL.

- a. Using the EXECUTE keyword
- b. Calling the procedure name from a PL/SQL block
- c. From a SELECT statement
- d. It will be automatically executed

### 10. Which of the options are true regarding primary key and foreign key?

- a. Primary key cannot be null on the other hand foreign key can be null.
- b. Primary key is always unique while foreign key can be duplicated
- c. There can be only one primary key in the table and only one foreign key in the table.
- d. There can be only one primary key in the table on the other hand we can have more than one
  foreign key in the table

**Correct Answer:** d.


### 11. Which of the following commands can be used to delete a column age from a table wityh name test1?
- a. alter table test1 drop column age;
- b. alter table test1 drop age;
- c. drop table test1;
- d. delete from test1 age;

**Correct Answer:** a. ALTER TABLE test1 DROP COLUMN age;

### 12. State whether the following statement is true or false .An outer join requires each record in a table to
have a matching record with the joined table?
- a. TRUE
- b. FALSE

**Correct Answer:** b. FALSE

### 12. Which of the following set of operators can be used to enable a multi value comparison of values with a single column?
- a. CHECK
- b. IN
- c. LIKE
- d. IS NULL

**Correct Answer:** b. IN

### 13. What is the significance of using a number in an order by clause?
- a. Number used in an order by clause signifies the position of a column in the select list
- b. Number Used in an order by clause signifies the position of a column in the where clause
- c. Number used in an Order by clause signifies the position of a column in a table
- d. None

**Correct Answer:** a. Number used in an `ORDER BY` clause signifies the position of a column in the `SELECT` list.

### 14. What is the output of the above query?

```sql
SQL> DESC TRANSACTION;
```
| Name  | Null?      | Type         |
|-----|------------|--------------|
| TNSID   | 	NOT NULL  | NUMBER       |
|BANKNAME  | LP         | VARCHAR2(50) |
| CUSTNAME  | POLO       | VARCHAR2(20) |

- a. Query will update the BANKNAME to 'ABC BANK' if TNSID ranges between 100 to 200
- b. Query will update the BANKNAME to 'ABC BANK' if TNSID ranges between 101 to199
- c. The query is syntactically wrong
- d. Query will update the BANKNAME to 'ABC BANK' for all the rows in the table

**Correct Answer:** a.

### 14. TRUNCATE statement removes the complete data and its structure.
- a. TRUE
- b. FALSE

**Correct Answer:** b. FALSE

### 15. Which of the following are valid constraints in MySQL?
- a. `UNIQUE, NOT NULL and DEFAULT`
- b. `UNIQUE, NOT NULL and DISTINCT`
- c. `DISTINCT and DEFAULT`
- d. `DEFAULT, NOT NULL and DISTINCT`

**Correct Answer:** a. `UNIQUE, NOT NULL and DEFAULT`

### 16. Consider a database `products`
Choose the query to select the products database
- a. `USE products;`
- b. `USE Product;`
- c. `Select PRODUCT;`
- d. `SELECT products;`

**Correct Answer:**  a. `USE products;`

### 17. Which query returns all the employees who earn the minimum salary from the Employees table
- a. `Select * from employees where sal=min(sal);`
- b. `Select * from employees where sal =(select sal from employees);`
- c. `Select * from employees where sal =(select min(sal) from employees)`
- d. `Select * from employees where sal =(select min(sal) from employees group by empno);`

**Correct Answer:** c. `Select * from employees where sal =(select min(sal) from employees)`