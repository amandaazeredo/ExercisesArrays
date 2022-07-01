public class ThreeDimensional {

	public static void main(String[] args) {
		
		int [][][] threeDimensional = new int [3][3][3];
		
		for (int i = 0; i<threeDimensional.length; i++) {
			for (int j = 0; j<threeDimensional[i].length; j++) {
				for (int k = 0; k<threeDimensional[i][j].length; k++) {
					threeDimensional[i][j][k] = i + j + k;
				}
			}
		}
		int add = 0;
		int addeven = 0;
		int addodd = 0;
		for (int i = 0; i<threeDimensional.length; i++) {
			for (int j = 0; j<threeDimensional[i].length; j++) {
				for (int k = 0; k<threeDimensional[i][j].length; k++) {
					add += threeDimensional[i][j][k];
					
					if (threeDimensional[i][j][k] %2==0) {
						addeven += threeDimensional[i][j][k];
					} else {
							addodd += threeDimensional[i][j][k];
						}
				}
			}
		}
		
		System.out.println("Total sum: " + add);
		System.out.println("Total sum even: " + addeven);
		System.out.println("Total sum odd: " + addodd);

	}

}