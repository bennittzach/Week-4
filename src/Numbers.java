class Numbers {

	public static void printNumbers(int array[], int x) {
		int inc, a, b;
		for (a = 0; a < x; a++) {
			inc = array[a];
			for (b = a + 1; b < x; b++) {
				if ( array[a] < array[b]) {
					inc = array[b];
					break;
				} else {
					System.out.println(array[a] + " : " + inc);
					break;
				}
			}
		System.out.println(array[a] + " : " + inc);	
		}
	}
	
	
	public static void main(String[] args) {
		int array[] = {5, 12, 24, 39, 45, 64};
		int x = array.length;
		printNumbers(array, x);
	}

}