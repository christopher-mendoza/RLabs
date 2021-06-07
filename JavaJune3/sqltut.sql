/*
 * Constraints
 * rules to specify what data can be added to which columns
 * 
 * Primary Key
 * - A unique identifier for each individual record in the table
 * - Under the hood -> PK - Unique and Not Null
 * 
 * What makes a good primary key:
 * 4 Conditions:
 * 	-Unique
 * 	-Not Null
 * 	-Non-sensitive
 * 	-Non-volatile
 * 
 * Candidate Key (term) = something suitable for being used as a PK
 * 
 * Surrogate Key = When we create a column/field solely to be our PK (id)
 * 
 * -----------------------------------------
 * Foreign Key
 * - Used to establish a relationship with another table that has a primary key
 * 		- FK relates to PK directly
 * 
 * Orphan Record
 * A record that references a (primary) key that no longer exists
 * 
 * Default
 * - Specifies a default value for a column
 * 
 * Not Null
 * - Ensures that values in the column/field cannot be null (required)
 * 
 * Unique
 * - Ensures that each value is unique
 * 
 * Check
 * - Allows you to verify/check that data being inserted into a column/field 
 * 	 is within some range (across some value)
 * 
 * */

DROP TABLE IF EXISTS cats;
DROP TABLE IF EXISTS breeds;


-- Cats
CREATE TABLE cats (
	id serial PRIMARY KEY,
	name varchar(20) NOT NULL,
	age integer,
	breed integer -- FK to breeds table
);

-- Breed - Reference/Lookup Table
CREATE TABLE breeds (
	id serial PRIMARY KEY,
	breed varchar(30)
);

-- Person
CREATE TABLE people (
	id serial PRIMARY KEY,
	username varchar UNIQUE NOT NULL,
	password varchar NOT NULL
);

-- Add person id in cats
ALTER TABLE cats
ADD COLUMN p_id integer;
-- Put cats list in person 1
UPDATE cats SET p_id = 1 WHERE id IN (1, 2, 3);
UPDATE cats SET p_id = 2 WHERE id = 5;
UPDATE cats SET p_id = 3 WHERE id IN (4, 9);
UPDATE cats SET p_id = 4 WHERE id IN (6, 7, 8);

ALTER TABLE cats
ADD CONSTRAINT cat_person_fk
FOREIGN KEY (p_id) REFERENCES people(id);

ALTER TABLE cats
DROP CONSTRAINT cats_breed_fk;

-- Create a Foreign Key
ALTER TABLE cats
ADD CONSTRAINT cats_breed_fk
FOREIGN KEY (breed)
REFERENCES breeds(id)
ON DELETE SET NULL;

-- Add some breeds to my breed table
INSERT INTO breeds VALUES
(default, 'Calico'),
(default, 'Bengal'),
(default, 'Tabby'),
(default, 'Sphynx'),
(default, 'Siamese'),
(default, 'Panther');

SELECT * FROM breeds;

-- Add cats to our table
INSERT INTO cats VALUES
(default, 'North', 4, 1),
(default, 'Cusco', 2, 2),
(default, 'Garfield', 70, 3),
(default, 'Tigger', 10, 4),
(default, 'Felix', 100, 5),
(default, 'Tony', 3, 2),
(default, 'Imhotep', 8000, 4),
(default, 'Fritz', 21, 6),
(default, 'Whiskers', 3, 4);

SELECT * FROM cats;


-- Add people to our table
INSERT INTO people VALUES
(default, 'catman', 'meow'),
(default, 'catperson', 'uwu'),
(default, 'catcat', 'TvT');

SELECT * FROM people;

/*
 * JOINS
 * are used to combine information across multiple tables
 * 	- Combine tables horizontally based on condition
 * 	- Extend the amount of information that you retrieve about each record
 * are not permanent changes to our DB
 * 
 * Left Join - Left table
 * Right Join - Right table
 * Inner Join - Overlap
 * Full Join - All
 * and more
 * 
 * */

-- Order by
SELECT * FROM cats 
LEFT JOIN breeds ON cats.breed = breeds.id;

SELECT * FROM cats
RIGHT JOIN breeds ON cats.breed = breeds.id;

SELECT c.id, c.name, c.age, b.breed AS cat_breed FROM
cats c LEFT JOIN breeds b
ON c.breed = b.id;

SELECT p.id, p.username, p.password, c.id AS cat_id, c.name, c.age, b.id AS breed_id, b.breed 
FROM people p
LEFT JOIN cats c ON p.id = c.p_id
LEFT JOIN breeds b ON c.breed = b.id;

-- Group by
SELECT b.breed, count(b.breed) FROM cats c LEFT JOIN breeds b
ON c.breed = b.id GROUP BY b.breed;

-- Stored Procedure

CREATE PROCEDURE add_cat(name varchar, age integer, breed integer, person integer)
LANGUAGE SQL
AS $$
	INSERT INTO cats values(default, name, age, breed, person);
$$;

DROP PROCEDURE add_cat;

CALL add_cat('Kitty', 5, 2, 2);