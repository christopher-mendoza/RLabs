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

SELECT * FROM cats 
LEFT JOIN breeds ON cats.breed = breeds.id;

SELECT * FROM cats
RIGHT JOIN breeds ON cats.breed = breeds.id;

SELECT c.id, c.name, c.age, b.breed AS cat_breed FROM
cats c LEFT JOIN breeds b
ON c.breed = b.id;

