package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoAtestado implements TipoSolicitacao {

    private static TipoSolicitacaoAtestado tipoSolicitacaoAtestado = new TipoSolicitacaoAtestado();

    private TipoSolicitacaoAtestado() {};

    public static TipoSolicitacaoAtestado getTipoSolicitacaoAtestado() {
        return tipoSolicitacaoAtestado;
    }

}
