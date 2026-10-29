package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoPromocao implements TipoSolicitacao {

    private static TipoSolicitacaoPromocao tipoSolicitacaoPromocao = new TipoSolicitacaoPromocao();

    private TipoSolicitacaoPromocao() {};

    public static TipoSolicitacaoPromocao getTipoSolicitacaoPromocao() {
        return tipoSolicitacaoPromocao;
    }

}
