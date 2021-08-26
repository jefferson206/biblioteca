package servicos;

import entidades.Aluno;
import interfaces.IServicosGerais;

import java.util.List;

public class FuncionarioService implements IServicosGerais {

    public boolean procurarAlunoPeloLogin(List<Aluno> alunos, String login) {
        return alunos.stream().anyMatch(aluno -> aluno.getLogin().equals(login));
    }

}
