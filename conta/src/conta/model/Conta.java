package conta.model;

public abstract class Conta {

    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    // MÉTODOS GETTERS
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    // MÉTODOS SETTERS
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (this.getSaldo() < valor) {
            System.out.println("\n Saldo insuficiente!");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void depositar(float valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void visualizar() {
        String tipo = "";

        switch (this.tipo) {
            case 1:
                tipo = "Conta corrente";
                break;
            case 2:
                tipo = "Conta poupança";
                break;
        }

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados da Conta:");
        System.out.println("***********************************************************");
        System.out.println("Numero da Conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Tipo da Conta: " + tipo);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);

    }

}
