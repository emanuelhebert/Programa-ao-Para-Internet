package edu.br.catolica.ppi.dto;

import edu.br.catolica.ppi.domain.Endereco;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaRequestDTO {

    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private String email;

    private Endereco endereco;
}
