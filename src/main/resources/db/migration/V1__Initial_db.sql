CREATE TABLE users (
    id bigint generated always as identity primary key not null,
    firstname varchar(100),
    lastname varchar(100),
    phone varchar(100),
    username varchar(100),
    password varchar(100)
);

CREATE TABLE teams (
   id bigint generated always as identity primary key not null,
   name varchar(100)
);

CREATE TABLE requests (
    id bigint generated always as identity primary key not null,
    user_id bigint NOT NULL,
    team_id bigint NOT NULL,
    work_type varchar(100),
    scale varchar(100),
    desired_date date,
    desired_time time,
    status varchar(100)
);

ALTER TABLE requests
    ADD CONSTRAINT fk_team_id
        FOREIGN KEY (team_id) REFERENCES teams(id);

ALTER TABLE requests
    ADD CONSTRAINT fk_user_id
        FOREIGN KEY (user_id) REFERENCES "users"(id);