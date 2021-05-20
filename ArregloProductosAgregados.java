package clases;

import java.util.ArrayList;
import clases.ProductosAgregados;
public class ArregloProductosAgregados {
	private ArrayList <ProductosAgregados> pro_a;
	
	public ArregloProductosAgregados(){
		pro_a=new ArrayList<ProductosAgregados>();
	}
	public void adicionar(ProductosAgregados x){
		pro_a.add(x);
	}
	public int tamano(){
		return pro_a.size();
	}
	public ProductosAgregados obtener(int i){
		return pro_a.get(i);
	}
	public ProductosAgregados buscar(int cod) {
		 for (int i=0; i<tamano(); i++)
			 if (obtener(i).getCod_pa() == cod)
				 return obtener(i);
		 return null;
	}
	public void set(int i,ProductosAgregados x){
		pro_a.set(i,x);
	}
	public void eliminar(int i){
		pro_a.remove(i);
	}
}
