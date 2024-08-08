package pacote1;

public class Carta extends Documento{
	String anexo;
	
	public Carta(String nome, String data, String anexo) {
		super(nome, data);
		this.anexo = anexo;
	}
	
	public void mostrar() {
		System.out.println("--- Carta ---");
		super.mostrar();
		System.out.println(this.anexo);
	}
}
