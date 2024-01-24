public class Main {
    public static void main(String[] args) {
        String nome = "Mundo";
        int idade = 52;

        String mensagem = """
                Olá,
                Bem-vindo ao meu programa!
                Meu nome é %s e tenho %d anos.
                """.formatted(nome, idade);


        System.out.println(mensagem);

        double x = 123.128;
        System.out.printf( "%.2f", x );
    }
}