package java06SwitchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
			System.out.println("Mükemmel : Geçtiniz");
			break;
		
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fenal Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
			
			default:
				System.out.println("Geçersiz Not Girdiniz");
		}
		
		/**
		 switch (değişken) {
		    case değer1:
		          // kodlar
		          break;
		    case değer2:
		           //kodlar
		           break;
		    default:
		          //kodlar
		   */
		
		

	}

}
