package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "produto.getAll", query = "select p from Produto p"),
        @NamedQuery(name = "produto.byPrice", query = "select p from Produto p where p.preco > :preco")
})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;
    @Column(name = "descricao_produto")
    private String descricao;
    private String categoria;
    private Boolean disponivel;

}
