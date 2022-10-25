public class App {
    public static void main(String[] args) {

		Livro livro = new Livro("Livro de java", 30, "João");
		System.out.println(livro);
		
		Livro livro2 = new Livro("Livro de Python", 1500, "Fernanda");
		System.out.println(livro2);

		Smarthphone smarthphone = new Smarthphone("", 44000, "XS 256G", "Iphone X");
		System.out.println(smarthphone);
	}
}
