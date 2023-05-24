package teste;

import java.util.ArrayList;
import java.util.List;

public class Funcoes {

	public static Integer retornaFibonacciEquivalenteLinear(Integer n) throws Exception {

		if (n >= 0) {
			if (n < 2)
				return n;

			Integer i, F = 0, F1 = 1, F2 = 1;
			for (i = 3; i <= n; i++) {
				F = F1 + F2;
				F1 = F2;
				F2 = F;
			}

			return (F);

		}
		throw new Exception("Digite um número positivo ou zero");

	}

	public static Integer retornaFibocciEquivalenteRecursivo(Integer n) throws Exception {

		if (n >= 0) {
			if (n < 2) {
				return n;
			}
			return retornaFibocciEquivalenteRecursivo(n - 1) + retornaFibocciEquivalenteRecursivo(n - 2);
		}
		throw new Exception("Digite um número positivo ou zero");

	}

	public static ArrayList<Integer> retornaPrimosMenoresLinear(Integer n) throws Exception {

		if (n > 1) {

			Integer valorInicial = 1;

			Integer valorFinal = n;

			Integer i;

			Integer j;

			boolean primo;

			ArrayList<Integer> list = new ArrayList<>();

			for (i = valorInicial; i <= valorFinal; i++) {

				primo = true;
				if (i == 1)
					primo = false;

				if (primo) {
					if ((i % 2 == 0) && (i != 2)) {
						primo = false;
					}
				}
				if (primo) {
					for (j = 3; j <= (i / 2); j++) {
						if (i % j == 0) {
							primo = false;
							break;
						}
					}
				}

				if (primo)
					list.add(i);

			}
			return list;

		}
		throw new Exception("Digite um número inteiro maior que 1");
	}

	public static ArrayList<Integer> retornaPrimosMenoresRecursivo(Integer n) throws Exception {

		if (n > 1) {

			boolean primo = true;

			ArrayList<Integer> list = new ArrayList<>();

			if (n == 1)
				primo = false;

			if (primo) {
				if ((n % 2 == 0) && (n != 2)) {
					primo = false;
				}
			}
			if (primo) {

				Integer j = 3;

				for (j = 3; j <= (n / 2); j++) {
					if (n % j == 0) {
						primo = false;
						break;
					}
				}
			}

			if (primo)
				list.add(n);
			return retornaPrimosMenoresLinear(n - 1);
		}
		throw new Exception("Digite um número inteiro maior que 1");

	}

}	





	

