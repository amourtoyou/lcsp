create table tbcry
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment 'ҽԺ����',
	drq date null comment '����ʱ��',
	itype int null comment 'סԺ����1Ϊ��Ժ,2Ϊ��Ժ,3Ϊ��Ժ',
	inum int null comment '�˴�',
	cbz varchar(255) null
);

create table tbjrsr
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment 'ҽԺ����',
	mylsr double(11,2) null comment '����ҽ������',
	mypsr double(11,2) null comment '����ҩƷ����',
	myfsr double(11,2) null comment '����Ԥ����������',
	zylsr double(11,2) null comment 'סԺҽ������',
	zypsr double(11,2) null comment 'סԺҩƷ����',
	zzysr double(11,2) null comment 'סԺ����',
	dtime date null comment '����ʱ��',
	cbz varchar(255) null
);

create table tbjryw
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment 'ҽԺ����',
	imzwgh int(255) null comment '����δ�Һ�',
	imzmt int null comment '������ͳ',
	imzzf int null comment '�����Է�',
	cmzsr double(11,2) null comment '��������',
	czysr double(11,2) null comment 'סԺ���� ',
	iryrc int null comment '��Ժ�˴�',
	icyrc int null comment '��Ժ�˴�',
	idcf int null comment '�󴦷�',
	dtime date null comment '��������',
	cbz varchar(255) null
);

create table tbmzjcfy
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment 'ҽԺ����',
	drq date null comment '����ʱ��',
	fmzjc double(11,2) null comment '������η���',
	cbz varchar(255) null comment '��ע'
);

create table tbusr
(
	id int auto_increment
		primary key,
	user varchar(255) not null,
	password varchar(255) not null,
	yybm varchar(255) not null
);

create table tbyybm
(
	id int auto_increment
		primary key,
	yybm varchar(255) not null,
	yymc varchar(255) not null
);

create table tbyzb
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment 'ҽԺ����',
	drq date null comment '��������',
	fyzb double(11,2) null comment 'ҩռ��',
	cbz varchar(255) null
);

