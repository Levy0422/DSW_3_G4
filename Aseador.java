class Aseador {
    private String nombre;
    private int id;
    private String departamento;
    private double salarioBase;
    private boolean medioTiempo;
    private String apellido;
    private String cedula;
    private String telefono;
    public double calcularSalario() {
    if (medioTiempo) {
    return salarioBase / 2;
    } else {
    return salarioBase;
    }
    }
    //clase hija
    public class AseadorO extends Aseador{
    public void limpiarArea(String area) {
     System.out.println("Limpiando el área: " + area);
    }
    public void reportarProblema(String problema) {
     System.out.println("Reportando problema: " + problema);
    }
    }
    }