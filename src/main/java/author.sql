CREATE TABLE IF NOT EXISTS author(
    name    VARCHAR(50),
    last_name   VARCHAR(50),
    age   int,
    book_name   VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS book(
    title   VARCHAR(100),
    print_year  DATE,
    author  VARCHAR(100)
);