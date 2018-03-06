package br.com.projuris;

/*
 * Demonstração:
	[4,9,3,7,8] e [3,7] deve retornar 2.
	[1,3,5] e [1] deve retornar 0.
	[7,8,9] e [8,9,10] deve retornar -1.
	[4,9,3,7,8,3,7,1] e [3,7] deve retornar 5.

	Implemented by Alvaro Luiz Martins Scheid
 */
public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {
		int positionOfLastMatchedElement = -1;
		int positionOfFirstMatchedElement = 0;
		boolean verified = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == subArray[0]) {
				positionOfFirstMatchedElement = i;
				if (subArray.length == 1) {
					verified = true;
				} else {
					for (int k = 1; k < subArray.length;) {
						if (array[++i] == subArray[k]) {
							if(i+1 == array.length) {
								verified = false;
								k = subArray.length;
							}
							else
								verified = true;
							k++;
						} else {
							verified = false;
							k = subArray.length;
						}
					}
				}
			}
		}
		if (verified)
			positionOfLastMatchedElement = positionOfFirstMatchedElement;
		System.out.println(positionOfLastMatchedElement);
		return positionOfLastMatchedElement;
	}

}
