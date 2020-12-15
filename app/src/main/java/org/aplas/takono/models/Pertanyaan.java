package org.aplas.takono.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class Pertanyaan {
    @SerializedName("id_pertanyaan")
    @Expose
    private int id_pertanyaan;

    @SerializedName("pertanyaan")
    @Expose
    private String pertanyaan;

    @SerializedName("tanggal")
    @Expose
    private String tanggal;

    @SerializedName("foto")
    @Expose
    private String foto;

    @SerializedName("id_mapel")
    @Expose
    private int id_mapel;

    @SerializedName("oleh")
    @Expose
    private String oleh;

    @SerializedName("id_user")
    @Expose
    private int id_user;

    @SerializedName("tanggal_edit")
    @Expose
    private String tanggal_edit;

    @SerializedName("status")
    @Expose
    private String status;

    public Pertanyaan(int id_pertanyaan, String pertanyaan, String tanggal, String foto, int id_mapel, String oleh, int id_user, String tanggal_edit, String status) {
        this.id_pertanyaan = id_pertanyaan;
        this.pertanyaan = pertanyaan;
        this.tanggal = tanggal;
        this.foto = foto;
        this.id_mapel = id_mapel;
        this.oleh = oleh;
        this.id_user = id_user;
        this.tanggal_edit = tanggal_edit;
        this.status = status;
    }

    public int getId_pertanyaan() {
        return id_pertanyaan;
    }

    public void setId_pertanyaan(int id_pertanyaan) {
        this.id_pertanyaan = id_pertanyaan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId_mapel() {
        return id_mapel;
    }

    public void setId_mapel(int id_mapel) {
        this.id_mapel = id_mapel;
    }

    public String getOleh() {
        return oleh;
    }

    public void setOleh(String oleh) {
        this.oleh = oleh;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getTanggal_edit() {
        return tanggal_edit;
    }

    public void setTanggal_edit(String tanggal_edit) {
        this.tanggal_edit = tanggal_edit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
