import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite quatro notas!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite o segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite o terceira nota: ");
        int nota3 = sc.nextInt();
        System.out.print("Digite o quarta nota: ");
        int nota4 = sc.nextInt();

        float media  = (float) (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7 ){
            System.out.println("Aprovado com media de : " + media);
        }
        else if (media >= 5 && media < 7){
            System.out.println("Recuperação com media de :" + media);
        }
        else{
            System.out.println("reprovado com media de : "+ media);
        }

        sc.close();
    }
}
