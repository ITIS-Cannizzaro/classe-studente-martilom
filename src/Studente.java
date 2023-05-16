import java.util.Scanner;
public class Studente {
	Scanner scan=new Scanner(System.in);
	 String Nome;
	 int Anno;
	
	public Studente(String Nome, int Anno) {
		this.Nome=Nome;
		this.Anno=Anno;
	}
	
	public Studente() {
		Nome="Paolo";
		Anno=2006;
	}
	
	public void Print() {
		System.out.println("Nome: "+Nome+", di anno "+Anno);
	}
	
	public void getDati(String Nome, int Anno) {
		System.out.println("Inserire Nome Studente");
		Nome=scan.nextLine();
		this.Nome=Nome;
		System.out.println("Inserire Anno di Nascita dello Studente");
		Anno=scan.nextInt();
		this.Anno=Anno;
	}

	public int getAnno() {
		return Anno;
	}

	public void setAnno(int anno) {
		Anno = anno;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome=nome;
	}
}