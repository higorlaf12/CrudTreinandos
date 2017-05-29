package com.treinando.CrudTreinando.Respository;

import com.treinando.CrudTreinando.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Integer>{


}
