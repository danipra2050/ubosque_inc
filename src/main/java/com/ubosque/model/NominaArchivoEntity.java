package com.ubosque.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nominaArchivo", schema = "procesadatos", catalog = "")
public class NominaArchivoEntity {
    private long idNomina;
    private String referencia;
    private String solicitud;
    private long documentoEmpresa;
    private String razonSocial;
    private String tipoDocumento;
    private long documentoEmpleado;
    private String nombreEmpleado;
    private String cargo;
    private int anio;
    private int mes;
    private long salario;
    private int diasTrabajados;
    private int diasIncapacidad;
    private int diasLicencia;
    private int totalDias;
    private long sueldoBasico;
    private Date fechaIngreso;
    private Long apoyoSostenimiento;
    private Long extraDiurna;
    private Long extraFaltante;
    private Long comisiones;
    private Long vacacionesDisfrutadas;
    private Long vacacionesCompensadas;
    private Long aporteEmpleadorCf;
    private Long bonoRetiro;
    private Long primaVacacionesCf;
    private Long incapacidades;
    private Timestamp fechaCargue;

    @Id
    @Column(name = "idNomina")
    public long getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(long idNomina) {
        this.idNomina = idNomina;
    }

    @Basic
    @Column(name = "referencia")
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Basic
    @Column(name = "solicitud")
    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    @Basic
    @Column(name = "documentoEmpresa")
    public long getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(long documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    @Basic
    @Column(name = "razonSocial")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Basic
    @Column(name = "documentoEmpleado")
    public long getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(long documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    @Basic
    @Column(name = "nombreEmpleado")
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Basic
    @Column(name = "cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "anio")
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Basic
    @Column(name = "mes")
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Basic
    @Column(name = "salario")
    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "diasTrabajados")
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Basic
    @Column(name = "diasIncapacidad")
    public int getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(int diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    @Basic
    @Column(name = "diasLicencia")
    public int getDiasLicencia() {
        return diasLicencia;
    }

    public void setDiasLicencia(int diasLicencia) {
        this.diasLicencia = diasLicencia;
    }

    @Basic
    @Column(name = "totalDias")
    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    @Basic
    @Column(name = "sueldoBasico")
    public long getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(long sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Basic
    @Column(name = "fechaIngreso")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Basic
    @Column(name = "apoyoSostenimiento")
    public Long getApoyoSostenimiento() {
        return apoyoSostenimiento;
    }

    public void setApoyoSostenimiento(Long apoyoSostenimiento) {
        this.apoyoSostenimiento = apoyoSostenimiento;
    }

    @Basic
    @Column(name = "extraDiurna")
    public Long getExtraDiurna() {
        return extraDiurna;
    }

    public void setExtraDiurna(Long extraDiurna) {
        this.extraDiurna = extraDiurna;
    }

    @Basic
    @Column(name = "extraFaltante")
    public Long getExtraFaltante() {
        return extraFaltante;
    }

    public void setExtraFaltante(Long extraFaltante) {
        this.extraFaltante = extraFaltante;
    }

    @Basic
    @Column(name = "comisiones")
    public Long getComisiones() {
        return comisiones;
    }

    public void setComisiones(Long comisiones) {
        this.comisiones = comisiones;
    }

    @Basic
    @Column(name = "vacacionesDisfrutadas")
    public Long getVacacionesDisfrutadas() {
        return vacacionesDisfrutadas;
    }

    public void setVacacionesDisfrutadas(Long vacacionesDisfrutadas) {
        this.vacacionesDisfrutadas = vacacionesDisfrutadas;
    }

    @Basic
    @Column(name = "vacacionesCompensadas")
    public Long getVacacionesCompensadas() {
        return vacacionesCompensadas;
    }

    public void setVacacionesCompensadas(Long vacacionesCompensadas) {
        this.vacacionesCompensadas = vacacionesCompensadas;
    }

    @Basic
    @Column(name = "aporteEmpleadorCF")
    public Long getAporteEmpleadorCf() {
        return aporteEmpleadorCf;
    }

    public void setAporteEmpleadorCf(Long aporteEmpleadorCf) {
        this.aporteEmpleadorCf = aporteEmpleadorCf;
    }

    @Basic
    @Column(name = "bonoRetiro")
    public Long getBonoRetiro() {
        return bonoRetiro;
    }

    public void setBonoRetiro(Long bonoRetiro) {
        this.bonoRetiro = bonoRetiro;
    }

    @Basic
    @Column(name = "primaVacacionesCF")
    public Long getPrimaVacacionesCf() {
        return primaVacacionesCf;
    }

    public void setPrimaVacacionesCf(Long primaVacacionesCf) {
        this.primaVacacionesCf = primaVacacionesCf;
    }

    @Basic
    @Column(name = "incapacidades")
    public Long getIncapacidades() {
        return incapacidades;
    }

    public void setIncapacidades(Long incapacidades) {
        this.incapacidades = incapacidades;
    }

    @Basic
    @Column(name = "fechaCargue")
    public Timestamp getFechaCargue() {
        return fechaCargue;
    }

    public void setFechaCargue(Timestamp fechaCargue) {
        this.fechaCargue = fechaCargue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NominaArchivoEntity that = (NominaArchivoEntity) o;
        return idNomina == that.idNomina && documentoEmpresa == that.documentoEmpresa && documentoEmpleado == that.documentoEmpleado && anio == that.anio && mes == that.mes && salario == that.salario && diasTrabajados == that.diasTrabajados && diasIncapacidad == that.diasIncapacidad && diasLicencia == that.diasLicencia && totalDias == that.totalDias && sueldoBasico == that.sueldoBasico && Objects.equals(referencia, that.referencia) && Objects.equals(solicitud, that.solicitud) && Objects.equals(razonSocial, that.razonSocial) && Objects.equals(tipoDocumento, that.tipoDocumento) && Objects.equals(nombreEmpleado, that.nombreEmpleado) && Objects.equals(cargo, that.cargo) && Objects.equals(fechaIngreso, that.fechaIngreso) && Objects.equals(apoyoSostenimiento, that.apoyoSostenimiento) && Objects.equals(extraDiurna, that.extraDiurna) && Objects.equals(extraFaltante, that.extraFaltante) && Objects.equals(comisiones, that.comisiones) && Objects.equals(vacacionesDisfrutadas, that.vacacionesDisfrutadas) && Objects.equals(vacacionesCompensadas, that.vacacionesCompensadas) && Objects.equals(aporteEmpleadorCf, that.aporteEmpleadorCf) && Objects.equals(bonoRetiro, that.bonoRetiro) && Objects.equals(primaVacacionesCf, that.primaVacacionesCf) && Objects.equals(incapacidades, that.incapacidades) && Objects.equals(fechaCargue, that.fechaCargue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNomina, referencia, solicitud, documentoEmpresa, razonSocial, tipoDocumento, documentoEmpleado, nombreEmpleado, cargo, anio, mes, salario, diasTrabajados, diasIncapacidad, diasLicencia, totalDias, sueldoBasico, fechaIngreso, apoyoSostenimiento, extraDiurna, extraFaltante, comisiones, vacacionesDisfrutadas, vacacionesCompensadas, aporteEmpleadorCf, bonoRetiro, primaVacacionesCf, incapacidades, fechaCargue);
    }
}
