package edu.br.catolica.ppi.dto;

import edu.br.catolica.ppi.domain.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaResponseDTO{

    private String nome;

    private String cpf;

    private String email;

    private Endereco endereco;



}
