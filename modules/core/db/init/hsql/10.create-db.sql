-- begin SESSIONPLANER_SESSIONS
create table SESSIONPLANER_SESSIONS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    START_DATE timestamp not null,
    END_DATE timestamp,
    SPEAKER_ID varchar(36) not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
)^
-- end SESSIONPLANER_SESSIONS
-- begin SESSIONPLANER_SPEAKER
create table SESSIONPLANER_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end SESSIONPLANER_SPEAKER
