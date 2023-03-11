package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta {

    private Double limite;
    @Override
    public Double sacar(Double valor){
        if (valor > saldo + limite)
            throw new IllegalArgumentException("Saldo ");
        saldo -= valor;
        return saldo;
    }
//    @Override
//    public Double sacar(Double valor){
//        if (valor > getSaldo() + limite)
//            throw new IllegalArgumentException("Saldo ");
//        setSaldo(getSaldo() - valor);
//        return getSaldo();
//    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
