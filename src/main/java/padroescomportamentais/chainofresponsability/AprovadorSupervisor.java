package padroescomportamentais.chainofresponsability;

public class AprovadorSupervisor extends Aprovador {

    public AprovadorSupervisor(Aprovador superior) {
        listaSolicitacoes.add(TipoSolicitacaoAtestado.getTipoSolicitacaoAtestado());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }

}
