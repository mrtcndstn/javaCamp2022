package java08ArraysDemo;

public class Main {

	public static void main(String[] args) {
		String ögrenci1="Engin";
		String ögrenci2="Derin";
		String ögrenci3="Salih";
		String ögrenci4="Ahmet";
		
		System.out.println(ögrenci1);
		System.out.println(ögrenci2);
		System.out.println(ögrenci3);
		System.out.println(ögrenci4);
		
	
		System.out.println("-------------------");
		
		
		String[] ögrenciler= new String[5];
		ögrenciler[0]="Engin";
		ögrenciler[1]="Derin";
		ögrenciler[2]="Salih";
	    ögrenciler[3]="Ahmet";
	    ögrenciler[4]="Ali";
		
		for(int i=0; i<ögrenciler.length;i++) {
			System.out.println(ögrenciler [i]);
		}
		
		
		System.out.println("-------------------");
		
		for(String ögrenci:ögrenciler) {
			System.out.println(ögrenci);
		}

	}

}
