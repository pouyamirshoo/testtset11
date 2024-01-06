CREATE TABLE IF NOT EXISTS writer(
    writer_id SERIAL PRIMARY KEY ,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age int
);
CREATE TABLE IF NOT EXISTS books(
    book_id SERIAL PRIMARY KEY ,
    book_name VARCHAR(255),
    year_of_publish int,
    writer int REFERENCES writer(writer_id)
);
