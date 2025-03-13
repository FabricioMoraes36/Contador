import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = leitura.nextInt();
        try{
            if(numero1 > numero2){
throw new ParametrosInvalidosException();
            }
            for(int contador = numero1; contador <= numero2; contador++) {
                System.out.println("o intervalo entre os numeros é: " + contador);
            }
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro valor digitado deve ser maior do que o segundo valor!!");
        }
    }
}