package padroescomportamentais.chainofresponsability;

public class Solicitacao {

    private String colaborador;
    private TipoSolicitacao tipoSolicitacao;

    public Solicitacao(String colaborador, TipoSolicitacao tipoSolicitacao) {
        this.colaborador = colaborador;
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

}
