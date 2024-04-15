//clase analista de datos
public class AnalistaDatos{
    private String nombre = "Kanye";
    private int ID = 3;
    private double salarioBase = 69.99;
    private int horasTrabajadas = 8;
    private boolean medioTiempo = true;
    private String apellido = "West";
    private String cedula = "4-666-555";
    private int telefono = 6669999;  

    public void calcularSalario(){
        System.out.println("Calculando el salario para: " + nombre);
    }

    public void analizarDatos(){
        System.out.println("Analizando los datos...");
    }

    public void generarInformeAnalisis(){
        System.out.println("Realizando los informes del analizis de datos...");
    }

    public void desarrollarModelosPredictivos(){
        System.out.println("Desarrollando modelos predictivos...");
    }

    public class AnalistaExtra extends AnalistaDatos{
        public void recopilarDatos(){
            System.out.println("Recopilando datos...");
        }

        public void optimizarProcesos(){
            System.out.println("Realizando la optimizacion de procesos de la empresa");
        }

        public void deteccionFraudes(){
            System.out.println("Detectando posibles fraudes...");
        }
    }
}
