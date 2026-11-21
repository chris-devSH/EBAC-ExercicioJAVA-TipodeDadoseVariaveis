// Crie um algoritmo Java que exiba uma mensagem de boas-vindas ao usuário no console.
//Em seguida, peça ao usuário que informe: nome completo, CPF, idade, peso, altura e estado civil.
//Receba cada um desses dados, atento ao tipo de variável correto para cada um (texto, número inteiro, número decimal) e à sintaxe de leitura correspondente.
//Exiba cada dado recebido no console, de acordo com a descrição do exercício.
//Suba o código para um repositório no GitHub e compartilhe o link no campo de entrega.

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

            System.out.println("Seja bem-vindo ao nosso centro de atendimento ao cliente");
            System.out.println("Sua saúde é nossa prioridade!");
            System.out.println("Para que possamos iniciar sua avaliação, iremos coletar algumas informações e realizar seu cadastro em nosso sistema.");

            System.out.println("Por favor, digite seu nome completo:");
                String name = scanner.nextLine();

            System.out.println("Agora, digite seu CPF:");
                String CPF = scanner.nextLine();

            System.out.println("Digite sua idade:");
                int age = scanner.nextInt();

            System.out.println("Digite seu peso (utilizar a virgula como separador, exemplo 75,4):");
                double weight = scanner.nextDouble();

            System.out.println("Digite sua altura (utilizar a virgula como separador, exemplo 1,93):");
                double height = scanner.nextDouble();
                scanner.nextLine();

            System.out.println("Qual seu estado civil:");
                String civilStatus = scanner.nextLine();

        scanner.close();

        System.out.println("Agradecemos o envio das informações, seus dados já estão sendo cadastrados em sistema. Orientamos que aguarde o contato de um dos nossos atendentes em até 24 horas, será repassado uma lista de instruções que melhor se adequa a sua saúde atual e o objetivo que deseja alcançar.");
        System.out.println("Segue resumo das informações fornecidas:");
        System.out.println("Nome: " + name + "\n" + "CPF: " + CPF + "\n" + "Idade: " + age + "\n" + "Peso: " + weight + "\n" + "Altura: " + height + "\n" + "Estado civil: " + civilStatus );

    }
}