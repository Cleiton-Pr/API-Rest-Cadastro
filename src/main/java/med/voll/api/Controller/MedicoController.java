package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.DTO.AtualizarDados;
import med.voll.api.DTO.DadosCadastroMedico;
import med.voll.api.DTO.DadosListaMedico;
import med.voll.api.MedicoDados.Medico;
import med.voll.api.MedicoDados.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    private Medico medico = new Medico();

    @PostMapping
    @Transactional
    public void cadastroMedico(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListaMedico> listar (Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListaMedico::new);

    }

    @PutMapping
    @Transactional
    public void atualizacao(@RequestBody @Valid AtualizarDados dados){
       var medico = repository.getReferenceById(dados.id());

        medico.atualizacaodados(dados);

    }

//    @DeleteMapping("/{id}")
//    @Transactional
//    public void excluir(@PathVariable Long id){
//        var medico = repository.getReferenceById(id);
//      medico.exclusao();
//
//    }






}
