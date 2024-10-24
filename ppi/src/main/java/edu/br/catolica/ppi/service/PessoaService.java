package edu.br.catolica.ppi.service;

import edu.br.catolica.ppi.converter.ModelConverter;
import edu.br.catolica.ppi.dto.PessoaRequestDTO;
import edu.br.catolica.ppi.dto.PessoaResponseDTO;
import edu.br.catolica.ppi.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaResponseDTO save(PessoaRequestDTO request){

        var pessoa = ModelConverter.dtoToEntity(request);

        return ModelConverter.entityToResponseDTO(pessoaRepository.save(pessoa));
    }

}
