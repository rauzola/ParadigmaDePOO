public class Contador {
    private int numero;

    // Método para incrementar o valor da variável numero em 1, com limite de 10
    public void aumentar() {
        if (numero < 10) {
            numero++;
        }
    }

    // Método para decrementar o valor da variável numero em 1, com limite de -1
    public void diminuir() {
        if (numero > -1) {
            numero--;
        }
    }

    // Método para reiniciar a variável numero
    public void zerar() {
        numero = 0;
    }

    // Método para exibir o valor armazenado na variável numero
    public void exibirValor() {
        System.out.println("Valor do contador: " + numero);
    }
}
