package teste;

import java.util.ArrayList;
import java.util.List;

public class a {
	
	private int n = 7;
	
	private List<Integer> list;
	
	
	public ArrayList<Integer> retornaPrimosMenoresRecursivo(Integer n,  List<Integer> list) throws Exception {
		//if(n<1) {

			boolean primo = true;


			if (n == 1)
				primo = false;

			if (primo) {
				if ((n % 2 == 0) && (n != 2)) {
					primo = false;
				}
			}
			if (primo) {
				if (n <= (n / Math.sqrt(n))) {
					primo = false;

				}
			}
			if (primo)
				list.add(n);
				System.out.print(list);
					if(n>1) {
						return retornaPrimosMenoresRecursivo(n - 1, list);
					}throw new Exception();
						
		//}
		//throw new Exception("Digite um número inteiro maior que 1");

	}

}
