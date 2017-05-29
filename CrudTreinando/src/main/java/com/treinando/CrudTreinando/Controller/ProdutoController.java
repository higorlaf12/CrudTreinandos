package com.treinando.CrudTreinando.Controller;

import com.treinando.CrudTreinando.Model.ProdutoModel;
import com.treinando.CrudTreinando.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/")
public class ProdutoController {

        @Autowired
        ProdutoService produtoService;

    //End points Alterar

    @RequestMapping(method = RequestMethod.PUT,value = "/")
    public ResponseEntity<ProdutoModel> alterarProduto(@RequestBody ProdutoModel produtoModel){

        ProdutoModel alterado =  produtoService.alterar(produtoModel);
        if(alterado == null){
            return new ResponseEntity<ProdutoModel>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(alterado,HttpStatus.OK);
    }

    //End points excluir
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<ProdutoModel> excluirDados(@PathVariable Integer id){
        ProdutoModel clienteEncontrado = produtoService.buscarPorId(id);

        if(clienteEncontrado == null){
            return  new ResponseEntity<ProdutoModel>(HttpStatus.NOT_FOUND);
        }
        produtoService.excluir(clienteEncontrado);
        return  new ResponseEntity<ProdutoModel>(HttpStatus.OK);
    }

    //End points para lista
    @RequestMapping(value = "/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<ProdutoModel>> buscarcliente(){
        Collection<ProdutoModel> clientesBuscados = produtoService.buscarTodos();

        return  new ResponseEntity<>(clientesBuscados,HttpStatus.OK);
    }
    //End points

    @RequestMapping(value = "/",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProdutoModel> cadastrarCliente(@RequestBody ProdutoModel produtoModel){

        ProdutoModel Clientecadastrado = produtoService.cadastrar(produtoModel);

        return new ResponseEntity<ProdutoModel>(Clientecadastrado, HttpStatus.CREATED);

            }
}
