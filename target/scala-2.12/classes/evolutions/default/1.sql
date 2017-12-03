# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table song (
  id                            serial not null,
  name                          varchar(255),
  length                        integer,
  author                        varchar(255),
  constraint pk_song primary key (id)
);


# --- !Downs

drop table if exists song cascade;

