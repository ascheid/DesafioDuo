# DesafioDuo

Desafio Duo Tecnologia

1) Dados dois arrays, implementar um método que encontre a primeira ocorrência no segundo array.
O valor retornado deve ser a posição deste valor no primeiro array.
Se houver mais de uma ocorrência, deve retornar a última ocorrência.
Caso não tenha nenhuma ocorrência, o retorno deve ser -1.
Seguir a interface abaixo:

package br.com.projuris;
 
public interface FindArray {
	int findArray(int[] array, int[] subArray);
}
 
Demonstração:
[4,9,3,7,8] e [3,7] deve retornar 2.
[1,3,5] e [1] deve retornar 0.
[7,8,9] e [8,9,10] deve retornar -1.
[4,9,3,7,8,3,7,1] e [3,7] deve retornar 5.
 
 O nome da classe que implementa esta Interface deve ser MyFindArray sob o package br.com.projuris



2) Dado uma String, retornar a primeira letra não duplicada na palavra.
Mostrar a primeira letra não repetida.
 
Seguir a interface abaixo:
package br.com.projuris;
 
public interface FindCharachter {
	char findChar(String word);
}
 
 
Demonstração:
“stress” – deve retornar “t”.
“reembolsar” – deve retornar “m”.
 
  O nome da classe que implementa esta Interface deve ser MyFindChar sob o package com.br.projuris

Caso não exista nenhuma letra não repetida na String, deve retornar ‘ ’ .
 
 3) Cada funcionário tem um departamento. String
Cada funcionário tem um salário. BigDecimal
Cada funcionário tem um cargo. String

Dado uma lista de funcionários, seu salário e departamento e cargo, calcule:
 
●	Custo total por departamento
●	Custo total por cargo
 
O retorno deve ser uma implementação da Interface Calculo.


Exemplo de lista:


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



Objeto Funcionario

package br.com.projuris;

import java.math.BigDecimal;

public class Funcionario {

	private String cargo;
	private String departamento;
	private BigDecimal salario;

	public Funcionario(String cargo, String depargamento, BigDecimal salario) {
		this.cargo = cargo;
		this.departamento = depargamento;
		this.salario = salario;
	}


	// getters e setters;
}

Interface Calculo

package br.com.projuris;

import java.util.List;

public interface Calculo {

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);

}

Objeto CustoCargo

package br.com.projuris;

import java.math.BigDecimal;

public class CustoCargo {
	private String departamento;
	private BigDecimal custo;
	// getters e setters;
}

Objeto CustoDepartamento

package br.com.projuris;

import java.math.BigDecimal;

public class CustoDepartamento {
	private String departamento;
	private BigDecimal custo;
	// getters e setters
}


O nome da classe que implementa a lógica deve ser MyCalculo sob o package br.com.projuris.
