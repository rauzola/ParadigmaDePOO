import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.aumentar();
        contador.exibirValor(); // Valor do contador: 1

        contador.diminuir();
        contador.exibirValor(); // Valor do contador: 0

        contador.diminuir(); // Não irá diminuir pois já está em 0
        contador.exibirValor(); // Valor do contador: 0

        contador.zerar();
        contador.exibirValor(); // Valor do contador: 0

        // Exercício 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (numero > 100) {
            System.out.println("O número digitado é maior que 100.");
        } else if (numero < 100) {
            System.out.println("O número digitado é menor que 100.");
        } else {
            System.out.println("O número digitado é igual a 100.");
        }

        scanner.close();

        // Exercício 5

        // Exemplo de uso do for para imprimir os números de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Exemplo de uso do do-while para imprimir os números de 1 a 4
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 4);


        // Exemplo de uso do while para imprimir os números de 1 a 3
        int j = 1;
        while (j <= 3) {
            System.out.println(j);
            j++;
        }

        // Exercício 6

        // Em Java, herança é um conceito fundamental da programação orientada a objetos que permite que uma classe
        // (conhecida como subclasse ou classe filha) herde características e comportamentos de outra classe
        // (conhecida como superclasse ou classe pai). A subclasse herda os campos e métodos da superclasse e pode
        // adicionar seus próprios campos e métodos, além de sobrescrever ou estender os métodos da superclasse
        // conforme necessário.

        // Em termos simples, herança em Java permite a criação de uma hierarquia de classes, onde classes mais
        // específicas (subclasses) podem herdar atributos e comportamentos de classes mais genéricas (superclasses),
        // promovendo reutilização de código e facilitando a organização e manutenção do sistema.

        // Alguns dos benefícios da utilização da herança em Java incluem:

        // Reutilização de código: Classes filhas podem herdar os membros (campos e métodos) da classe pai, permitindo
        // que o código seja reutilizado em diferentes partes do programa.

        // Extensibilidade: Classes filhas podem adicionar novos membros ou comportamentos específicos sem
        // modificar a classe pai, estendendo assim a funcionalidade existente.

        // Manutenção simplificada: Mudanças feitas na classe pai são automaticamente refletidas em todas as suas subclasses.
        // Isso facilita a manutenção do código, uma vez que as alterações precisam ser feitas em um único lugar.

        // Polimorfismo: Herança permite o uso de polimorfismo, que é a capacidade de se referir a objetos de
        // subclasses usando referências de superclasse. Isso permite maior flexibilidade no design do código e
        // facilita a implementação de padrões de projeto como Strategy, Factory Method, entre outros.

    }
}
