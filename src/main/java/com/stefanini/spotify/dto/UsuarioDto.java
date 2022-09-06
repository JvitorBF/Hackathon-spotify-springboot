package com.stefanini.spotify.dto;

public class UsuarioDto {
    private String nome_usuario;
    private String email;
    private String aniversario;
    private String pais;

    public UsuarioDto() {

    }

    public UsuarioDto(String nome_usuario, String email, String aniversario, String pais) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.aniversario = aniversario;
        this.pais = pais;
    }

    public String getNome_usuario() {return nome_usuario;}

    public void setNome_usuario(String nome_usuario) {this.nome_usuario = nome_usuario;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getAniversario() {return aniversario;}

    public void setAniversario(String aniversario) {this.aniversario = aniversario;}

    public String getPais() {return pais;}

    public void setPais(String pais) {this.pais = pais;}
}
