package br.com.rd.exerciciospring.Controller;

import br.com.rd.exerciciospring.Service.intem.cupom_Service;
import br.com.rd.exerciciospring.model.Tb_cupom;
import br.com.rd.exerciciospring.repository.Tb_cupom_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CupomController {
    @Autowired
    cupom_Service service ;


    private Tb_cupom_repository repository;

    @GetMapping("/produto/{id}")
    public Tb_cupom buscarPorId(@PathVariable("id") Long id) {
        return repository.findById(id).get();
    }
    @GetMapping(value = "/Tb_cupom/{id}/ {dt_venda}")
    public ResponseEntity<List<Tb_cupom>> buscarPorId(@PathParam("dt_venda") String dt_venda, @PathParam("id") Long id) {
        List<Tb_cupom> tb_cupoms = new ArrayList<>();
        if (id != null && dt_venda != null)
            tb_cupoms = repository.findByCodProdutoAndDescricao(id, dt_venda);
        else if (id != null)
            tb_cupoms.add(repository.findById(id).get());
        else if (dt_venda != null)
            tb_cupoms = repository.findByDescricao(dt_venda);
        if (tb_cupoms != null && tb_cupoms.size() > 0)
            return ResponseEntity.ok().body(tb_cupoms);
        else
            return ResponseEntity.badRequest().build();
    }

}
