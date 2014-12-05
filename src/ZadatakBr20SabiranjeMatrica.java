
public class ZadatakBr20SabiranjeMatrica {
public static void main(String[] args) {
	
	System.out.println("Unesi velicinu prve matrice x i y : ");
	int xM1 = TextIO.getlnInt();
	int yM1 = TextIO.getlnInt();
	
	int [][] prvaMatrica = upisiMatricu(xM1,yM1);
	ispisiMatricu(prvaMatrica);
	
	System. out.println("Unesi velicinu druge matrice x i y : ");
	int xM2 = TextIO.getlnInt();
	int yM2 = TextIO.getlnInt();
	
	int [][] drugaMatrica = upisiMatricu(xM2,yM2);
	ispisiMatricu(drugaMatrica);
}

public static int [][] upisiMatricu ( int x,int y ){
	int [][]  matrica = new int [x][y];
	 for ( int i = 0; i < matrica.length ; i++  ){
		 for ( int j = 0; j < matrica[i].length ; j++  ){
			 System.out.println("Unesi brojeve u matricu: ");
			 matrica [i][j] = TextIO.getlnInt();
		 }
	 }
	
	return matrica;
}

public static void ispisiMatricu(int [][] matrica){
	 for ( int i = 0; i < matrica.length ; i++  ){
		 for ( int j = 0; j < matrica[i].length ; j++  ){
			 System.out.print( matrica [i][j] + " ");		 
		 } System.out.println();
	 }
}
}
