package br.ifpb.ads.bd2.dao;

import java.util.List;
import java.util.Map;

import com.mongodb.DBObject;
/*
 * Interface do Dao
 */
public interface IDao {
    void salvar(Map mapEntity);

    void atualizar(Map mapQuery, Map mapEntity);

    void deletar(Map mapEntity);

    DBObject findOne(Map mapEntity);

    List findAll();

    List findKeyValue(Map keyValue);
}