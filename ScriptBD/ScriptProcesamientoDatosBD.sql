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
    idTipoDoc int NOT NULL,
	razonSocial varchar(100) NOT NULL,
	direccionEmpresa varchar(100) NOT NULL,
	activo SMALLINT NOT NULL,
    FOREIGN KEY (idTipoDocumento) REFERENCES tipoDocumento(idTipoDoc)
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

CREATE TABLE infoNomina(
	idNomina BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    referencia VARCHAR(50) NOT NULL,
    idSolicitud INT NOT NULL,
    documentoEmpresa BIGINT NOT NULL,
    documentoEmpleado BIGINT NOT NULL,
    anio int not null,
    mes int not null,
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
	fechaCargue timestamp DEFAULT current_timestamp,
    usuarioCargue BIGINT,
    FOREIGN KEY (idSolicitud) REFERENCES solicitud(idSolicitud),
    FOREIGN KEY (documentoEmpresa) REFERENCES empresa(documentoEmpresa),
    FOREIGN KEY (documentoEmpleado) REFERENCES empleado(documentoEmpleado)
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
    documentoEmpresa BIGINT,
    documentoEmpleado BIGINT,
    ibc bigint,
    ingresoTotal bigint,
    salud bigint,
    pension bigint,
    arl bigint,
    FOREIGN KEY (documentoEmpresa) REFERENCES empresa(documentoEmpresa),
    FOREIGN KEY (documentoEmpleado) REFERENCES empleado(documentoEmpleado)
);
