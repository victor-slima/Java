package variaveis;
// armazenam informações ou dados
// precisa ter seu tipo declarado antes do nome da variavel.
// int num1;
public class Main {
    public static void main(String[] args) {
        // Variáveis são visíveis apenas em escopos.    
        // Declaração de variáveis:
        int hora;
        String nome;
        double salario;

        // Inicialização de variáveis:
        // faz de conta que as variaveis tem o mesmo nome.
        int horas = 12;
        String nomes = "Gabriel";
        double salarios = 1518.98;

        // Atribuição:
        horas = 13;
        nomes = "Victor";
        salarios = 3909.98;

        // Uso:
        System.out.println(horas);
        System.out.println(nomes);
        System.out.println(salarios);
    }
        
}
