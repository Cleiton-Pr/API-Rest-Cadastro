package med.voll.api.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Endereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero
) {

//        public Endereco(Endereco endereco) {
//                this(endereco.logradouro(), endereco.bairro(), endereco.cep(), endereco.cidade, endereco.uf,
//                        endereco.complemento, endereco.numero);
//        }
}
