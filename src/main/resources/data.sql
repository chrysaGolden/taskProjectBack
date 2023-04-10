insert into TODO(ID,DESCRIPTION,IS_DONE,TARGET_DATE,USERNAME, WILL_DO,STATUS)
values(1000, 'Clean bathroom','Danai',current_date,'Chrysa','Danai','Started');

insert into TODO(ID,DESCRIPTION,IS_DONE,TARGET_DATE,USERNAME,WILL_DO,STATUS)
values(1001, 'Hoover','Efi',current_date,'Chrysa','Efi','Pending');

insert into TODO(ID,DESCRIPTION,IS_DONE,TARGET_DATE,USERNAME,WILL_DO,STATUS)
values(1002, 'pet the cat','Chrysa',current_date,'Chrysa','Chrysa','Complete');

insert into GUESTS_CALENDAR(ID,NAME,USERNAME,DESCRIPTION,FIRST_DAY,LAST_DAY)
values(1002, 'Chrysa','Chrysa', 'paei sto diaolo', current_date, current_date);

--insert into GUESTS_CALENDAR(ID,NAME,USERNAME,DESCRIPTION,FIRST_DAY,LAST_DAY)
--values(1003, 'Chrysa','Chrysa', 'paei sto diaolo', TO_TIMESTAMP('2022-03-28T00:00:00', 'YYYY-MM-DD"T"HH24:MI:SS'), TO_TIMESTAMP('2022-03-29T00:00:00', 'YYYY-MM-DD"T"HH24:MI:SS'));

