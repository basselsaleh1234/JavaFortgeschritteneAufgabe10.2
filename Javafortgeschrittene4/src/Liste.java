import java.util.ArrayList;

public class Liste<T> {

	ArrayList<T>werte=new ArrayList();
	

	private int  anzahl;
	
	
	
	ArrayList<T> array=new ArrayList<T>();
	
	
	
	
	public Liste() {
		
	}
	
	
	
	public void  einfugen(T zahl)
	{

		werte.add(zahl);
		anzahl+=1;
	}	
	
	public void loachen(int index) {
	
		werte.remove(index);
	anzahl-=1;
	}
	
	public void anzeigen() {
		
		
		for(T t:werte) {  System.out.println(t);}
		
		
		
		
	}
	
	public int getAnzahl() {
		
		
		return anzahl;
		
		
	}
	
	}


