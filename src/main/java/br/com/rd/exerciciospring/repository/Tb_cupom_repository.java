package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Tb_cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tb_cupom_repository extends  JpaRepository <Tb_cupom,Long>{

            public List<Tb_cupom> findByDescricao(String descricao);
              List<Tb_cupom> findByCodProdutoAndDescricao(Long id, String descricao);


}
