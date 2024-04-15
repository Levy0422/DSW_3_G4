public class RecursosHumanos {
    
    public void calcularSalario() {
        System.out.println("Calculando salario de Recursos Humanos");
    }
    
    public void reclutarPersonal() {
        System.out.println("Reclutamiento de nuevo personal basado en requisitos especificos");
    }
    
    // Clase Hija 
    public static class RecursosHumanosGestion extends RecursosHumanos {
        
        public void gestionarRequisitos() {
            System.out.println("Gestinar los beneficios de los empleados");
        }
    }
    
    public static void main(String[] args) {
        
        RecursosHumanosGestion recursosHumanosGestion = new RecursosHumanosGestion();
        recursosHumanosGestion.calcularSalario();
        recursosHumanosGestion.reclutarPersonal();
        recursosHumanosGestion.gestionarRequisitos();
    }
    
}

