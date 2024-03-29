???prompt PL/SQL Developer Export User Objects for user SYSTEM@ORCL
prompt Created by dell on 2019��5��18��
set define off
spool tb_film.log

prompt
prompt Creating table TB_FILM
prompt ======================
prompt
create table SYSTEM.TB_FILM
(
  id          NUMBER generated by default on null as identity,
  title       VARCHAR2(30),
  director    VARCHAR2(40),
  actor       VARCHAR2(50),
  filmtype    VARCHAR2(20),
  filmtime    VARCHAR2(30),
  image       VARCHAR2(300),
  description VARCHAR2(500)
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYSTEM.TB_FILM
  add constraint FILMID primary key (ID)
  using index 
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );


prompt Done
spool off
set define on
