package teste;

import java.util.ArrayList;
import java.util.List;

public class Funcoes {

	public static Integer retornaFibonacciEquivalenteLinear(Integer n) throws Exception {

		if (n >= 0) {

			if (n < 2)
				return n;

			Integer i, f = 0, f1 = 1, f2 = 1;
			for (i = 3; i <= n; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}

			return (f);

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

	public static ArrayList<Integer> retornaPrimosLinear(Integer n) throws Exception {

		if (n > 1) {

			Integer valorInicial = 2;

			Integer valorFinal = n;

			Integer i;

			Integer j;

			boolean primo;

			ArrayList<Integer> list = new ArrayList<>();

			for (i = valorInicial; i <= valorFinal; i++) {

				primo = true;

				if (primo) {
					if ((i % 2 == 0) && (i != 2)) {
						primo = false;
					}
				}
				if (primo) {
					for (j = 3; j <= (Math.sqrt(i)); j++) {
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

	public static List<Integer> retornaPrimosRecursivo(Integer n) throws Exception {

		if (n > 1) {

			List<Integer> primos = new ArrayList<>();

			boolean primo = true;

			if (primo) {
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						primo = false;
						break;
					}
				}
			}

			if (primo) {
				if ((n % 2 == 0) && (n != 2)) {
					primo = false;
				}
			}

			if (primo) {
				primos.add(n);
			}

			if (n > 2) {
				primos.addAll(retornaPrimosRecursivo(n - 1));
			}

			return primos;
		}

		throw new Exception("Digite um número inteiro maior que 1");
	}

}
