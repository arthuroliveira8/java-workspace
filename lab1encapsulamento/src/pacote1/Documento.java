package pacote1;

public class Documento {
	String nome;
	protected String data;
	
	public Documento(String nome, String data){
		this.nome = "Documento Qualquer";
		this.data = data;
	}
	
	public Documento(String data){
		this.data = data;
	}
	
	public void mostrar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Data: " + this.data);
	}
	
	public String getData() {
		return this.data;
	}
}
