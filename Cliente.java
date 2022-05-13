import java.lang.String;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Cliente {
  public static void buscarProducto (String nombreProducto) {
    ArrayList<TxtEnJava> productosEncontrados = new ArrayList<TxtEnJava>(); 
      try{
        File file = new File("usuarios.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String [] arreglo;
        while ((st = br.readLine()) != null){
          arreglo = st.split(",");
          if(arreglo[3].toLowerCase().contains(nombreProducto.toLowerCase())){
            int id= Integer.parseInt(arreglo[0]);
            String descripcion= arreglo[1];
            double precio= Double.parseDouble(arreglo[2]);
            String nombre= arreglo[3];
            String almacen= arreglo[4];
            TxtEnJava t=new TxtEnJava (id, descripcion, precio, nombre, almacen);
            productosEncontrados.add(t);
          }
        }
      }catch(Exception exception){ }
      
      if (productosEncontrados.size()>0){
        Collections.sort(productosEncontrados);
        System.out.println(""); 
        System.out.println("PRODUCTOS ENCONTRADOS:");                 
        for(TxtEnJava producto: productosEncontrados ){
          System.out.println("");
          System.out.println("Referencia: "+producto.getId());
          System.out.println("Descripción: " + producto.getDescripcion());
          System.out.println("Precio:" + producto.getPrecio());
          System.out.println("Nombre: " + producto.getNombre());
          System.out.println("Empresa: " + producto.getEmpresa());
          System.out.println("");
        }
      }
        
      else if (productosEncontrados.size()==0){
        System.out.println("El producto no se encuentra");
        System.out.println("");
      } 
  }
}
