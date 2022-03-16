package br.ulbra.classes;

public class Miseravel extends Pessoa {
    
    private boolean dorme;
    
    public Miseravel(){
        
    }

    public boolean isDorme() {
        return dorme;
    }

    public void setDorme(boolean dorme) {
        this.dorme = dorme;
    }
    
    public void Mendiga(){
        
    }

    @Override
    public String toString() {
        return "Miseravel{" + "dorme=" + dorme + '}';
    }
    
}
