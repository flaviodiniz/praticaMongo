package br.ifpb.ads.bd2.persistencia;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.ifpb.ads.bd2.modelos.Pessoa;

public class PessoaConverter {

	public Map converterToMap(Pessoa pessoa) {
		Map mapPessoa = new HashMap();
		mapPessoa.put("firstName", pessoa.getNome());
		mapPessoa.put("lastName", pessoa.getSegundoNome());
		mapPessoa.put("age", pessoa.getId());
		mapPessoa.put("phone", new TelefoneConverter().converterToMap(pessoa.getTelefone()));
		return mapPessoa;
	}

	public Pessoa converterToPerson(DBObject dbo) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(dbo.get("id").toString());
		pessoa.setNome((String) dbo.get("nome"));
		pessoa.setSegundoNome((String) dbo.get("segundoNome"));
		pessoa.setTelefone(new TelefoneConverter().converterToPhone((HashMap) dbo.get("phone")));
		return pessoa;
	}

}
