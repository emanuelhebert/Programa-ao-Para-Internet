package edu.br.catolica.ppi.controller;

import edu.br.catolica.ppi.domain.Pessoa;
import edu.br.catolica.ppi.dto.PessoaRequestDTO;
import edu.br.catolica.ppi.dto.PessoaResponseDTO;
import edu.br.catolica.ppi.service.PessoaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/pessoa")
@Tag(name = "Pessoa", description = "API for Pessoa")
public class PessoaController {


    private final PessoaService pessoaService;


    @PostMapping("/new")
    @Operation(summary = "Salva os usuarios no banco de dados", responses = {@ApiResponse(
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Pessoa.class))),
            @ApiResponse(responseCode = "201", description = "Pessoa Salva")})
    public ResponseEntity<PessoaResponseDTO> savePessoa(@Valid @RequestBody PessoaRequestDTO request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.save(request));
    }
}
