package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoReajusteGeral implements TipoSolicitacao {

    private static TipoSolicitacaoReajusteGeral tipoSolicitacaoReajusteGeral = new TipoSolicitacaoReajusteGeral();

    private TipoSolicitacaoReajusteGeral() {};

    public static TipoSolicitacaoReajusteGeral getTipoSolicitacaoReajusteGeral() {
        return tipoSolicitacaoReajusteGeral;
    }

}
