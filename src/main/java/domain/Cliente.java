package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 100,
    message = "O nome dever ter no mínimo 2 caracteres e no máximo 100 caracteres")
    private String nome;

    @CPF(message = "CPF Inválido")
    private String cpf;

    @Email(message = "Email Inválido")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

}
