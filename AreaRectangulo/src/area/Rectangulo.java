package area;

public class Rectangulo {

    //Variables
    private int base, altura, area;

    //Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //mMetodos
    public void CalculoArea() {
        area = base * altura;
    }

    public void Imprimir() {
        CalculoArea();
        System.out.println("El area es: " + area);
    }
}
