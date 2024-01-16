create table LGL_USER (
LGL_USER_ID bigint not null auto_increment ,
LGL_USER_FIRST_NAME varchar(255) not null,
LGL_USER_LAST_NAME varchar(255) not null,
LGL_USER_EMAIL varchar (255) not null,
LGL_USER_PASSWORD varchar (255) not null,
LGL_USER_PHONE varchar (255) not null ,
LGL_USER_TYPE varchar (255) not null,
LGL_USER_JOB varchar (255) not null,
primary key(LGL_USER_ID)
)ENGINE=INNODB;

create table LGL_PHARMACY(
LGL_PHARMACY_ID bigint not null auto_increment,
LGL_PHARMACY_NAME varchar(255) not null,
LGL_PHARMACY_EMAIL varchar(255) not null,
LGL_PHARMACY_PHONE varchar(255) not null,
LGL_PHARMACY_ADDRESS varchar(255) not null,
LGL_PHARMACY_WILLAYA varchar(255) not null,
LGL_PHARMACY_LATITUDE double precision not null,
LGL_PHARMACY_LONGITUDE double precision not null,
LGL_PHARMACY_CLUSTER integer not null,
LGL_USER_ID bigint not null,
primary key(LGL_PHARMACY_ID),
foreign key(LGL_USER_ID)
references LGL_USER(LGL_USER_ID)
on delete cascade
) ENGINE=INNODB;