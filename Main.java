import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do aluno: " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(notas);

        System.out.println("A média da tuma é: " + media);
        System.out.println("Alunos com nota acima da média: ");

        for(int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                System.out.println("Aluno: " + (i + 1) + ", Nota: " + notas[i]);
            }
        }

        scanner.close();
    }

    public static double calcularMedia(double[] notas){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
    
        return soma / notas.length;
    }
}
