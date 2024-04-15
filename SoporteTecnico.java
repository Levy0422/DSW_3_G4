// Clase principal SoporteTecnico
public class SoporteTecnico {
    public void calcularSalario() {
        System.out.println("Calculando salario total del técnico de soporte...");
    }

    public void resolverIncidencias() {
        System.out.println("Resolviendo problemas técnicos reportados por los usuarios...");
    }

    public void actualizarSoftware() {
        System.out.println("Realizando actualizaciones de software en los equipos...");
    }

    public void brindarAsesoramiento() {
        System.out.println("Brindando asesoramiento técnico a los usuarios...");
    }

    // Clase hija SoporteTecnicoEspecializado que extiende de SoporteTecnico
    public static class SoporteTecnicoEspecializado extends SoporteTecnico {
        public void mantenimientoPreventivo() {
            System.out.println("Realizando mantenimiento preventivo en los equipos...");
        }

        public void realizarCotizaciones() {
            System.out.println("Elaborando cotizaciones para los clientes...");
        }

        public void gestionarInventario() {
            System.out.println("Gestionando el inventario de equipos y repuestos...");
        }
    }

    public static void main(String[] args) {
        SoporteTecnicoEspecializado soporteEspecializado = new SoporteTecnicoEspecializado();
        soporteEspecializado.calcularSalario();
        soporteEspecializado.resolverIncidencias();
        soporteEspecializado.actualizarSoftware();
        soporteEspecializado.brindarAsesoramiento();
        soporteEspecializado.mantenimientoPreventivo();
        soporteEspecializado.realizarCotizaciones();
        soporteEspecializado.gestionarInventario();
    }
}
