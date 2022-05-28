public class Main {

    public static void main(String[] args) {
        conta cc = new corrente();    
        conta poupa = new poupança();

        cc.depositar(100);
        cc.transferir(100, poupa);
        
        cc.imprimirExtrato();
        poupa.imprimirExtrato();        

    }
}
    
