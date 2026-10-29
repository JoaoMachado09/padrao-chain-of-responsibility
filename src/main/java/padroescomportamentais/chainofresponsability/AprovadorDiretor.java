package padroescomportamentais.chainofresponsability;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaSolicitacoes.add(TipoSolicitacaoPromocao.getTipoSolicitacaoPromocao());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }

}
