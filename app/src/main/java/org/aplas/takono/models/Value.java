package org.aplas.takono.models;

public class Value {
    private long idUser;
    private String username;
    private String password;
    private String level;
    private String idSiswa;
    private Object idGuru;

    public long getIDUser() {
        return idUser;
    }

    public void setIDUser(long value) {
        this.idUser = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        this.username = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String value) {
        this.level = value;
    }

    public String getIDSiswa() {
        return idSiswa;
    }

    public void setIDSiswa(String value) {
        this.idSiswa = value;
    }

    public Object getIDGuru() {
        return idGuru;
    }

    public void setIDGuru(Object value) {
        this.idGuru = value;
    }
}
