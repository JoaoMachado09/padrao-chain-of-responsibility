package padroescomportamentais.chainofresponsability;

public class AprovadorPresidente extends Aprovador {

    public AprovadorPresidente(Aprovador superior) {
        listaSolicitacoes.add(TipoSolicitacaoContratacao.getTipoSolicitacaoContratacao());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }

}
