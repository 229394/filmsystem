???prompt PL/SQL Developer Export User Objects for user SYSTEM@ORCL
prompt Created by dell on 2019��5��18��
set define off
spool tb_user.log

prompt
prompt Creating table TB_ADMIN
prompt =======================
prompt
create table SYSTEM.TB_ADMIN
(
  id        NUMBER generated by default on null as identity,
  adminname VARCHAR2(20),
  adminpwd  VARCHAR2(20)
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


prompt Done
spool off
set define on