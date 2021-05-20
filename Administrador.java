package clases;

public class Administrador {
private String nom_adm,ape_adm,cod_adm,con_adm;
private int dni_adm;
public Administrador(String nom_adm, String ape_adm, String cod_adm, String con_adm, int dni_adm) {
	this.nom_adm = nom_adm;
	this.ape_adm = ape_adm;
	this.cod_adm = cod_adm;
	this.con_adm = con_adm;
	this.dni_adm = dni_adm;
}
public String getNom_adm() {
	return nom_adm;
}
public void setNom_adm(String nom_adm) {
	this.nom_adm = nom_adm;
}
public String getApe_adm() {
	return ape_adm;
}
public void setApe_adm(String ape_adm) {
	this.ape_adm = ape_adm;
}
public String getCod_adm() {
	return cod_adm;
}
public void setCod_adm(String cod_adm) {
	this.cod_adm = cod_adm;
}
public String getCon_adm() {
	return con_adm;
}
public void setCon_adm(String con_adm) {
	this.con_adm = con_adm;
}
public int getDni_adm() {
	return dni_adm;
}
public void setDni_adm(int dni_adm) {
	this.dni_adm = dni_adm;
}


}
