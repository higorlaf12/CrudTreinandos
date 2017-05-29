package com.treinando.CrudTreinando.Model;


import javax.persistence.*;

@Entity
//@Table(name = "produto")
public class ProdutoModel {

    @Id
    @GeneratedValue//(strategy = GenerationType.AUTO)
    private Integer id ;

    //@Column(name = "pro_nome")
    private String nome;

    //@Column(name = "pro_numero")
    //private int numero;

    //@Column(name = "pro_descricao")
    //private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public int getNumero() {
        return numero;
    }

    //public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }*/
}
