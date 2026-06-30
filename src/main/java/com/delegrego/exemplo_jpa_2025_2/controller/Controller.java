package com.delegrego.exemplo_jpa_2025_2.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Controller implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Scanner input = new Scanner(System.in);
		int opcao;

		System.out.print("\n=== Exemplo JPA 1 ===\n");

		do {

			ConsoleUtils.exibirMenu();

			opcao = input.nextInt();

			try {
				switch (opcao) {
				case 1 -> cadastrarDepartamento();
				case 2 -> listarDepartamentos();
				case 3 -> atualizarDepartamento();
				case 4 -> deletarDepartamento();
				case 5 -> cadastrarFuncionario();
				case 6 -> listarFuncionarios();
				case 7 -> atualizarFuncionario();
				case 8 -> deletarFuncionario();
				case 0 -> System.out.println("Saindo da aplicação...");
				default -> {
					System.out.println("Opção inválida\n");
					ConsoleUtils.exibirMenu();
					opcao = input.nextInt();
				}
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (opcao != 0);

	}

	private void cadastrarDepartamento() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do Departamento: ");
		String nomeDepartamento = input.nextLine();

		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento(nomeDepartamento);

		departamentoService.cadastrarDepartamento(departamento);

		System.out.println("Departamento criado!");

	}

	private void listarDepartamentos() {

		List<Departamento> listaDepartamentos = departamentoService.listarDepartamentos();

		if (listaDepartamentos.isEmpty()) {
			System.out.println("Não há departamentos");
		} else {
			System.out.println("Lista de departamentos: ");
			for (Departamento d : listaDepartamentos) {
				System.out.println(d);
			}
		}

	}

	private void atualizarDepartamento() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a id do Departamento: ");
		int id = input.nextInt();

		System.out.println("Insira o nome do Departamento: ");
		input.nextLine();
		String nomeDepartamento = input.nextLine();

		Departamento departamento = new Departamento();
		departamento.setIdDepartamento(id);
		departamento.setNomeDepartamento(nomeDepartamento);

		departamentoService.atualizarDepartamento(departamento);

		System.out.println("Departamento atualizado!");

	}

	private void deletarDepartamento() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a id do Departamento: ");
		int id = input.nextInt();

		departamentoService.deletarDepartamento(id);

		System.out.println("Departamento deletado!");

	}

	private void cadastrarFuncionario() {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		String nome = input.nextLine();

		System.out.print("Informe o email: ");
		String email = input.nextLine();

		System.out.print("Informe a senha: ");
		String senha = input.nextLine();

		System.out.print("Informe o salário: ");
		double salario = input.nextDouble();

		System.out.print("Informe o ID do departamento: ");
		int idDepartamento = input.nextInt();

		Departamento departamento = departamentoService.obterDepartamentoPorId(idDepartamento);

		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setSenha(senha);
		funcionario.setSalario(salario);
		funcionario.setDepartamento(departamento);

		funcionarioService.cadastrarFuncionario(funcionario);

		System.out.println("Funcionário criado!");

	}

	private void listarFuncionarios() {

		List<Funcionario> listaFuncionarios = funcionarioService.listarFuncionarios();

		if (listaFuncionarios.isEmpty()) {
			System.out.println("Não há funcionários");
		} else {
			System.out.println("Lista de funcionarios: ");
			for (Funcionario f : listaFuncionarios) {
				System.out.println(f);
			}
		}

	}

	private void atualizarFuncionario() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a id do funcionário: ");
		int id = input.nextInt();
		input.nextLine();

		System.out.print("Informe o nome: ");
		String nome = input.nextLine();

		System.out.print("Informe o email: ");
		String email = input.nextLine();

		System.out.print("Informe a senha: ");
		String senha = input.nextLine();

		System.out.print("Informe o salário: ");
		double salario = input.nextDouble();

		System.out.print("Informe o ID do departamento: ");
		int idDepartamento = input.nextInt();

		Departamento departamento = departamentoService.obterDepartamentoPorId(idDepartamento);

		Funcionario funcionario = new Funcionario();
		funcionario.setIdFuncionario(id);
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setSenha(senha);
		funcionario.setSalario(salario);
		funcionario.setDepartamento(departamento);

		funcionarioService.atualizarFuncionario(funcionario);

		System.out.println("Funcionário atualizado!");

	}

	private void deletarFuncionario() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a id do Funcionario: ");
		int id = input.nextInt();

		funcionarioService.deletarFuncionario(id);

		System.out.println("Funcionário deletado!");

	}

}
