package br.ulbra.animal;

public class Gato extends Animal {
    
    private String porte;

    public Gato() {
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public String mia(){
        return "Miau";
    }   
}
