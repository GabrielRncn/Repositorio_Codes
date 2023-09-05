package model;

public class Pessoa {
    private String nome;
    private String sexo;
    private double altura;
    private double peso;
    private int idade;

    private double imc;

    public Pessoa(String nome,String sexo,double altura,double peso, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.imc = imc;
    }

    public double getCalcIMC(){
        imc = (peso/ (altura * altura));
        return imc;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }
}
