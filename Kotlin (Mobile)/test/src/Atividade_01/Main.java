package Atividade_01;

public class Main {
    public static void main(String[] args) {

        Atividade_01.Pessoa p = new Pessoa();
        p.setNome("Luan");
        p.setSobrenome("Dantas");
        p.setIdade(21);

        System.out.println("Meu nome é "+p.getNome()+", meu sobrenome é "+p.getSobrenome()+" e minha idade é "+p.getIdade()+" anos.");
    }
}
