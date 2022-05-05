insert into shipbean values('B101',8,15,'Abc');
insert into shipbean values('B102',6,10,'Shimla');
insert into shipbean values('B103',3,14,'Delhi');

insert into routebean values('R1001','Delhi',500.0,'Goa','three');
insert into routebean values('R1002','Spain',3500.0,'America','five');
insert into routebean values('R1003','Finland',10500.0,'Paris','ten');

insert into schedulebean values('SD001','R1001','B101','2022-04-08 00:00:00');
insert into schedulebean values('SD002','R1002','B102','2022-04-15 00:00:00');
insert into schedulebean values('SD003','R1003','B103','2022-04-21 00:00:00');

insert into reservationbean values('RT001','2022-04-08 00:00:00','Scheduled','2022-04-10 00:00:00','14','SD001',1500,'abc@gmail.com');

insert into credentialsbean values('abc@gmail.com',0,'abcin','logged');

insert into passengerbean values('RT001',23,'male','Rona','SD001');
insert into passengerbean values('RT002',30,'female','Rachel','SD002');
insert into passengerbean values('RT003',20,'female','Mona','SD001');