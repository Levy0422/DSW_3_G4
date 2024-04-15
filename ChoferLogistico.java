public class ChoferLogistico {
    
    public void calcularSalario() {
        System.out.println("Calculando el salario total del chofer logistico");   
    }
    
    public void transporteMercancias() {
        System.out.println("Transportacion de mercancia a un destino en especifico");   
    }
    
    //Clase Hija
    public static class ChoferLogisticoLabor extends ChoferLogistico {
        
        public void mantenerVehiculo() {
            System.out.println("Mantenimiento del vehiculo del chofer");
        }   
    }
    public static void main(String[] args) {
        
        ChoferLogisticoLabor choferLogisticoLabor = new ChoferLogisticoLabor();
        choferLogisticoLabor.calcularSalario();
        choferLogisticoLabor.transporteMercancias();
        choferLogisticoLabor.mantenerVehiculo();
    }
} 
