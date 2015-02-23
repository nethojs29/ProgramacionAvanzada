import java.io.*;

public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        float base, altura, radio, area, opc;
        final double Pi=3.1415;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Programa para calcular el area de un rectangulo, un circulo o un triangulo\n\n");

        do {
            do {
                System.out.println("Escoge una figura:\n");
                System.out.println("1) Rectangulo  2) Circulo  3)Triangulo  4)Salir: ");
                opc = Float.parseFloat(in.readLine());

                if (opc < 1 || opc > 4) {
                    System.out.println("Valor incorrecto");
                }
            } while (opc < 1 || opc > 4);

            if (opc == 1) {

                do {
                    System.out.println("Cual es la base del rectangulo?: ");
                    base = Float.parseFloat(in.readLine());
                    if (base <= 0) {
                        System.out.println("Valor no valido\n\n");
                    }
                } while (base <= 0);

                do {
                    System.out.println("Cual es la altura del rectangulo?: ");
                    altura = Float.parseFloat(in.readLine());
                    if (altura <= 0) {
                        System.out.println("Valor no valido\n\n");
                    }
                } while (altura <= 0);

                area = base * altura;
                System.out.println("El area del rectangulo es " + area);
            } else if (opc == 2) {
                do {
                    System.out.println("Cual es el radio del circulo?: ");
                    radio = Float.parseFloat(in.readLine());
                    if (radio <= 0) {
                        System.out.println("Valor no valido\n\n");
                    }
                } while (radio <= 0);

                area = (float) (radio*radio*Pi);
                System.out.println("El area del circulo es "+area);
            }
            else if (opc==3){
                do{
			System.out.println("Cual es la base del triangulo?: ");
			base = Float.parseFloat(in.readLine());
			if (base<=0){
				System.out.println ("Valor no valido\n\n");
			}
			}while (base<=0);
			
			do{
                            System.out.println ("Cual es la altura del triangulo?: ");
                            altura = Float.parseFloat(in.readLine());
                            if (altura<=0){
                                    System.out.println ("Valor no valido\n\n");
                            }
			}while (altura<=0);
			
			area = base*altura/2;
			System.out.println ("El area del triangulo es "+area);
            }
        } while (opc != 4);
    }
}
