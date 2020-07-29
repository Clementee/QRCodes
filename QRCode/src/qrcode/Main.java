package qrcode;

public class Main {

	public static final String INPUT = "hello";

	/*
	 * Parameters
	 */
	public static final int VERSION = 1;
	public static final int MASK = 2;
	public static final int SCALING = 15;

	public static void main(String[] args) {

		/*
		 * Encoding
		 */
		boolean[] encodedData = DataEncoding.byteModeEncoding(INPUT, VERSION);
		
		/*
		 * image
		 */
		int[][] qrCode = MatrixConstruction.renderQRCodeMatrix(VERSION, encodedData,MASK);
		//int[][] qrCode = MatrixConstruction.renderQRCodeMatrix(VERSION, encodedData);


		/*
		 * Visualization
		 */
		Helpers.show(qrCode, SCALING);
	}
}
