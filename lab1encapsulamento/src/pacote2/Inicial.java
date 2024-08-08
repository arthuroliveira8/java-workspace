package pacote2;
import pacote1.Carta;

public class Inicial {
	public static void main(String[] args) {
		Carta Car2 = new Carta("Rogério", "19/05/1987", "Rogérioo");
		Car2.mostrar(); //RESPOSTA 12:
		//é necessário fazer o import da classe Carta, pois ela está em um pacote diferente do pacote atual.
	}
}
//RESPOSTA DA 10:
//O erro ocorre pois o atributo "data" está com a visibilidade protected.
//Apenas classes que herdam Carta podem acessar este atributo.
//Podemos solucionar isso criando um método getdata na classe Documento.