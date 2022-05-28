public class corrente extends conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosComuns();
    }
}
