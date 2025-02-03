package Abstratas;


public class Programa {

    public static void main (String args[]){

        Pessoas pessoas = new PessoaF();
        pessoas.setNome("rodrigo");
        pessoas.setSobrenome("Silveira");

        System.out.println(pessoas.getNome() + " " + pessoas.getSobrenome());
    }
}