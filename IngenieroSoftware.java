// Clase principal IngenieroSoftware
public class IngenieroSoftware {
    public void calcularSalario() {
        System.out.println("Calculando salario total del ingeniero de software...");
    }

    public void desarrollarSoftware() {
        System.out.println("Desarrollando aplicaciones y sistemas informáticos...");
    }

    public void realizarPruebas() {
        System.out.println("Realizando pruebas de software y depurando errores...");
    }

    public void mantenerSistemas() {
        System.out.println("Manteniendo y actualizando sistemas existentes...");
    }

    // Clase hija IngenieroSoftwareEspecializado que extiende de IngenieroSoftware
    public static class IngenieroSoftwareEspecializado extends IngenieroSoftware {
        public void documentacion() {
            System.out.println("Elaborando documentación técnica de los proyectos de software...");
        }

        public void desarrollarActualizaciones() {
            System.out.println("Desarrollando actualizaciones para mejorar software existente...");
        }

        public void estimarCostosDuracion() {
            System.out.println("Estimando costos y duración de proyectos de software...");
        }
    }

    public static void main(String[] args) {
        IngenieroSoftwareEspecializado ingenieroEspecializado = new IngenieroSoftwareEspecializado();
        ingenieroEspecializado.calcularSalario();
        ingenieroEspecializado.desarrollarSoftware();
        ingenieroEspecializado.realizarPruebas();
        ingenieroEspecializado.mantenerSistemas();
        ingenieroEspecializado.documentacion();
        ingenieroEspecializado.desarrollarActualizaciones();
        ingenieroEspecializado.estimarCostosDuracion();
    }
}
