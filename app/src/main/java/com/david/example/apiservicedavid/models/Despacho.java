package com.david.example.apiservicedavid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Despacho {
    @SerializedName("serie_documental_s")
    @Expose
    private String serieDocumentalS;
    @SerializedName("categor_a_de_informaci_n")
    @Expose
    private String categorADeInformaciN;
    @SerializedName("descripcion_del_contenido_de_la_categoria_de_la_informacion")
    @Expose
    private String descripcionDelContenidoDeLaCategoriaDeLaInformacion;
    @SerializedName("formato")
    @Expose
    private String formato;
    @SerializedName("identificaci_n_de_la_serie")
    @Expose
    private String identificaciNDeLaSerie;
    @SerializedName("idioma")
    @Expose
    private String idioma;
    @SerializedName("la_informacion_es_disponible_para_ser_consultada")
    @Expose
    private String laInformacionEsDisponibleParaSerConsultada;
    @SerializedName("la_informacion_es_p_blica")
    @Expose
    private String laInformacionEsPBlica;
    @SerializedName("lugar_de_conservaci_n_electr_nico")
    @Expose
    private String lugarDeConservaciNElectrNico;
    @SerializedName("lugar_de_conservaci_n_fisico")
    @Expose
    private String lugarDeConservaciNFisico;
    @SerializedName("lugar_de_consulta")
    @Expose
    private String lugarDeConsulta;
    @SerializedName("medio_de_conservacion_y_o_soporte")
    @Expose
    private String medioDeConservacionYOSoporte;
    @SerializedName("nombre_del_responsable_de_la_produccion_de_la_informacion")
    @Expose
    private String nombreDelResponsableDeLaProduccionDeLaInformacion;
    @SerializedName("registro_publicado")
    @Expose
    private String registroPublicado;
    @SerializedName("subserie_documental_sd")
    @Expose
    private String subserieDocumentalSd;

    public String getSerieDocumentalS() {
        return serieDocumentalS;
    }

    public void setSerieDocumentalS(String serieDocumentalS) {
        this.serieDocumentalS = serieDocumentalS;
    }

    public String getCategorADeInformaciN() {
        return categorADeInformaciN;
    }

    public void setCategorADeInformaciN(String categorADeInformaciN) {
        this.categorADeInformaciN = categorADeInformaciN;
    }

    public String getDescripcionDelContenidoDeLaCategoriaDeLaInformacion() {
        return descripcionDelContenidoDeLaCategoriaDeLaInformacion;
    }

    public void setDescripcionDelContenidoDeLaCategoriaDeLaInformacion(String descripcionDelContenidoDeLaCategoriaDeLaInformacion) {
        this.descripcionDelContenidoDeLaCategoriaDeLaInformacion = descripcionDelContenidoDeLaCategoriaDeLaInformacion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getIdentificaciNDeLaSerie() {
        return identificaciNDeLaSerie;
    }

    public void setIdentificaciNDeLaSerie(String identificaciNDeLaSerie) {
        this.identificaciNDeLaSerie = identificaciNDeLaSerie;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLaInformacionEsDisponibleParaSerConsultada() {
        return laInformacionEsDisponibleParaSerConsultada;
    }

    public void setLaInformacionEsDisponibleParaSerConsultada(String laInformacionEsDisponibleParaSerConsultada) {
        this.laInformacionEsDisponibleParaSerConsultada = laInformacionEsDisponibleParaSerConsultada;
    }

    public String getLaInformacionEsPBlica() {
        return laInformacionEsPBlica;
    }

    public void setLaInformacionEsPBlica(String laInformacionEsPBlica) {
        this.laInformacionEsPBlica = laInformacionEsPBlica;
    }

    public String getLugarDeConservaciNElectrNico() {
        return lugarDeConservaciNElectrNico;
    }

    public void setLugarDeConservaciNElectrNico(String lugarDeConservaciNElectrNico) {
        this.lugarDeConservaciNElectrNico = lugarDeConservaciNElectrNico;
    }

    public String getLugarDeConservaciNFisico() {
        return lugarDeConservaciNFisico;
    }

    public void setLugarDeConservaciNFisico(String lugarDeConservaciNFisico) {
        this.lugarDeConservaciNFisico = lugarDeConservaciNFisico;
    }

    public String getLugarDeConsulta() {
        return lugarDeConsulta;
    }

    public void setLugarDeConsulta(String lugarDeConsulta) {
        this.lugarDeConsulta = lugarDeConsulta;
    }

    public String getMedioDeConservacionYOSoporte() {
        return medioDeConservacionYOSoporte;
    }

    public void setMedioDeConservacionYOSoporte(String medioDeConservacionYOSoporte) {
        this.medioDeConservacionYOSoporte = medioDeConservacionYOSoporte;
    }

    public String getNombreDelResponsableDeLaProduccionDeLaInformacion() {
        return nombreDelResponsableDeLaProduccionDeLaInformacion;
    }

    public void setNombreDelResponsableDeLaProduccionDeLaInformacion(String nombreDelResponsableDeLaProduccionDeLaInformacion) {
        this.nombreDelResponsableDeLaProduccionDeLaInformacion = nombreDelResponsableDeLaProduccionDeLaInformacion;
    }

    public String getRegistroPublicado() {
        return registroPublicado;
    }

    public void setRegistroPublicado(String registroPublicado) {
        this.registroPublicado = registroPublicado;
    }

    public String getSubserieDocumentalSd() {
        return subserieDocumentalSd;
    }

    public void setSubserieDocumentalSd(String subserieDocumentalSd) {
        this.subserieDocumentalSd = subserieDocumentalSd;
    }
}
