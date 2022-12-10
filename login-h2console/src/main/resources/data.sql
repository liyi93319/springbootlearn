insert into users (id, username, password, enabled) values (1, 'user1', '{noop}1', true);
insert into users (id, username, password, enabled) values (2, 'user2', '{noop}2', true);

insert into authorities (id, username, authority) values (1, 'user1', 'ROLE_ADMIN');
insert into authorities (id, username, authority) values (2, 'user2', 'ROLE_USER');