create table members(
id varchar2(10), 
pw varchar2(20),
name varchar2(10),
age	number(10)
)

insert into members values('dnsql456','1234','김운비',20)
insert into members values('krb','1234','김루본',26);
insert into members values('psj','1234','박성준',29);
insert into members values('lsj','1234','이상준',27);
insert into members values('csw','1234','최성우',29);
delete from members where id = 'dnsql456'
update members set id = 'kub' where id = 'dnsql456'

select * from members