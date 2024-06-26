package med.voll.api.MedicoDados;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.DTO.AtualizarDados;
import med.voll.api.DTO.DadosCadastroMedico;
import med.voll.api.DTO.Endereco;


@Entity(name="cadastro")
@Table(name="medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private boolean ativo;
    private String nome;
    private String telefone;
    private String email;
    private @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "\\d{4,6}") String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private EnderecoMedico endereco;


    public Medico(DadosCadastroMedico dados) {
//        this.ativo = true;
        this.crm = dados.crm();
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.endereco = new EnderecoMedico(dados.endereco());
        this.especialidade = dados.especialidade();




    }

    public void atualizacaodados(AtualizarDados dados) {
        if (dados.nome()!=null){
            this.nome = dados.nome();
        }
        if (dados.telefone()!= null){
            this.telefone = dados.telefone();
        }

        if (dados.endereco()!=null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

//    public void exclusao() {
//        this.ativo = false;
//    }
}
