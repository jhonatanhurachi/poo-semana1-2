public class Estudiante {
    // Atributos
    private String nombre;
    private int codigo;
    private double nota;

    // Variable Static: compartida por todos los objetos
    private static int totalEstudiantes = 0;

    // Constructor
    public Estudiante() { }

    public Estudiante(String nombre, int codigo, double nota) {
        setNombre(nombre);
        setCodigo(codigo);
        setNota(nota);
        totalEstudiantes++;
    }
 
    // Getters
    public String getNombre() { return nombre; }
    public double getNota()   { return nota; }
    public int getCodigo()   { return codigo; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setNota(double nota) { this.nota = nota; }

    // Métodos
    public void mostrarInfo() { System.out.println("Estudiante: " + nombre + " | Nota: " + nota); }

    // Método static
    public static int getTotalEstudiantes() { return totalEstudiantes; }
}
