import java.io.*;

public class Triangulo {

    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        float lado1;
        float lado2;
        float lado3;
        System.out.println("Ingrese un lado");
        lado1 = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Ingrese otro lado");
        lado2 = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Ingrese otro lado");
        lado3 = Integer.parseInt(bufEntrada.readLine());
        
        if(lado1==lado2&&lado2==lado3)
        {
            System.out.println("Es un traingulo equilatero");
        }
        else if(lado1==lado2||lado2==lado3||lado3==lado1)
        {
            System.out.println("Es un triangulo isosceles");
        }
        else
        {
            System.out.println("Es un triangulo escaleno");
        }
    }           
}
