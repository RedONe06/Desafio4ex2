package br.ulbra.pessoa;

public class Rica extends Pessoa {
    
    private double dinheiro;
    
    public Rica(){
        
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        
    }

    @Override
    public String toString() {
        return "Rica{" + "dinheiro=" + dinheiro + '}';
    }
    

    
    
    
}
