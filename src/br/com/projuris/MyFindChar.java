package br.com.projuris;


/*
 * Demonstração:
 * 	“stress” – deve retornar “t”.
 *“reembolsar” – deve retornar “m”.
 *
 * Implemented by Alvaro Luiz Martins Scheid
 */
public class MyFindChar implements FindCharachter{

	@Override
	public char findChar(String word) {
		for(int i = 0; i < word.length(); i++) {
			boolean isRepeating = false;
			for(int k = 0; k < word.length(); k++) {
				if(word.charAt(i) == word.charAt(k) && i != k) {
					isRepeating = true;
				}
			}
			if(!isRepeating)
				return word.charAt(i);
		}
		return ' ';
	}

}
