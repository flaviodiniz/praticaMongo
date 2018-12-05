package br.ifpb.ads.bd2.Teste;

import com.mongodb.DB;

import br.ifpb.ads.bd2.persistencia.MongoConnection;

public class Testes {

	public static void main(String[] args) {
		DB db = MongoConnection.getInstance().getDB();
	
	}

}
