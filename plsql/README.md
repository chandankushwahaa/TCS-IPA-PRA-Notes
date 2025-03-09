# PL/SQL
PL/SQL (Procedural Language/Structured Query Language) is an extension of SQL that allows developers to write procedural code, including stored procedures, functions, triggers, and other database objects. Unlike SQL, which is purely a query language, PL/SQL provides procedural constructs like loops, conditions, and error handling.

### Features of PL/SQL:

Supports procedural constructs like loops, conditions, and exceptions.

Allows creation of functions, procedures, and triggers.

Enhances SQL by adding programming capabilities.

Reduces network traffic by sending blocks of code instead of multiple SQL queries.
#### PL/SQL Block Structure
SYNTAX
```SQL
DECLARE
  -- Variable declarations (optional)
BEGIN
  -- Executable commands
EXCEPTION
  -- Exception handling (optional)
END;
```

#### Example 1: Simple PL/SQL Block
```SQL
BEGIN
  DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
END;
```

**OUTPUT**
```
Hello, PL/SQL!
```

## Control Structures in PL/SQL 
- It's a named block of statement.
- It may or may not return a value.
- PL/SQL provides control structures such as loops and conditional statements.


#### Example 2: Print Natural Numbers from 1 to 5

```sql
declare
  i NUMBER := 1;
begin
  loop
    DBMS_OUTPUT.PUT_LINE(i);
    i := i + 1;
    exit when i > 5;
  end loop;
end;
```

OUTPUT:
```
1
2
3
4
5
```
### Conditional Statements

#### Example 3: Check Even or Odd Number

```sql
declare
  num NUMBER := 4;
begin
  if mod(num, 2) = 0 then
    DBMS_OUTPUT.PUT_LINE(num || ' is even.');
  else
    DBMS_OUTPUT.PUT_LINE(num || ' is odd.');
  end if;
end;
```

OUTPUT:
```
4 is even.
```

## Procedures in PL/SQL
A procedure is a named block of PL/SQL statements that can be executed as a single unit. Procedures can have input (IN), output (OUT), or both (IN OUT) parameters.

SYNTAX
```sql
CREATE [OR REPLACE] PROCEDURE procedure_name
[(parameter_name [IN | OUT | IN OUT] type [, ...])]
IS
BEGIN
  -- Procedure body
END procedure_name;
```

#### 4. Find the topper student.
```sql
CREATE OR REPLACE PROCEDURE getTopperStudent
AS
  topperName student.name%TYPE;
BEGIN
  SELECT name INTO topperName
  FROM student
  WHERE marks = (SELECT MAX(marks) FROM student);

  DBMS_OUTPUT.PUT_LINE('The top scorer is: ' || topperName);
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('No top scorer found.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('An error occurred.');
END getTopperStudent;
```

## Functions in PL/SQL

Functions are similar to procedures but must return a value.

SYNTAX
```sql
CREATE [OR REPLACE] FUNCTION function_name
[(parameter_name [IN] type [, ...])]
RETURN return_type
IS
BEGIN
  -- Function body
  RETURN value;
END function_name;
```
#### 5: Function to Calculate Square of a Number
```sql
CREATE OR REPLACE FUNCTION getSquare(num IN NUMBER) RETURN NUMBER
IS
BEGIN
  RETURN num * num;
END getSquare;
```
USAGE
```sql
DECLARE
  result NUMBER;
BEGIN
  result := getSquare(5);
  DBMS_OUTPUT.PUT_LINE('Square of 5 is: ' || result);
END;
```

OUTPUT:
```
Square of 5 is: 25
```

## Exception Handling in PL/SQL

PL/SQL provides exception handling to handle runtime errors gracefully.

#### 6: Handling Division by Zero
```sql
DECLARE
  num1 NUMBER := 10;
  num2 NUMBER := 0;
  result NUMBER;
BEGIN
  result := num1 / num2;
  DBMS_OUTPUT.PUT_LINE('Result: ' || result);
EXCEPTION
  WHEN ZERO_DIVIDE THEN
    DBMS_OUTPUT.PUT_LINE('Error: Division by zero is not allowed.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('An unexpected error occurred.');
END;
```

OUPTUT:
```
Error: Division by zero is not allowed.
```
