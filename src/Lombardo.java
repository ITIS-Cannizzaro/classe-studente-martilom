import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Lombardo
{
	public static void main(String[] args) {
		Studente A=new Studente();
		Studente B=new Studente("Paolo",2006);
		B.getDati(null, 0);
		B.Print();
		A.Print();
		int a=A.getAnno();
		int b=B.getAnno();
		String an=A.getNome();
		String bn=B.getNome();
		int anni;
		if (a==b){
			System.out.println("Gli studenti "+an+" e "+bn+" sono coetanei");
		}
		else if (a<b) {
			anni=b-a;
			System.out.println(bn+" è più piccolo di "+an+" di "+anni+" Anni");
		}
		else if (a>b) {
			anni=a-b;
			System.out.println(an+" è più piccolo di "+bn+" di "+anni+" Anni");
		}
		
	}

}