
public class TesteEli {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		
		matriz[0][4] = 1;
		matriz[1][4] = 1;
		matriz[2][4] = 1;
		matriz[3][4] = 1;
		matriz[4][4] = 1;
		matriz[5][4] = 1;
		matriz[6][4] = 1;
		matriz[7][4] = 1;
		matriz[8][4] = 1;
		matriz[9][4] = 1;
		
		
		matriz[4][0] = 1;
		matriz[4][1] = 1;
		matriz[4][2] = 1;
		matriz[4][3] = 1;
		matriz[4][4] = 1;
		matriz[4][5] = 1;
		matriz[4][6] = 1;
		matriz[4][7] = 1;
		matriz[4][8] = 1;
		matriz[4][9] = 1;
		
		matriz[0][0] = 1;
		matriz[1][1] = 1;
		matriz[2][2] = 1;
		matriz[3][3] = 1;
		matriz[4][4] = 1;
		matriz[5][5] = 1;
		matriz[6][6] = 1;
		matriz[7][7] = 1;
		matriz[8][8] = 1;
		matriz[9][9] = 1;
		
		matriz[0][9] = 1;
		matriz[1][7] = 1;
		matriz[2][7] = 1;
		matriz[3][6] = 1;
//		matriz[4][5] = 1;
//		matriz[5][4] = 1;
//		matriz[4][3] = 1;
//		matriz[3][2] = 1;
//		matriz[2][1] = 1;
//		matriz[1][0] = 1;
		
		
		
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++)
			System.out.print(matriz[i][j]+" ");
			System.out.println();
		}
		
		

	}

}
