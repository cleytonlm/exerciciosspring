package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")

public class Tb_cupom {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Column(name = "nr_cliente")
        private Integer idcliente;

        @NotNull
        @Column (name = "nr_dtvenda")
        private String dt_venda;

        @Column(name = "vl_venda")
        private BigDecimal vlvenda;
    }
