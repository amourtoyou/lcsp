create table tbcry
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment '医院编码',
	drq date null comment '数据时间',
	itype int null comment '住院类型1为出院,2为入院,3为在院',
	inum int null comment '人次',
	cbz varchar(255) null
);

create table tbjrsr
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment '医院编码',
	mylsr double(11,2) null comment '门诊医疗收入',
	mypsr double(11,2) null comment '门诊药品收入',
	myfsr double(11,2) null comment '门诊预防接种收入',
	zylsr double(11,2) null comment '住院医疗收入',
	zypsr double(11,2) null comment '住院药品收入',
	zzysr double(11,2) null comment '住院收入',
	dtime date null comment '数据时间',
	cbz varchar(255) null
);

create table tbjryw
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment '医院编码',
	imzwgh int(255) null comment '门诊未挂号',
	imzmt int null comment '门诊门统',
	imzzf int null comment '门诊自费',
	cmzsr double(11,2) null comment '门诊收入',
	czysr double(11,2) null comment '住院收入 ',
	iryrc int null comment '入院人次',
	icyrc int null comment '出院人次',
	idcf int null comment '大处方',
	dtime date null comment '数据日期',
	cbz varchar(255) null
);

create table tbmzjcfy
(
	iid int auto_increment
		primary key,
	cssyy varchar(255) null comment '医院编码',
	drq date null comment '数据时间',
	fmzjc double(11,2) null comment '门诊均次费用',
	cbz varchar(255) null comment '备注'
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
	cssyy varchar(255) null comment '医院编码',
	drq date null comment '数据日期',
	fyzb double(11,2) null comment '药占比',
	cbz varchar(255) null
);

