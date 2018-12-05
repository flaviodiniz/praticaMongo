package br.ifpb.ads.bd2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.DBObject;

import br.ifpb.ads.bd2.modelos.Pessoa;
import br.ifpb.ads.bd2.persistencia.PessoaConverter;

public class PessoaDao extends EntityDao {

	public PessoaDao() {
		super(Pessoa.class);
	}

	public void salvar(Pessoa pessoa) {
		Map mapPerson = new PessoaConverter().converterToMap(pessoa);
		salvar(mapPerson);
	}

	public void atualizar(Pessoa oldPessoa, Pessoa newPessoa) {
		Map query = new PessoaConverter().converterToMap(oldPessoa);
		Map map = new PessoaConverter().converterToMap(newPessoa);
		atualizar(query, map);
	}

	public void deletar(Pessoa pessoa) {
		Map map = new PessoaConverter().converterToMap(pessoa);
		deletar(map);
	}

	public Pessoa findPerson(Map mapKeyValue) {
		DBObject dbObject = findOne(mapKeyValue);
		Pessoa pessoa = new PessoaConverter().converterToPerson(dbObject);
		return pessoa;
	}

	public List findPessoas() {
		List lista = findAll();
		List pessoas = new ArrayList();
		for (DBObject dbo : lista) {
			Pessoa pessoa = new PessoaConverter().converterToPerson(dbo);
			pessoas.add(pessoa);
		}
		return pessoas;
	}

	public List findPessoa(Map mapValue) {
		List lista = findKeyValue(mapValue);
		List pessoas = new ArrayList();
		for (DBObject dbo : lista) {
			Pessoa pessoa = new PessoaConverter().converterToPerson(dbo);
			pessoas.add(pessoa);
		}
		return pessoas;
	}

}
