package br.ulbra.classes;

public class Pobre extends Pessoa {
    
    private String contas;
    
    public Pobre(){
        
    }

    public String getContas() {
        return contas;
    }

    public void setContas(String contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Pobre{" + "contas=" + contas + '}';
    }
    
    
}
