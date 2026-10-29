package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarSolicitacao(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoCargo();
        }
        else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarSolicitacao(solicitacao);
            }
            else {
                return "Sem aprovação";
            }
        }
    }
}
