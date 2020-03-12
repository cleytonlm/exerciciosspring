package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cupom_item")
public class Intemcupom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cupom_item")
    private Integer cod_cupom_item;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_id_cupom")
    private Integer cod_id_cupom;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_id_produto")
    private Integer cod_id_produto;

    @Column(name = "qt_produto")
    private Integer qt_produto;

    @Column(name = "vl_produto")
    private BigDecimal vl_produto;



}
