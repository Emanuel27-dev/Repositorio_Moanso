package clases;

import java.util.ArrayList;
import clases.Administrador;
public class ArregloAdministradores {
	ArrayList<Administrador> adm;
	public ArregloAdministradores(){
	adm=new ArrayList<Administrador>();
	adicionar(new Administrador("Boss","Bossi","admin","9876",9876543));
	}
	public void adicionar(Administrador x){
		adm.add(x);
	}
	public int tamano() {
		 return adm.size();
	}
	public Administrador obtener(int i) {
		 return adm.get(i);
	}
/*	public Administrador buscar(int cod_adm) {
		 for (int i=0; i<tamano(); i++)
			 if (obtener(i).getDni_adm() == cod)
				 return obtener(i);
		 return null;
	}*/
}
