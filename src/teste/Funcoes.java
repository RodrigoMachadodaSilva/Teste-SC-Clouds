package teste;

import java.util.ArrayList;

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
		throw new Exception("Digite um n�mero positivo ou zero");

	}

	public static Integer retornaFibocciEquivalenteRecursivo(Integer n) throws Exception {

		if (n >= 0) {
			if (n < 2) {
				return n;
			}
			return retornaFibocciEquivalenteRecursivo(n - 1) + retornaFibocciEquivalenteRecursivo(n - 2);
		}
		throw new Exception("Digite um n�mero positivo ou zero");

	}

	public static ArrayList<Integer> retornaPrimosMenoresLinear(Integer n) throws Exception {

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
		throw new Exception("Digite um n�mero inteiro maior que 1");
	}

	public static Integer retornaPrimosMenoresRecursivo(Integer n) throws Exception {
		 if(n>1) {

			n = n -1;
			boolean primo = true;
	
			if (n == 1)
				primo = false;
			
			if (primo) {
				if ((n / (n - 1) == 0)) {
					primo = false;
	
				}
			}
	
			if (primo) {
				if ((n % 2 == 0) && (n != 2)) {
					primo = false;
				}
			}
	
			if (primo)
				System.out.print(n);
			if (n > 2) {
				retornaPrimosMenoresRecursivo(n);
			}
			return n;

	}
	 throw new Exception("Digite um n�mero inteiro maior que 1");
	}
	public static boolean isPrime(int n, int i) {

		// Base cases
		if (n <= 2)
			return (n == 2) ? true : false;
		if (n % i == 0)
			return false;
		if (i * i > n)
			return true;

		// Check for next divisor
		return isPrime(n, i + 1);
	}

	public static Integer testeDivisor(Integer a, Integer b) {
		if (b == 1) {
			return 0;
		} else if (a % b == 0) {
			return 1;
		}
		return testeDivisor(a, b - 1);

	}

	public static Integer testaPrimo(Integer n) {
		if (testeDivisor(n, n - 1) == 0) {
			return 1;
		}
		return 0;

	}
}