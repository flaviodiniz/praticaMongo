package br.ifpb.ads.bd2.Teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import br.ifpb.ads.bd2.dao.PessoaDao;
import br.ifpb.ads.bd2.modelos.Pessoa;
import br.ifpb.ads.bd2.modelos.Telefone;
/*
 * Main responsavel por executar o teste
 * executando 3 vezes(um para cada ação
 */
public class PessoaTeste {

	public static void main(String[] args) {
		salvar();
		// atualizar();
		// deletar();
	}

	private static void salvar() {
		Telefone ph1 = new Telefone("083-99945.0664");
		Pessoa p1 = new Pessoa("Flavio", "Diniz", "P1", ph1);
		new PessoaDao().salvar(p1);

		Telefone ph2 = new Telefone("083-99999.0000");
		Pessoa p2 = new Pessoa("Flavianny", "Diniz", "P2", ph2);
		new PessoaDao().salvar(p2);

		Telefone ph3 = new Telefone("083-99222.4444");
		Pessoa p3 = new Pessoa("Fernanda", "Diniz", "P3", ph3);
		new PessoaDao().salvar(p3);

//		List pessoas = new PessoaDao().findPessoas();
//		for (Pessoa pessoa : pessoas) {
//			System.out.println(pessoa.toString());
//		}
	}

	private static void atualizar() {
		Map map = new HashMap();
		map.put("firstName", "Anita");
		Pessoa query = new PessoaDao().findPerson(map);

		Telefone novo = new Telefone("083-99999.4444");
		Pessoa person = new Pessoa("Nanda", "Diniz", "P3", novo);
		new PessoaDao().atualizar(query, person);

		Pessoa novaPessoa = new PessoaDao().findPerson(map);
		System.out.printf("antiga:> " + query + "\nova:> " + novaPessoa.toString());
	}

	private static void deletar() {
		Map map = new HashMap();
		map.put("Nome", new ObjectId("Flavio"));
		List lista = new PessoaDao().findPessoa(map);

//		for (Pessoa pessoa : lista) {
//			new PessoaDao().deletar(pessoa);
//		}
//
//		List pessoas = new PessoaDao().findPessoas();
//		for (Pessoa pessoa : pessoas) {
//			System.out.println(pessoa.toString());
//		}
	}

}
