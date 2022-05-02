import java.util.ArrayList;

public class Producto implements Comparable <Producto> {
  private int referencia;
  private String nombre;
  private int precio;
  private String descripcion;
  public static ArrayList<Producto> productos = new ArrayList<Producto>();
    
  public Producto(int referencia, String nombre, int precio, String descripcion) {
    this.referencia= referencia;
    this.nombre= nombre;
    this.precio= precio;
    this.descripcion= descripcion;
  }
   
  public void setReferencia(int referencia) {
    this.referencia= referencia;
  }
    
  public int getReferencia(){
    return referencia;
  }
    
  public void setNombre(String nombre) {
    this.nombre= nombre;
  }
    
  public String getNombre() {
    return nombre;
  }
    
  public void setPrecio(int precio) {
    this.precio= precio;
  }
    
  public int getPrecio() {
    return precio;
  }
    
  public void setDescripcion(String descripcion) {
    this.descripcion= descripcion;
  }
    
  public String getDescripcion() {
    return descripcion;
  }
    
  // Métodos de Administrador
  
  public static void modificar(int numero) {
    for(int i=0; i<Producto.productos.size(); i++) {
      Producto a = Producto.productos.get(i);
        if(numero==i) {
          a.setReferencia(110);
          a.setNombre("hola");
          a.setPrecio(110);
          a.setDescripcion("hola");               
        }
    }
  }
    
  public static void eliminar(int numero) {
    for(int i=0; i<Producto.productos.size(); i++) {
      if(numero==i){
        Producto.productos.remove(i);
      }
    }
  }
    
  public static String mostrar() {
    String cadena="";
      for(int i =0; i<Producto.productos.size(); i++) {
        Producto a = Producto.productos.get(i);
        cadena=cadena+a.getReferencia()+a.getNombre()+a.getPrecio()+a.getDescripcion()+"\n";
      }
    return cadena;
  }
    
  //Métodos de Cliente
    
  public static String mostrarProducto(String nombreProducto) {
    String cadena="";
    boolean siono=false;
      for(int i=0; i<Producto.productos.size(); i++) {
        Producto a = Producto.productos.get(i);
          if(a.getNombre().equals(nombreProducto)) {
            siono=true;
            cadena=cadena+ a.getReferencia()+a.getNombre()+a.getPrecio()+a.getDescripcion()+"\n";
          }           
      }
    return cadena;
  }
    
  public static String mostrarTienda(String nombre) {
    String cadena="";
      for(int i=0; i<Producto.productos.size(); i++) {
        Producto a = Producto.productos.get(i);
        cadena=cadena+ a.getReferencia()+a.getNombre()+a.getPrecio()+a.getDescripcion()+"\n";
      }
    return cadena;
  }
  
  //Método de ordenamiento de arreglo clase cliente
  @Override
  public int compareTo(Producto p) {
    if (this.precio<p.getPrecio()) {
      return -1;
    }
    else if (this.precio>p.getPrecio()) {
      return 1;
    }
    else {
      return 0;
    }
  } 
}
