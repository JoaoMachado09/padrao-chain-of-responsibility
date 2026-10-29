package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoContratacao implements TipoSolicitacao {

    private static TipoSolicitacaoContratacao tipoSolicitacaoContratacao = new TipoSolicitacaoContratacao();

    private TipoSolicitacaoContratacao() {};

    public static TipoSolicitacaoContratacao getTipoSolicitacaoContratacao() {
        return tipoSolicitacaoContratacao;
    }

}
