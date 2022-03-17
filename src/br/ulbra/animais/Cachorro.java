package br.ulbra.animais;

public class Cachorro extends Animal {
    
    private String cor;

    public Cachorro() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String late(){
        return "Auau";
    }
    
    @Override
    public String toString() {
        return "Cachorro{" + "cor=" + cor + '}';
    }

    
    
    
}
