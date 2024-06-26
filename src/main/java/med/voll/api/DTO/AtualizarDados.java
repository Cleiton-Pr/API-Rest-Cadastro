package med.voll.api.DTO;

import jakarta.validation.constraints.NotNull;
import med.voll.api.MedicoDados.EnderecoMedico;

public record AtualizarDados (
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco

){
}
