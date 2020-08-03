import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hauptmethode {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Bitte ein Typ auswählen");
		System.out.println("1-Integer");
		System.out.println("2-String");
		System.out.println("3-Double");
		
		int s=Integer.parseInt(einlesen.readLine());
		
		if(s==1) {
		
		Liste<Integer>inListe=new Liste<Integer>(); 
		
		
		
		System.out.println("Eine IntegerListe");
		
		inListe.einfugen(10);
		inListe.einfugen(20);
		inListe.einfugen(30);
		
		System.out.println("Anzahl Elemente : "+ inListe.getAnzahl());
		
		inListe.anzeigen();
		
		System.out.println();
		System.out.println("löschen von Elment 2 ...........");
		
		inListe.loachen(1);
		
		System.out.println("Anzahl Elemente :  "+inListe.getAnzahl());
	  inListe.anzeigen();
	  System.out.println();
		
		
		}
		if(s==2) {
			
			
			Liste<String>inListe=new Liste<String>(); 
			
			
			
			System.out.println("Eine IntegerListe");
			
			inListe.einfugen("Bassel");
			inListe.einfugen("Marcel");
			inListe.einfugen("Fadi");
			
			System.out.println("Anzahl Elemente : "+ inListe.getAnzahl());
			
			inListe.anzeigen();
			
			System.out.println();
			System.out.println("löschen von Elment 2 ...........");
			
			inListe.loachen(1);
			
			System.out.println("Anzahl Elemente :  "+inListe.getAnzahl());
		  inListe.anzeigen();
		  System.out.println();
			
			
			
			
			
		}
if(s==3) {
			
			
			Liste<Double>inListe=new Liste<Double>(); 
			
			
			
			System.out.println("Eine IntegerListe");
			
			inListe.einfugen(6.5);
			inListe.einfugen(64.4);
			inListe.einfugen(555.1);
			
			System.out.println("Anzahl Elemente : "+ inListe.getAnzahl());
			
			inListe.anzeigen();
			
			System.out.println();
			System.out.println("löschen von Elment 2 ...........");
			
			inListe.loachen(1);
			
			System.out.println("Anzahl Elemente :  "+inListe.getAnzahl());
		  inListe.anzeigen();
		  System.out.println();
			
			
			
			
			
		}
	}

}
