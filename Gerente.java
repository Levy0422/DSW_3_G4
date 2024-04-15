//Clase para gerente
public class Gerente{
    private String nombre = "Pedro";
    private int ID = 1;
    private String departamento = "Gerencia";
    private double salarioBase = 99.99;
    private boolean tiempoCompleto = true;
    private String apellido = "Rodriguez";
    private String cedula = "4-444-444";
    private int telefono = 6667777;

    /*te traje las variables[propiedades] que pone el archivo
    si no lo ves necesario, lo puedes quitar*/

    public void calcularSalario(){
        //la logica para el salario i guess
        System.out.println("Calculando el salario para: " + nombre);
    }

    public void asignarTarea(){
        System.out.println("Asignando tareas para el departamento de: " + departamento);
    }

    public void gestionarEquipos(){
        System.out.println("Gestionando equipos...");
    }

    public void realizarInforme(){
        System.out.println("Realizando el informe a nombre de " + nombre + " " + apellido);
    }

    public static class GerenteExtra extends Gerente{
        public void organizarJuntas(){
            System.out.println("Organizando las juntas pertinentes a...");
        }

        public void tomaDeciciones(){
            System.out.println("Tomando las deciciones en base a...");
        }

        public void gestionRecursosEconomicos(){
            System.out.println("Gestionando los recursos...");
        }
    }
}