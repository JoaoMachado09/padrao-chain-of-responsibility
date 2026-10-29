package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    AprovadorPresidente presidente;
    AprovadorDiretor diretor;
    AprovadorGerente gerente;
    AprovadorSupervisor supervisor;

    @BeforeEach
    void setUp() {
        presidente = new AprovadorPresidente(null);
        diretor = new AprovadorDiretor(presidente);
        gerente = new AprovadorGerente(diretor);
        supervisor = new AprovadorSupervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaAprovacaoAtestado() {
        assertEquals("Supervisor", supervisor.aprovarSolicitacao(new Solicitacao("Ana", TipoSolicitacaoAtestado.getTipoSolicitacaoAtestado())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoFerias() {
        assertEquals("Gerente", supervisor.aprovarSolicitacao(new Solicitacao("Bruno", TipoSolicitacaoFerias.getTipoSolicitacaoFerias())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoPromocao() {
        assertEquals("Diretor", supervisor.aprovarSolicitacao(new Solicitacao("Carla", TipoSolicitacaoPromocao.getTipoSolicitacaoPromocao())));
    }

    @Test
    void deveRetornarPresidenteParaAprovacaoContratacao() {
        assertEquals("Presidente", supervisor.aprovarSolicitacao(new Solicitacao("Daniel", TipoSolicitacaoContratacao.getTipoSolicitacaoContratacao())));
    }

    @Test
    void deveRetornarSemAprovacaoParaReajusteGeral() {
        assertEquals("Sem aprovação", supervisor.aprovarSolicitacao(new Solicitacao("Eduarda", TipoSolicitacaoReajusteGeral.getTipoSolicitacaoReajusteGeral())));
    }

    @Test
    void deveRetornarSemAprovacaoQuandoCadeiaNaoAlcancaAprovador() {
        AprovadorGerente gerenteSemSuperior = new AprovadorGerente(null);
        assertEquals("Sem aprovação", gerenteSemSuperior.aprovarSolicitacao(new Solicitacao("Fábio", TipoSolicitacaoPromocao.getTipoSolicitacaoPromocao())));
    }

    @Test
    void deveIniciarCadeiaPeloMeioERetornarDiretor() {
        assertEquals("Diretor", gerente.aprovarSolicitacao(new Solicitacao("Gabriela", TipoSolicitacaoPromocao.getTipoSolicitacaoPromocao())));
    }

}
