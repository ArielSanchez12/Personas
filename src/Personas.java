//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Personas {

    String nombre,direccion, ocupacion;
    int edad, telefono;

    //metodo contruktor para inicializar las variables
    public Personas(String nombre, String direccion, String ocupacion, int edad, int telefono){
        this.nombre = nombre; //Por k se pone this????????
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.telefono = telefono;
    }
    public void presentarse(){
        System.out.println("Hola mi nombre es " + nombre + " mi direccion es: "+ direccion+" mi ocupacion es: "+ocupacion+", mi edad es"+edad+" mi telefono es: "+telefono);
    }
    public void correr(){
        System.out.println("La persona " + nombre + " corre por " + direccion+ " aparenta tener " + edad);
    }

    public static void main(String[] args) {

        Personas estudiante = new Personas("Diego", "San Jose de Moran", "Estudiante",  20, 978852305);
        Personas docente = new Personas("Monica", "La Floresta", "Docente",  99, 978850523);
        Personas secretaria = new Personas("Marta", "Esfot", "Secretaria",  29, 987456532);

        estudiante.presentarse(); //llamada al metodo presentarse()
        docente.presentarse();
        secretaria.presentarse();

        System.out.println();

        estudiante.correr(); //llamada al metodo correr()
        docente.correr();
        secretaria.correr();

    }
}