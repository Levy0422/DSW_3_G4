//Clase Principal Seguridad
public class Seguridad {
    
    public void calcularSalario() {
        System.out.println("Calculando el salario total del seguridad");   
    }
    
    public void patrullarArea() {
        System.out.println("Patrullando un area en especifica");
    }
    
    
    // Clase hija 
    public static class SeguridadAcceso extends Seguridad {
        
        public void revisarAcceso() {
            System.out.println("Supervisacion del acceso del personal al lugar");
        }
    }
    
    public static void main(String[] args) {
        
        SeguridadAcceso seguridadAcceso = new SeguridadAcceso();
        seguridadAcceso.calcularSalario();
        seguridadAcceso.patrullarArea();
        seguridadAcceso.revisarAcceso();
    }
    
}
