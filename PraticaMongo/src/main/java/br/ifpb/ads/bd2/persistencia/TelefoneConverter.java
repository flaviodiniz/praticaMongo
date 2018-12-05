package br.ifpb.ads.bd2.persistencia;

import java.util.HashMap;
import java.util.Map;

import br.ifpb.ads.bd2.modelos.Telefone;

public class TelefoneConverter {

	public Map converterToMap(Telefone telefone) {
		Map mapTelefone = new HashMap();
		mapTelefone.put("numero", telefone.getNumero());
		return mapTelefone;
	}

	public Telefone converterToPhone(HashMap hashMap) {
		Telefone telefone = new Telefone();
		telefone.setNumero((String) hashMap.get("numero"));
		return telefone;
	}

}
