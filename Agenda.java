import java.util.Scanner;

public class Agenda {
    


    Scanner console = new Scanner(System.in);

    Pessoa[] agenda = new Pessoa[10];

    public void armazenaPessoa(String nome, int idade, float altura){
        for(int i= 0; i < 10; i++ ){
            if(agenda[i] == null){
                agenda[i] = new Pessoa();
                agenda[i].setNome(nome);
                agenda[i].setIdade(idade);
                agenda[i].setAltura(altura);
                return;
            }
        }
        System.out.println(" Agenda cheia");
    }


    public void removePessoa(String nome){
        for(int i= 0; i < 10; i++ ){
            if(agenda[i] != null && nome.equals(agenda[i].getNome()) ){
                agenda[i] = null;
                return;
            }
        }
        System.out.println("Está pessoa não está cadastrada");
    }


    // informa em que posição da agenda está a pessoa
    public int buscaPessoa(String nome){
        for(int i= 0; i < 10; i++ ){
            if(agenda[i] != null && nome.equals(agenda[i].getNome())){
                return i;
            }
        }
        return -1;
    }

    
    // imprime os dados de todas as pessoas da agenda
    public void imprimeAgenda(){
        for(int i=0; i<10; i++){
            if(agenda[i] == null){
                System.out.println("Contato vazio");
            }
            else{
                System.out.println("====================================================================");
                System.out.println("Nome: "+ agenda[i].getNome());
                System.out.println("Idade: " + agenda[i].getIdade());
                System.out.println("Altura: " + agenda[i].getAltura());
                System.out.println("====================================================================");
            }
            
        }

    }

    // imprime os dados da pessoa que está na posição “i” da agenda.
    public void imprimePessoa(int index){
        if (index < 0 || index >= 10 || agenda[index] == null) {
            System.out.println("Index não encontrado");
        }
        else {
            
            System.out.println("Nome: "+ agenda[index].getNome());
            System.out.println("Idade: " + agenda[index].getIdade());
            System.out.println("Altura: " + agenda[index].getAltura());
        }
    }

    
}
