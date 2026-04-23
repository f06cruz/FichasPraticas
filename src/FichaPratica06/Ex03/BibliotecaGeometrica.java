package FichaPratica06.Ex03;

public class BibliotecaGeometrica {

    //área = lado × lado
    public static double areaQuadrado(double lado){
        return lado*lado;
    }

    //perímetro = 4 × lado
    public static double perimetroQuadrado(double lado){
        return 4*lado;
    }

    //área = base × altura
    public static double areaRetangulo(double base, double altura){
        return base*altura;
    }

    //perímetro = 2 × (base + altura)
    public static double perimetroRetangulo(double base, double altura){
        return 2*(base+altura);
    }

    //área = π × raio²
    public static double areaCirculo(double raio){
        return 3.14*(raio*raio);
    }

    //circunferência = 2 × π × raio
    public static double circunferencia(double raio){
        return 2*3.14*raio;
    }

    //área = (base × altura) / 2
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }




}
