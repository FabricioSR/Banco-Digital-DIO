public class poupança extends conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta poupança ===");
        super.imprimirInfosComuns();
    }

}
