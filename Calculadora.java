public class Calculadora {
    private String historial;
    private static int totalOperaciones = 0;

    public Calculadora() {
        this.historial = "";
    }

    public int sumar(int a, int b) {
        int resultado = a + b;
        historial += a + " + " + b + " = " + resultado + "\n";
        totalOperaciones++;
        return resultado;
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        historial += a + " + " + b + " = " + resultado + "\n";
        totalOperaciones++;
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        return sumar(a, b) + c;
    }

    public static int getTotalOperaciones() {
        return totalOperaciones;
    }

    public void mostrarHistorial() {
        System.out.println(historial);
    }
    
}