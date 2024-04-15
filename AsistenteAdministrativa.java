// Clase principal AsistenteAdministrativa
public class AsistenteAdministrativa {
    public void calcularSalario() {
        System.out.println("Calculando salario total del asistente administrativo...");
    }

    public void gestionarDocumentacion() {
        System.out.println("Gestionando la documentación de la empresa...");
    }

    public void coordinarReuniones() {
        System.out.println("Coordinando reuniones y eventos empresariales...");
    }

    public void atenderLlamadas() {
        System.out.println("Atendiendo llamadas telefónicas y transfiriéndolas al departamento correspondiente...");
    }

    // Clase hija AsistenteAdministrativaEspecializada que extiende de AsistenteAdministrativa
    public static class AsistenteAdministrativaEspecializada extends AsistenteAdministrativa {
        public void gestionarInventario() {
            System.out.println("Realizando el inventario de suministros y materiales de la empresa...");
        }

        public void monitorearProyecto() {
            System.out.println("Monitoreando el avance de proyectos en la empresa...");
        }

        public void generarInformes() {
            System.out.println("Elaborando informes ejecutivos para la dirección de la empresa...");
        }
    }

    public static void main(String[] args) {
        AsistenteAdministrativaEspecializada asistenteEspecializada = new AsistenteAdministrativaEspecializada();
        asistenteEspecializada.calcularSalario();
        asistenteEspecializada.gestionarDocumentacion();
        asistenteEspecializada.coordinarReuniones();
        asistenteEspecializada.atenderLlamadas();
        asistenteEspecializada.gestionarInventario();
        asistenteEspecializada.monitorearProyecto();
        asistenteEspecializada.generarInformes();
    }
}
