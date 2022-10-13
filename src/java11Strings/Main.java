package java11Strings;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : " +mesaj.length());
		System.out.println("5. eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("l"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		

	}

}

/**
 * .length() metodu ile String ifadelerin uzunluğunu öğrenebiliriz.
 * .charAt() metodu ile String ifadelerin belirli bir indeksindeki karakterini öğrenebiliriz.
 * .concat() metodu ile String ifadelerin sonuna yeni bir ifade ekleyebiliriz.
 * .startsWith() metodu ile String ifadelerin belirli bir ifade ile başlayıp başlamadığını öğrenebiliriz.
 * .endsWith() metodu ile String ifadelerin belirli bir ifade ile bitip bitmediğini öğrenebiliriz.
 * .getChars() metodu ile String ifadelerin belirli bir aralığını başka bir karakter dizisine kopyalayabiliriz.
 * .indexOf() metodu ile String ifadelerin belirli bir ifadenin ilk indeksini öğrenebiliriz.
 * .lastIndexOf() metodu ile String ifadelerin belirli bir ifadenin son indeksini öğrenebiliriz.
 * .replace() metodu ile String ifadelerin belirli bir ifadeyi başka bir ifade ile değiştirebiliriz.
 * .substring() metodu ile String ifadelerin belirli bir aralığını başka bir String ifadesine kopyalayabiliriz.
 * .split() metodu ile String ifadeleri belirli bir ifadeye göre parçalayabiliriz.
 * .toLowerCase() metodu ile String ifadelerin tüm karakterlerini küçük harfe çevirebiliriz.
 * .toUpperCase() metodu ile String ifadelerin tüm karakterlerini büyük harfe çevirebiliriz.
 * .trim() metodu ile String ifadelerin başındaki ve sonundaki boşlukları kaldırabiliriz.
 */