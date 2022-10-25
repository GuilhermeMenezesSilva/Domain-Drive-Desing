public class Smarthphone extends Produto{
    private String marca;
    private String modelo;

    public Smarthphone(String descricao, int preco, String marca, String modelo) {
		super(descricao, preco);
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Smarthphone [marca=" + marca + ", modelo=" + modelo + ", getDescricao()=" + getDescricao()
				+ ", getPreco()=" + getPreco() + "]";
	}

}
