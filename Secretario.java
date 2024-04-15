public class Secretario{
    private String nombre = "Martin";
    private int ID = 2;
    private double salarioBase = 49.99;
    private int horasTrabajadas = 8;
    private boolean tiempoCompleto = true;
    private String apellido = "Concepcion";
    private String cedula = "4-444-555";
    private int telefono = 6668888;

    public void calcularSalario(){
        System.out.println("Calculando el salario para: " + nombre);
    }

    public void gestionarAgenda(){
        System.out.println("Gestionando la agenda de...");
    }

    public void redactarCorrespondencia(){
        System.out.println("Redactando la correspondencia para...");
    }

    public void organizarDocumentos(){
        System.out.println("Organizando los documentos...");
    }

    public class SecretarioExtra extends Secretario{
        public void atencionCliente(){
            System.out.println("Atendiendo al cliente en turno");
        }

        public void atenderLlamadas(){
            System.out.println("Haciendo y Recibiendo llamadas");
        }

        public void prepararJuntas(){
            System.out.println("Asistiendo al gerente con las juntas...");
        }
    } 
}
