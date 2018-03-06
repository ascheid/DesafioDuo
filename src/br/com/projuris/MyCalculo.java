package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyCalculo implements Calculo {

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		List<String> cargos = new ArrayList<>();
		List<CustoCargo> custoPorCargo = new ArrayList<>();
		for(Funcionario f : funcionarios) {
			if(!cargos.contains(f.getCargo()))
				cargos.add(f.getCargo());
		}
		for(String cargo : cargos) {
			CustoCargo custoCargo = new CustoCargo();
			custoCargo.setCusto(new BigDecimal(0));
			custoCargo.setDepartamento(cargo);
			for(Funcionario f : funcionarios) {
				if(cargo.equals(f.getCargo()))
					custoCargo.setCusto(custoCargo.getCusto().add(f.getSalario()));
			}
			custoPorCargo.add(custoCargo);
		}
		return custoPorCargo;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		List<String> departamentos = new ArrayList<>();
		List<CustoDepartamento> custoPorDepartamento = new ArrayList<>();
		for(Funcionario f : funcionarios) {
			if(!departamentos.contains(f.getDepartamento()))
				departamentos.add(f.getDepartamento());
		}
		for(String departamento : departamentos) {
			CustoDepartamento custoDepartamento = new CustoDepartamento();
			custoDepartamento.setCusto(new BigDecimal(0));
			custoDepartamento.setDepartamento(departamento);
			for(Funcionario f : funcionarios) {
				if(departamento.equals(f.getDepartamento()))
					custoDepartamento.setCusto(custoDepartamento.getCusto().add(f.getSalario()));
			}
			custoPorDepartamento.add(custoDepartamento);
		}
		return custoPorDepartamento;
	}

}
