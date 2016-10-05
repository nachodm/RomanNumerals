public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int number = 0;
		
		int[] array;
 		array = new int[romanNum.length()];
		
		for (int i = 0; i < romanNum.length(); i++) {
			String aux = romanNum.substring(i, i + 1);
			if (aux.equals("I")) {
				array[i] = 1;
			}
			else if (aux.equals("V")) {
				array[i] = 5;
			}
			else if (aux.equals("X")) {
				array[i] = 10;
			}
			else if (aux.equals("L")) {
				array[i] = 50;
			}
			else if (aux.equals("C")) {
				array[i] = 100;
			}
			else if (aux.equals("D")) {
				array[i] = 500;
			}
			else if (aux.equals("M")) {
				array[i] = 1000;
			}
		}
		int counter = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			if (counter <= 0) {
				if ((i == romanNum.length() - 1) || (array[i] > array[i + 1])) {
					number = number + array[i];
				}
				else if (array[i] == array [i + 1]){
					if (i + 1 == romanNum.length() - 1) {
						number = number + array[i] * 2;
						counter = 3;
					}
					else if (array[i + 1] == array [i + 2]) {
						if (i + 2 == romanNum.length() - 1) {
							number = number + array[i] * 3;
							counter = 3;
						}
						else {
							number = number + array[i + 3] - array[i] * 3;
							counter = 4;
						}
					}
					else if (array[i+2] < array[i+1]) {
						number = number + array[i] * 2;
						counter = 2;
					}
					else{
						number = number + array[i + 2] - array[i] * 2;
						counter = 3;
					}
				}
				else {
					number = number + array[i + 1] - array[i];
					counter = 2;
				}
			}
			counter--;
		}
		return number;
	}
}
	
