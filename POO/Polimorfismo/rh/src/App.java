public class App {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro(0005, "Joao", 2000, "comercial", 123);
        System.out.println(engenheiro);

        Gerente gerente = new Gerente("Vitor", 10, 8000, "Desenvolvedor", 10);
        System.out.println(gerente);

        Presidente presidente = new Presidente("Luisa", 2234, 3000, 55);
        System.out.println(presidente);
    }
}
