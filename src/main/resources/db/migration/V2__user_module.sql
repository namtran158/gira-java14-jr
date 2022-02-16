CREATE TABLE gira_user (
	id uuid,
	version int not null,
	created_by varchar(36),
	created_at timestamp,
	updated_by varchar(36),
	updated_at timestamp,
	username varchar(36) not null unique,
	password varchar(255) not null,
	email varchar(100) not null unique,
	fullname varchar(255) not null,
	display_name varchar(100),
	avatar varchar(255),
	account_status varchar(100),
	facebook_url varchar(255),
	title varchar(100),
	department varchar(100),
	hobbies varchar(255),
	primary key(id)
);

CREATE TABLE gira_group_role_user (
	user_id uuid,
	group_role_id uuid,
	primary key(user_id, group_role_id)
);

ALTER TABLE gira_group_role_user
	ADD CONSTRAINT fk_group_role_user
	FOREIGN KEY (user_id) REFERENCES gira_user(id);

ALTER TABLE gira_group_role_user
	ADD CONSTRAINT fk_user_group_user
	FOREIGN KEY (group_role_id) REFERENCES gira_group_role(id);


