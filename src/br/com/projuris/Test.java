package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyFindArray myFindArray = new MyFindArray();
		int[] a1 = {4,9,3,7,8};
		int[] a2 = {3,7};
		int[] a3 = {1,3,5};
		int[] a4 = {1};
		int[] a5 = {7,8,9};
		int[] a6 = {8,9,10};
		int[] a7 = {4,9,3,7,8,3,7,1};
		int[] a8 = {3,7};
		myFindArray.findArray(a1, a2);
		myFindArray.findArray(a3, a4);
		myFindArray.findArray(a5, a6);
		myFindArray.findArray(a7, a8);
		
		MyFindChar myFindChar = new MyFindChar();
		System.out.println(myFindChar.findChar("stress"));
		System.out.println(myFindChar.findChar("reembolsar"));
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);
		
		MyCalculo calcs = new MyCalculo();
		List<CustoDepartamento> cD = calcs.custoPorDepartamento(listaFuncionario);
		List<CustoCargo> cC = calcs.custoPorCargo(listaFuncionario);
		
		for(CustoDepartamento c : cD) {
			System.out.println(c.getDepartamento() + " = $ " + c.getCusto().doubleValue());
		}
		
		for(CustoCargo c : cC) {
			System.out.println(c.getDepartamento() + " = $ " + c.getCusto().doubleValue());
		}
	}

}
