DROP table IF EXISTS empleados;
DROP table IF EXISTS departamentos;

create table `departamentos`(
	`codigo` int primary key,
	`nombre` varchar(100),
    `presupuesto` int
);

create table empleado(
	`dni` varchar(8) primary key,
	`nombre` varchar(100),
	`apellidos` varchar(255),
    `departamento` int,
    foreign key(`departamento`) references `departamentos`(`codigo`)
);


insert into departamentos values(1,'I+D',10000);
insert into departamentos values(2,'RRHH',5000);
insert into departamentos values(3,'QA',1000);

insert into empleado values('12345678','Pepe', 'Gonzalez',1);
insert into empleado values('12345679','Jose', 'Joestar',1);
insert into empleado values('12345680','Maria', 'Palamos',2);
insert into empleado values('12345670','Kelly', 'Kapoor',2);
