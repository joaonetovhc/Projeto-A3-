
package br.dev.pacotes.funcionarios.view;


public class Funcionario {
   
    private String nome;
    private String cpf;
    private String endereco;
    private String area;
    
    public Funcionario (String nome, String cpf, String endereco, String area){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.area = area;
    }

  
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
             
    public String getCpf(){
        return cpf;
    }
                
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSalario(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

                
}
