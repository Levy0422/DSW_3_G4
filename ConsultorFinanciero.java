class ConsultorFinanciero {
    private String nombre;
    private int id;
    private double salarioBase;
    private int horasTrabajadas;
    private boolean medioTiempo;
    public double calcularSalario() {
    double salarioTotal;
    if (medioTiempo) {
     salarioTotal = salarioBase * horasTrabajadas / 2;
    } else {
     salarioTotal = salarioBase * horasTrabajadas;
    }
    return salarioTotal;
    }
    public void asesorarClientes() {
     System.out.println("Asesorando a clientes en cuestiones financieras...");
    }
    public void realizarAnalisisMercado() {
     System.out.println("Realizando análisis de mercado y tendencias financieras...");
    }
    public void prepararInformesEconomicos() {
     System.out.println("Preparando informes económicos y recomendaciones de inversión...");
    }
    // clase hija
    public class ConsultorFinancieroO extends ConsultorFinanciero{
    public void realizarPlanificacionFinanciera() {
     System.out.println("Ayudando a los clientes a desarrollar planes financieros personalizados...");
    }
    public void conducirEvaluacionesRiesgo() {
     System.out.println("Evaluando el riesgo financiero asociado con diferentes inversiones y estrategias...");
    }
    public void brindarCapacitacionFinanciera() {
     System.out.println("Ofreciendo capacitación y educación financiera a individuos y grupos...");
    }
    }
    }