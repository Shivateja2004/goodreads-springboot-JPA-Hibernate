
# book_author table data

insert into book_author(bookId, authorId) values (1, 1);
insert into book_author(bookId, authorId) values (2, 2);
insert into book_author(bookId, authorId) values (2, 3);
insert into book_author(bookId, authorId) values (3, 4);
insert into book_author(bookId, authorId) values (3, 5);
insert into book_author(bookId, authorId) values (4, 4);
insert into book_author(bookId, authorId) values (5, 4);
insert into book_author(bookId, authorId) values (5, 5);
insert into book_author(bookId, authorId) values (6, 6);
insert into book_author(bookId, authorId) values (7, 7);
insert into book_author(bookId, authorId) values (8, 6);

# book_author table

create table if not exists book_author (
  bookId INT,
  authorId INT,
  FOREIGN KEY (bookId) REFERENCES book(id),
  FOREIGN KEY (authorId) REFERENCES author(authorId)
);
