--Crear la BD
CREATE DATABASE test
use test

--Crear la tabla tbest
CREATE TABLE tbEst
(
[carnet] [bigint] PRIMARY KEY NOT NULL,
[cedula] [nchar](16) NOT NULL,
[nombres] [varchar](50) NULL,
[apellidos] [varchar](50) NULL,
[celular] [int] NULL,
[fecnac] [varchar](20) NULL,
[direccion] [varchar](300) NULL,
[email] [varchar](50) NULL,
[sexo] [varchar](10) NULL
)

--PROCEDIMIENTOS ALMACENADOS PARA LA TABLA tbest
--INSERTAR
create proc grabar
@Carnet bigint,
@Ced varchar(16),
@Names varchar(50),
@Apel varchar(50),
@Cel int,
@FecNac varchar,
@Dir varchar(300),
@Email varchar(50),
@Sex varchar(10) out
as begin
insert into tbest values (@Carnet,@Ced,@Names,@Apel,@Cel,@FecNac,@Dir,@Email,@Sex)
end
go

--BUSCAR
create proc buscar
@Carnet bigint 
as begin
select * from tbest where carnet = @Carnet
end 
go 

--ACTUALIZAR
create proc actualizar
@Carnet bigint,
@Ced varchar(16),
@Names varchar(50),
@Apel varchar(50),
@Cel int,
@FecNac varchar,
@Dir varchar(300),
@Email varchar(50),
@Sex varchar(10) out
as begin
update tbest set 
cedula= @Ced,nombres = @Names,apellidos = @Apel,celular = @Cel,fecnac= @FecNac,
direccion = @Dir,email = @Email,sexo = @Sex 
where carnet = @Carnet
end
go

--ELIMINAR
create proc eliminar
@Carnet bigint 
as begin
delete from tbest where carnet = @Carnet
end 
go 

SELECT * FROM tbest
DELETE FROM tbest

--Hacer una tabla tbAuditoria para probar un Trigger
CREATE TABLE tbAuditoria(
	fec [date] NOT NULL,
	carnet [bigint] NOT NULL,
	cedula [varchar](16) NULL,
	nombres [varchar](50) NULL,
	apellidos [varchar](50) NULL
)

--Realizar un Trigger que guarde en la tabla tbAuditoria, la fecha en que se ejecutó
--la transacción, el carnet, cédula, nombres, apellidos del quien hizo
--una inserción o actualización en la tabla tbest

CREATE TRIGGER EstLog
ON tbest
AFTER INSERT, UPDATE
AS
BEGIN
	SET NOCOUNT ON;

    -- Insert statements for trigger here
	DECLARE @carnet AS BIGINT
	DECLARE @cedula AS VARCHAR(16)
	DECLARE @nombres AS VARCHAR(50)
	DECLARE @apellidos AS VARCHAR(50)
	
	SELECT @carnet = carnet,
		   @cedula = cedula,
		   @nombres = nombres,
		   @apellidos = apellidos
	FROM inserted
	
	--DECLARE @direccion VARCHAR(50)
	--SET @direccion = 'Managua'
	
	INSERT dbo.tbAuditoria (fec,      carnet, cedula, nombres, apellidos)
	                VALUES (GETDATE(),@carnet,@cedula,@nombres,@apellidos)
END
GO

select * from tbAuditoria