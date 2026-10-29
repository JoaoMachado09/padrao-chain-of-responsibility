package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoFerias implements TipoSolicitacao {

    private static TipoSolicitacaoFerias tipoSolicitacaoFerias = new TipoSolicitacaoFerias();

    private TipoSolicitacaoFerias() {};

    public static TipoSolicitacaoFerias getTipoSolicitacaoFerias() {
        return tipoSolicitacaoFerias;
    }

}
