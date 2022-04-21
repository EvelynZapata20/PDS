import java.util.Scanner;

public class Administrador {
    
    Scanner entrada = new Scanner(System.in);

    private String representanteLegal;
    private int cedulaRepresentante;
    private int telefono;
    private int nit;
    private String correoElectronico;
    private String nombreTienda;
    private int numeroLocal;
    private String contrasenia;

    public void registroAdministrador() {
        System.out.println("Representante Legal del local: ");
        this.representanteLegal = entrada.nextLine();
        System.out.println("Cedula del Representante Legal: ");
        this.cedulaRepresentante = entrada.nextInt();
        System.out.println("Teléfono de contacto: ");
        this.telefono = entrada.nextInt();
        System.out.println("NIT: ");
        this.nit = entrada.nextInt();
        System.out.println("Correo Electónico: ");
        this.correoElectronico = entrada.nextLine();
        System.out.println("Nombre del negocio: ");
        this.nombreTienda = entrada.nextLine();
        System.out.println("Número del negocio: ");
        this.numeroLocal = entrada.nextInt();
        System.out.println("Cree una contraseña: ");
        this.contrasenia = entrada.nextLine();

    }

    public void inicioSesion(int cedula, String contrasenia) {
        boolean verificacion = false;
        int intentos = 0;
        while (verificacion != true && intentos<5) {
            if(cedula == this.cedulaRepresentante && contrasenia == this.contrasenia){
                System.out.println("...Ha iniciado sesión correctamente...");
                verificacion = true;
            }
            else{
                System.out.println("...Credencuiales incorrectos...\t...Intente de nuevo...");
                intentos++;
            }
        }
    }
    
    public Producto crearProducto(){
        Producto nuevoProducto = new Producto();
        return nuevoProducto;
    }
    
    public void eliminarProducto(){
    
    }
}
