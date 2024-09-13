package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@NamedQueries({
        @NamedQuery(name = "produtoEstoque",
                query = "select e from Estoque e where e.quantidade > 1 and e.produto.id = :id")
})
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    Produto produto;

    private Integer quantidade;
}
