package reedsolomon;

public final class ErrorCorrectionEncoding {
	
	
	
	
	
	
	
	private static final int[] ANTILOG_TABLE = antilogTableGenerator();
	private static final int[] LOG_TABLE = logTableGenerator();
	
	private static final int[] antilogTableGenerator() {
		int[] table = new int[256];
		int n = 1;
		for(int i=0;i<256;i++) {

			if(table[n]==0) {
				table[n]= i;
			}
			
			n*=2;
			if(n>255) {
				n= n^285;
			}
		}
		
		table[0] = -1;
		return table;
	}
	
	
	
	
	private static int[] logTableGenerator() {
		int[] table = new int[256];
		int n = 1;
		for(int i=0;i<256;i++) {
			table[i] = n;
			n*=2;
			if(n>255) {
				n= n^285;
			}
		}
		
		
		return table;
	}
