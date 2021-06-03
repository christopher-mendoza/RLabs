--this is how we write comments in SQL
/*
 * This will create
 * multi-line comments
 * */

-- Create a table (DDL)
CREATE TABLE movies (
	id serial,
	title varchar(50),
	genre varchar(30),
	release_year integer
);

-- DROP table (DDL) - Full deletion of table
DROP TABLE movies;

DROP TABLE IF EXISTS movies;

-- TRUNCATE (DDL) - Drops table then creates table
TRUNCATE movies;

-- ALTER (DDL)
ALTER TABLE movies ALTER COLUMN release_year type numeric(4, 0);

ALTER TABLE movies ADD COLUMN domestic_gross money;

-- Create - of CRUD (DML)
INSERT INTO movies values(default, 'Thor', 'Action', 2010);
INSERT INTO movies values(default, 'Ant-Man', 'Adventure', 2016);
INSERT INTO movies values
(default, 'Knives Out', 'Thriller', 2018),
(default, 'Spiderman', 'Action', 2014);

-- Read - of CRUD
SELECT * FROM movies; -- this will select all of the records in the movie table

SELECT title, genre FROM movies;

-- Update - of CRUD
UPDATE movies SET genre = 'New Genre';
UPDATE movies SET genre = 'Horor' WHERE title = 'Thor';

-- Delete 
DELETE FROM movies WHERE id = 3;

COMMIT;
ROLLBACK;