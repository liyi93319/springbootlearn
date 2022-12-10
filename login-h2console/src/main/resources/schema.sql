create table users(
    id int not null primary key,
	username varchar_ignorecase(50) not null,
	password varchar_ignorecase(200) not null,
	enabled boolean not null
);

create table authorities (
    id int not null primary key,
	username varchar_ignorecase(50) not null,
	authority varchar_ignorecase(50) not null
);
