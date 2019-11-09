create table if not exists user
(
	id int auto_increment primary key,
	account_id varchar(100) null,
	name varchar(255) null,
	token varchar(255) null,
	gmt_create bigint null,
	gmt_modified bigint null
);