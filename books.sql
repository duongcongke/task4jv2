create database if not exists ebookshop;

use ebookshop;

drop table if exists books;
CREATE TABLE books(
    id int,
    title varchar(50),
    author varchar(50),
    price float,
    qty int,
    primary key (id));

insert into books value (1001, 'Jva for dummies', 'Dang Kim Thi', 11.11, 11);
insert into books value (1002, 'More java for dummies', 'Codelean VN', 22.22, 22);
insert into books value (1003, 'More java for more dummies', 'Mohammad Ali', 33.33, 33);
insert into books value (1004, 'A Cup of java', ' Kamar', 44.44, 44);
insert into books value (1005, 'A Teaspoon', ' Kevin jones', 55.55, 55);
select * from books;