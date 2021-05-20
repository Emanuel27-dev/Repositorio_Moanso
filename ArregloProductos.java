package clases;
import java.util.ArrayList;
public class ArregloProductos {
	private ArrayList <Producto> pro;
	
	public ArregloProductos(){
		pro=new ArrayList<Producto> ();
		adicionar(new Producto(101,"Pedro",0,16069874));
		adicionar(new Producto(102,"Irene",0,77277807));
		adicionar(new Producto(103,"Luis",0,71711068));
		adicionar(new Producto(104,"Enrique",0,72674269));
		adicionar(new Producto(105,"Viviana",0,71272451));
		adicionar(new Producto(106,"Gaiceda",0,12345678));
		adicionar(new Producto(107,"Wendy",0,98765432));
	}
	public void adicionar(Producto x){
		pro.add(x);
	}
	public int tamano(){
		return pro.size();
	}
	public Producto obtener(int i){
		return pro.get(i);
	}
	public Producto buscar(int cod) {
		 for (int i=0; i<tamano(); i++)
			 if (obtener(i).getCod_p() == cod)
				 return obtener(i);
		 return null;
	}
	public void set(int i,Producto x){
		pro.set(i,x);
	}
	public void eliminar(int i){
		pro.remove(i);
	}
}
