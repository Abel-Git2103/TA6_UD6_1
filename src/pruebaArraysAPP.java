import java.util.Scanner;

public class pruebaArraysAPP {
	
    public static void main(String[] args) {
    	
        String valor;
        Scanner eleccionFigura = new Scanner(System.in);
        System.out.println("Selecciona una figura: circulo, cuadrado o triangulo");
        valor = eleccionFigura.nextLine();

        switch(valor) {
        	
        case "circulo":
        	System.out.println("Introduce el radio:");
        	String valorRadio = eleccionFigura.nextLine();
        	int radio = Integer.parseInt(valorRadio);
        	areaCirculo(radio);
        	break;
        case "cuadrado":
        	System.out.println("Introduce la medida de un lado:");
        	String valorLado = eleccionFigura.nextLine();
        	int lado = Integer.parseInt(valorLado);
        	areaCuadrado(lado);
        	break;
        case "triangulo":
        	System.out.println("Introduce la base:");
        	String valorBase = eleccionFigura.nextLine();
        	int base = Integer.parseInt(valorBase);
        	System.out.println("Introduce la altura:");
        	String valorAltura = eleccionFigura.nextLine();
        	int altura = Integer.parseInt(valorAltura);
        	areaTriangulo(base, altura);
        	break; 
        default:
        	System.out.println("No has seleccionado una figura correcta");
        } 
        
        eleccionFigura.close();    
               	
    }

    public static void areaCirculo(double radio) {
    	
    	double resultadoCirculo;
    	
    	resultadoCirculo = Math.PI*Math.pow(radio, 2);
    	System.out.println("El area del circulo es " + resultadoCirculo);
    	
    }
    
    public static void areaCuadrado(double lado) {
    	
    	double resultadoCirculo;
    	
    	resultadoCirculo = lado * lado;
    	System.out.println("El area del cuadrado es " + resultadoCirculo);
    
    }
    public static void areaTriangulo(double base, double altura) {
    	
    	double resultadoTriangulo;
    	
    	resultadoTriangulo = base * altura/2;
    	System.out.println("El area del triangulo es " + resultadoTriangulo);
    
    }   	
}
