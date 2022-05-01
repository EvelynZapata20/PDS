import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Cliente {
  public static void main (String [] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("-- BUSCAR PRODUCTO --");
    System.out.println("Ingrese el nombre del producto");
    String nombreProducto=scan.next();
    Cliente.buscarProducto(nombreProducto);
      while (true) {
        System.out.println("¿Desea buscar otro producto?");
        String otroProducto=scan.next(); 
        if (otroProducto.equalsIgnoreCase("si")) {
          System.out.println("Ingrese el nombre del nuevo producto");
          String nuevoProducto= scan.next();
          Cliente.buscarProducto(nuevoProducto); 
        }
        else {
          System.out.println("Búsqueda finalizada");
          break;
        }
      }
  }
     
  public static void buscarProducto (String nombreProducto) {
    ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();  
    int i=1;
    
      while (i<=Producto.productos.size()) {
        if (Producto.productos.get(i-1).getNombre().toLowerCase().contains(nombreProducto.toLowerCase())){
          productosEncontrados.add(Producto.productos.get(i-1));  
        }
        i++;
      }
        
      if (productosEncontrados.size()>0){
        Collections.sort(productosEncontrados);
        System.out.println(""); 
        System.out.println("PRODUCTOS ENCONTRADOS:");                 
        for(Producto producto: productosEncontrados ){
          System.out.println("");
          System.out.println("Referencia: "+producto.getReferencia());
          System.out.println("Nombre: " + producto.getNombre());
          System.out.println("Precio:" + producto.getPrecio());
          System.out.println("Descripción: " + producto.getDescripcion());
          System.out.println("");
        }
      }
      else if (productosEncontrados.size()==0){
        System.out.println("El producto no se encuentra");
        System.out.println("");
      }
  }
}
