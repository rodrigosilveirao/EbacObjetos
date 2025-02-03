package Abstratas;

public class Programa {

    public static void main (String args[]){

        Pessoas pessoas = new PessoaF();
        Pessoas.setNome("rodrigo");
        Pessoas.setSobrenome("Silveira");

        System.out.println(pessoas.getNome() + " " + pessoas.getSobrenome());
    }
}