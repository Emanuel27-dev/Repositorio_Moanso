package clases;
import java.util.ArrayList;

import clases.Usuario;
public class ArregloUsuarios {
ArrayList<Usuario> usu;
public ArregloUsuarios(){
	usu=new ArrayList<Usuario>();
	adicionar(new Usuario("Pedro","Picapiedra","user","1234",1234567));
}
public void adicionar(Usuario x){
	usu.add(x);
}
public int tamano() {
	 return usu.size();
}
public Usuario obtener(int i) {
	 return usu.get(i);
}
}
