???prompt PL/SQL Developer Export User Objects for user SYSTEM@ORCL
prompt Created by dell on 2019��5��18��
set define off
spool tb_review.log

prompt
prompt Creating table TB_REVIEW
prompt ========================
prompt
create table SYSTEM.TB_REVIEW
(
  id         NUMBER generated by default on null as identity,
  username   VARCHAR2(20),
  title      VARCHAR2(40),
  content    VARCHAR2(400),
  score      VARCHAR2(20),
  reviewtime VARCHAR2(100)
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
alter table SYSTEM.TB_REVIEW
  add constraint REVIEWID primary key (ID)
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
