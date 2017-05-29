package com.treinando.CrudTreinando.Service;

import com.treinando.CrudTreinando.Model.ProdutoModel;
import com.treinando.CrudTreinando.Respository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;


    //negocios


    public ProdutoModel cadastrar(ProdutoModel produtoModel){

        return produtoRepository.save(produtoModel);
    }
    //negocio de lista

    public Collection<ProdutoModel> buscarTodos(){
        return produtoRepository.findAll();
    }
    //negocio excluir

    public  void excluir(ProdutoModel produtoModel){
        produtoRepository.delete(produtoModel);
    }

    //negocio busca por ID

    public ProdutoModel buscarPorId(Integer id){
        return produtoRepository.findOne(id);
    }

    //negocio alterar

    public   ProdutoModel alterar(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }


}
