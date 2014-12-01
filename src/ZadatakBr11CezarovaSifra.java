
public class ZadatakBr11CezarovaSifra {
/*
 * Ispisuje cezarou sifru za unesenu recenicu.
 */
	public static void main(String[] args) {
		System.out.println("Upisi recenicu: ");
		String recenica = TextIO.getln();
		
//		char [] abeceda = {'a','b', 'c', 'è', 'æ', 'd', 'ð', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 'š', 't', 'u', 'v', 'z', 'ž'};
		char[] recenicaNiz = recenica.toCharArray();
		char [] novaRecenica = new char [recenicaNiz.length];
		char pomak = 3;
		//zadnja 3 slova iz abecede nece vratiti zeljenu vrijednost
		for ( int i = 0; i<recenica.length();  i++){
			novaRecenica[i] =(char)((recenicaNiz[i] + pomak));
		}
		
		System.out.println(novaRecenica);
	}
	

}
