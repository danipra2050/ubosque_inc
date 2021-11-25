CREATE DATABASE procesadatos;
USE procesadatos;

CREATE TABLE tipoDocumento(
	idTipoDoc int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombreTipoDoc varchar(50) NOT null,
	activo SMALLINT NOT NULL
);

CREATE TABLE solicitud(
	idSolicitud int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombreSolicitud varchar(50) NOT NULL,
	activo SMALLINT NOT NULL 
);

CREATE TABLE cargo(
	idCargo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nombreCargo varchar(50) NOT NULL,
	activo SMALLINT NOT NULL
);

CREATE TABLE empresa(
	documentoEmpresa bigint PRIMARY KEY NOT NULL,
	razonSocial varchar(100) NOT NULL,
	direccionEmpresa varchar(100) NOT NULL,
	activo SMALLINT NOT NULL
);

CREATE TABLE empleado(
	documentoEmpleado bigint PRIMARY KEY NOT NULL,
	idTipoDoc int NOT NULL,
	nombreEmpleado varchar(200) NOT NULL,
	idCargo int NOT NULL,
	salario bigint NOT NULL,
	fechaIngreso date NOT NULL,
	FOREIGN KEY (idTipoDoc) REFERENCES tipoDocumento(idTipoDoc),
	FOREIGN KEY (idCargo) REFERENCES cargo(idCargo)
);

CREATE TABLE nominaArchivo(
	idNomina bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    referencia varchar(50) NOT NULL,
    solicitud varchar(100) NOT NULL,
	documentoEmpresa bigint NOT NULL,
    razonSocial varchar(100) NOT NULL,
	tipoDocumento varchar(10) NOT NULL,
    documentoEmpleado bigint NOT NULL,
    nombreEmpleado varchar(100) NOT NULL,
    cargo varchar(50) NOT NULL,
	anio int NOT NULL,
	mes int NOT NULL,
	salario bigint NOT NULL,
	diasTrabajados int NOT NULL,
	diasIncapacidad int NOT NULL,
	diasLicencia int NOT NULL,
	totalDias int NOT NULL,
	sueldoBasico bigint NOT NULL,
	fechaIngreso date NOT NULL,
	apoyoSostenimiento bigint,
	extraDiurna bigint,
	extraFaltante bigint,
	comisiones bigint,
	vacacionesDisfrutadas bigint,
	vacacionesCompensadas bigint,
	aporteEmpleadorCF bigint,
	bonoRetiro bigint,
	primaVacacionesCF bigint,
	incapacidades bigint,
	fechaCargue timestamp DEFAULT current_timestamp
);

CREATE TABLE pila(
	idPila int PRIMARY KEY AUTO_INCREMENT,
    documentoEmpresa bigint NOT NULL,
    documentoEmpleado bigint NOT NULL,
    anio int NOT NULL,
    mes int NOT NULL,
    ibc bigint NOT NULL,
    saludPagar bigint NOT NULL,
    saludPagada bigint NOT NULL,
    saludTarifa int NOT NULL,
    pensionPagar bigint NOT NULL,
    pensionPagada bigint NOT NULL,
    pensionTarifa int NOT NULL,
    FOREIGN KEY (documentoEmpresa) REFERENCES empresa(documentoEmpresa),
    FOREIGN KEY (documentoEmpleado) REFERENCES empleado(documentoEmpleado)
);

CREATE TABLE nomina(
	idNomina int PRIMARY KEY AUTO_INCREMENT,
    documento bigint NOT NULL,
    ibc bigint,
    ingresoTotal bigint,
    salud bigint,
    pension bigint,
    arl bigint
);
