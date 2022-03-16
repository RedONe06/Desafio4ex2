package br.ulbra.classes;

public class Animal {
    
    protected String nome;
    protected String raca;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void Animal(){
        
    }
    public void Animal(String nome){
        
    }
    public String caminha(){
        return "";
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
    
}
