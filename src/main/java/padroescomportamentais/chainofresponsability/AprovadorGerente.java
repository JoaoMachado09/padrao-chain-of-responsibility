package padroescomportamentais.chainofresponsability;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador superior) {
        listaSolicitacoes.add(TipoSolicitacaoFerias.getTipoSolicitacaoFerias());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}
