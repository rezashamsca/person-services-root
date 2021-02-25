create user 'springuser'@'%' identified by 'su-password'; -- Creates the user
grant all on ClientDb.* to 'springuser'@'%';