create table members(
id varchar2(10), 
pw varchar2(20),
name varchar2(10),
age	number(10)
)

insert into members values('dnsql456','1234','����',20)
insert into members values('krb','1234','��纻',26);
insert into members values('psj','1234','�ڼ���',29);
insert into members values('lsj','1234','�̻���',27);
insert into members values('csw','1234','�ּ���',29);
delete from members where id = 'dnsql456'
update members set id = 'kub' where id = 'dnsql456'

select * from members