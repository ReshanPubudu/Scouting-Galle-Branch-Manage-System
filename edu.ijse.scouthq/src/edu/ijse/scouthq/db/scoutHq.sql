/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Reshan Pubudu
 * Created: Jun 21, 2017
 */

drop database scoutHq;
create database scoutHq;
use scoutHq;


CREATE TABLE School(
	sclId varchar(10) not null,
	Name varchar(30) not null,
	address	varchar(100) not null,
	tp varchar(10),
	disecription varchar(100),
	startedDate Date,
	registedDate Date,
	constraint primary key (sclId)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE Teacher(
	tId varchar(10) not null,
	nameInit varchar(30),
	nameFull varchar(50) not null,
	dateOfBirth Date,
	address varchar(100) not null,
	tp varchar(10),
	joiningDate Date,
	registedDate Date,
	constraint primary key (tId)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE TeacherSchool(
	tId varchar(10) not null,
	sclId varchar(10) not null,
	constraint primary key (tId, sclId),
	constraint foreign key (tId) references teacher (tId)
	on delete cascade on update cascade,
	constraint foreign key (sclId) references school (sclId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE Member(
	regId varchar(10) not null,
	nameInit varchar(30) ,
	nameFull varchar(50) not null,
	dateOfBirth Date not null,
	address varchar(100) not null,
	tp varchar(10),
	sclId varchar(10),
	joiningDate Date,
	registedDate Date,
	constraint primary key (regId)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE Category(
	categoryId varchar(10) not null,
	catName varchar(20) not null,
	constraint primary key (categoryId)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE RegistrationCategory(
	regId varchar(10) not null,
	categoryId varchar(10) not null,
	constraint primary key (regId, categoryId),
	constraint foreign key (categoryId) references category (categoryId)
	on delete cascade on update cascade,
	constraint foreign key (regId) references member (regId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE CoreBadge(
	badgeId varchar(10) not null,
	categoryId varchar(10) not null,
	badgeName varchar(30) not null,
	timePrd varchar(5),
	description varchar(1000) not null,
	constraint primary key (badgeId),
	constraint foreign key (categoryId) references category (categoryId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE MeritBadge(
	badgeId varchar (10) not null,
	categoryId varchar(10) not null,
	badgeName varchar(30),
	description varchar(1000) not null,
	constraint primary key (badgeId),
	constraint foreign key (categoryId) references category (categoryId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE MeritBadgeTeacher(
	badgeId varchar (10) not null,
	tId varchar(10) not null,
	constraint primary key (badgeId,tId),
	constraint foreign key (badgeId) references meritBadge(badgeId)
	on delete cascade on update cascade,
	constraint foreign key (tId) references teacher (tId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE MemberCore(
	regId varchar(10) not null,
	badgeId varchar(10) not null,
	date Date,
	description varchar(200),
	constraint primary key (regId, badgeId),
	constraint foreign key (badgeId) references coreBadge (badgeId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE MemberMerit(
	regId varchar(10) not null,
	badgeId varchar(10) not null,
	tId varchar(10) not null,
	date Date,
	description varchar(200),
	constraint primary key (regId, badgeId),
	constraint foreign key (badgeId) references meritBadge (badgeId)
	on delete cascade on update cascade,
	constraint foreign key (tId) references teacher (tId)
	on delete cascade on update cascade
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into category values('CSC01', 'Cub Scout');
insert into category values('BSC01', 'Boy Scout');
insert into category values('GSC01', 'Girl Scout');
insert into category values('RSC01', 'Rover Scout');

insert into school values('SC002', 'Mahinda College', 'Mahinda College, Eliot Road, Galle ', '0912233445', '1st Galle Mahinda Scout Troop', '1914.02.22','2017.5.12');
insert into school values('SC003', 'Richmond College', 'Richmond College, Richmond Hill Rd, Galle', '0913333333', '2nd Galle Richmond Scout Troop', '1915.02.22','2017.5.12');
insert into school values('SC004', 'Siridhamma College', 'Siridhamma College, Siridhamma Mawatha,Labuduwa Galle', '0916655115', 'Siridhamma College Scout Troup', '2000.02.22','2017.5.12');

insert into teacher values('TR001', 'Col.Ananda Alwis', 'Colnol Ananda Alwis', '1965.02.05', 'Karapitiya, Galle', '0773573564', '1975.03.22', '2017.5.12');
insert into teacher values('TR002', 'K.H.Asanga Prasad', 'Kariyawasam Haputhanthrige Asanga Prasad','1992.05.10', 'No.100, Galusiri Uyana, Kithulampitiya, Galle', '0713573564', '2001.02.22', '2017.5.12');

insert into member values('MR001', 'P.K.A.D.Gayashan', 'Dilusha Gayashan Gunawardhana', '1999.02.05', 'No.33, Ginthota, Galle', '0763344557', 'SC002', '2010.02.22', '2017.5.22');
insert into registrationCategory value ('MR001', 'BSC01');
insert into member values('MR002', 'H.D. Sandeepa', 'Dasun Sandeepa', '1999.03.06', 'No.22, Unawatuna, Galle', '0765623673', 'SC003', '2010.03.22', '2017.5.23');
insert into registrationCategory value ('MR002', 'BSC01');
insert into member values('MR003', 'D.P.Pinsara', 'Diyatha Pinsara', '1999.04.11', 'No.2, Rathgama, Galle', '0722340985', 'SC004', '2010.04.22', '2017.5.23');
insert into registrationCategory value ('MR003', 'BSC01');
insert into member values('MR004', 'Y.Sandaruwan', 'Yairu Sandaruwan', '1999.05.05', 'No.12, Yakkalamulla, Galle', '0765552222', 'SC002', '2010.05.22', '2017.5.24');
insert into registrationCategory value ('MR004', 'BSC01');

insert into member values('MR005', 'L. Saman', 'Saman Lenin', '1975.3.5', 'No.3, Unawatuna, Galle', '0765673557', 'SC002', '2010.02.22', '2017.5.22');
insert into registrationCategory value ('MR005', 'CSC01');
insert into member values('MR006', 'H.R.Jothipala', 'Hettiarachchige Reginald Jothipala','1998.2.12', 'No.1, Baddegama, Galle', '0924466237', 'SC003', '2015.03.22','2017.5.23');
insert into registrationCategory value ('MR006', 'CSC01');
insert into member values('MR007', 'S.Edirisinghe', 'Sunil Edirisinghe', '2023.04.11', 'No.2, Elpitiya, Galle', '0722340985', 'SC004', '2011.04.22', '2017.5.23');
insert into registrationCategory value ('MR007', 'CSC01');
insert into member values('MR008', 'V.Rathnayake', 'Victor Rathnayake', '2000.05.05', 'No.12, Hikkaduwa, Galle', '0765552222', 'SC003', '2012.05.22', '2017.5.24');
insert into registrationCategory value ('MR008', 'CSC01');

insert into member values('MR009', 'M.Nanda', 'Nanda Malini', '1975.3.5', 'No.3, Unawatuna, Galle', '0765673557', 'SC002', '2010.02.22', '2017.5.22');
insert into registrationCategory value ('MR009', 'GSC01');
insert into member values('MR010', 'W.Latha', 'latha Walpola','1998.2.12', 'No.1, Baddegama, Galle', '0924466237', 'SC003', '2015.03.22','2017.5.23');
insert into registrationCategory value ('MR010', 'GSC01');
insert into member values('MR011', 'N. Wirajini', 'Nirosha Virajini', '2023.04.11', 'No.2, Elpitiya, Galle', '0722340985', 'SC004', '2011.04.22', '2017.5.23');
insert into registrationCategory value ('MR011', 'GSC01');
insert into member values('MR012', 'N. Kaushalya', 'Nishara Kaushalya', '2000.05.05', 'No.12, Hikkaduwa, Galle', '0765552222', 'SC004', '2012.05.22', '2017.5.24');
insert into registrationCategory value ('MR012', 'GSC01');

insert into member values('RR001', 'K.H.Madhuranga Piyamantha', 'Kariyawasam Haputhanthrige Madhuranga Piyamantha', '1998.01.28', 'No.100, Galusiri Uyana, Kithulampitiya, Galle', '0765444333','', '2007.02.22', '2017.5.12');
insert into registrationCategory value ('RR001', 'RSC01');
insert into member values('RR002', 'L.Dilanka', 'Dilanka Lokuge', '1994.01.28', 'No.75, Baddegama Galle', '0765444333','', '2007.02.22', '2017.5.12');
insert into registrationCategory value ('RR002', 'RSC01');
insert into member values('RR003', 'S. Jayanga', 'Sisith Jayanga', '1990.01.28', 'No.99, Elpitiya Galle', '0765444333','', '2007.02.22', '2017.5.12');
insert into registrationCategory value ('RR003', 'RSC01');
insert into member values('RR004', 'M. K.T. Dhanajaya ', 'Tharindu Dhananjaya Mandawala', '1995.01.28', 'No.1, Dadalla, Galle', '0765444333','', '2007.02.22', '2017.5.12');
insert into registrationCategory value ('RR004', 'RSC01');

insert into coreBadge value ('CB001', 'BSC01', 'Member Ship Award', '2', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB002', 'BSC01', 'D.C.Cord', '9', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB003', 'BSC01', 'C.C.Award', '6', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CR004', 'BSC01', 'C.C. Cord', '2', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');

insert into coreBadge value ('CB005', 'RSC01', 'Scouts of the World Award', '12', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB006', 'RSC01', 'Explorer Belt', '10', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB007', 'RSC01', 'Chief Scout Award', '10', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB008', 'RSC01', 'Baden-Powell Award', '18', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');

insert into coreBadge value ('CB009', 'CSC01', 'Bronze Star', '2', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB010', 'CSC01', 'Silver Star', '9', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');
insert into coreBadge value ('CB011', 'CSC01', 'Gold Star', '6', 'dsf dsf dsfasf adsfa dsfsafeartegshhgf fhfhtythgfh f sr sfs srt sr sgfd dfgfd  retf ffdds gdsfg s fdr redgdf df gfd gdret ');

insert into meritBadge value('S.F./01', 'BSC01', 'Artist', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('S.F./01', 'TR001');
insert into meritBadgeTeacher value('S.F./01', 'TR002');
insert into meritBadge value ('S.F./02', 'BSC01', 'Musician', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('S.F./02', 'TR001');
insert into meritBadge value ('S.C./04', 'BSC01', 'Clerk', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('S.C./04', 'TR001');
insert into meritBadgeTeacher value('S.C./04', 'TR002');
insert into meritBadge value ('J.B./02', 'BSC01', 'Musician', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('J.B./02', 'TR001');
insert into meritBadge value ('J.B./03', 'BSC01', 'Woodcraftsman', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('J.B./03', 'TR001');
insert into meritBadgeTeacher value('J.B./03', 'TR002');
insert into meritBadge value ('J.D./02', 'BSC01', 'Swimmer', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('J.D./02', 'TR001');
insert into meritBadge value ('J.D./01', 'BSC01', 'Athlete', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('J.D./01', 'TR001');
insert into meritBadgeTeacher value('J.D./01', 'TR002');

insert into meritBadge value ('C.C./04', 'CSC01', 'World Conservation Award', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('C.C./04', 'TR001');
insert into meritBadgeTeacher value('C.C./04', 'TR002');
insert into meritBadge value ('C.B./02', 'CSC01', 'International Spirit Award', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('C.B./02', 'TR001');
insert into meritBadge value ('C.B./03', 'CSC01', 'Duty to God Award', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('C.B./03', 'TR001');
insert into meritBadgeTeacher value('C.B./03', 'TR002');
insert into meritBadge value ('C.D./02', 'CSC01', 'William T. Hornady Awards', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('C.D./02', 'TR001');
insert into meritBadge value ('C.D./01', 'CSC01', 'Quartermaster Award', 'dfsf  dsf sdfsdd drergfdg d  dfgd er fg er gege ergrege ');
insert into meritBadgeTeacher value('C.D./01', 'TR001');
insert into meritBadgeTeacher value('C.D./01', 'TR002');
