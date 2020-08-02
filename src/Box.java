public class Box {
	
	public int size = 0;
	
	public static void main(String[] args) {
		Box userBox = new Box();
		userBox.size = 5;
		userBox.printBox2();
	}
	
	public void printBox1() {
	
		for (int a = 0; a < this.size; a++) {
			String line = " ";
			for (int b = 0; b < this.size; b++) {
				line += "*";
			}
			System.out.println(line);
		}
	}
	
	public void printBox2() {
		
		for (int a = 0; a < this.size; a++) {
			String line = " ";
		for (char c = 0; c < this.size; c++) {
			line += "c";
		}
		System.out.println(line);
		}
	}
	
}