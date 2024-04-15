class DiseñadorGrafico {
    private String nombre ;;
    private int id;
    private double salarioBase;
    private int horasTrabajadas;
    private boolean medioTiempo;
    private String apellido;
    private String cedula;
    private String telefono;
    public double calcularSalario() {
    double salarioTotal;
    if (medioTiempo) {
     salarioTotal = salarioBase * horasTrabajadas / 2;
    } else {
     salarioTotal = salarioBase * horasTrabajadas;
    }
    return salarioTotal;
    }
    public void diseñarMaterialVisual() {
     System.out.println("Diseñando logotipos, gráficos y materiales visuales...");
    }
    public void colaborarProyectosCreativos() {
     System.out.println("Colaborando en proyectos creativos con otros departamentos...");
    }
    public void presentarPropuestas() {
     System.out.println("Presentando propuestas de diseño a clientes o superiores...");
    }
    public class DiseñadorGraficoO extends DiseñadorGrafico{
    public void manejoRedesSociales() {
     System.out.println("Manejando redes sociales...");
    }
    public void fotografia() {
     System.out.println("Tomando fotografías...");
    }
    public void desarrolloPaginasWeb() {
     System.out.println("Desarrollando páginas web...");
    }
    }
    }