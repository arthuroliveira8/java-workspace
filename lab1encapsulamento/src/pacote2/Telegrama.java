package pacote2;
import pacote1.Documento;
import pacote1.Carta;

public class Telegrama extends Documento{
	private String assinatura;
	
	public Telegrama(String nome, String data, String assinatura) {
		super(nome, data);
		this.assinatura = assinatura;
	}
	
	public void mostrar() {
		System.out.println("--- Telegrama ---");
		super.mostrar();
		System.out.println(this.assinatura);
	}
	
	public void mostrar2() {
		Carta Car1 = new Carta("Alex", "02/07/2022", "Alexx");
		Telegrama Tel1 = new Telegrama("Carlos", "25/06/2010", "Carloss");
		System.out.println(Car1.getData()); //O erro ocorre pois o atributo "data" está com a visibilidade protected.
		//Apenas classes que herdam Carta podem acessar este atributo.
		//Podemos solucionar isso criando um método getdata na classe Documento.
		System.out.println(Tel1.data);
	}
}
