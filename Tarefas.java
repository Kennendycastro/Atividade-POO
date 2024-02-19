/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefas;

/**
 *
 * @author kennendy
 */
public class Tarefas {
    private int idade;
    private String sexo;
    private double peso;
    private String corOlhos;
    private String corCabelo;
    private double altura;
    private String nome;
    
    // metodos Setters
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    // metodos getters
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public double getPeso(){
        return this.peso;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    // metodos Constourres

    public Tarefas(int idade, String sexo, double peso, String corOlhos, String corCabelo, double altura, String nome) {
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.altura = altura;
        this.nome = nome;
    }

    public Tarefas(String nome) {
        this.nome = nome;
    }

    public Tarefas() {
    }

    
    
    
    
}
