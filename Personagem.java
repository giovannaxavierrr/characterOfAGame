import java.util.Scanner;

public class Personagem {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeClasse;
        int vez = 1;
        int verificar, rodada = 0;
        boolean estaJogando = true;

        //personagem 1
        Metricas personagem1 = new Metricas(); 
        System.out.print("Digite o nome do primeiro personagem: ");
        personagem1.name = scanner.nextLine();
        personagem1.escolherClasse();
        personagem1.nivel = 1; //inicia em 1
        personagem1.vida = 100; //max 100
        personagem1.mana = 70; //somente para a classe mago, max 100
        personagem1.forca = 50;
        switch(personagem1.classe) {
            case 1: nomeClasse = "Mago"; break;
            case 2: nomeClasse = "Guerreiro"; break;
            case 3: nomeClasse = "Arqueiro"; break;
            default: nomeClasse = "Classe desconhecida";
        }
        //personagem 2
        Metricas personagem2 = new Metricas(); 
        System.out.print("Digite o nome do segundo personagem: ");
        personagem2.name = scanner.nextLine();
        personagem2.escolherClasse();
        personagem2.nivel = 1; //inicia em 1
        personagem2.vida = 100; //max 100
        personagem2.forca = 70;
        switch(personagem2.classe) {
            case 1: nomeClasse = "Mago"; break;
            case 2: nomeClasse = "Guerreiro"; break;
            case 3: nomeClasse = "Arqueiro"; break;
            default: nomeClasse = "Classe desconhecida";
        }

        //jogo rolando
        personagem1.mostrarStatus();
        personagem1.desenharPersonagem();
        personagem2.mostrarStatus();
        personagem2.desenharPersonagem();
        

        while(estaJogando) {
        
            personagem1.choice();
            System.out.println();
            if(personagem1.escolhido == 1) {
                personagem1.atacar();
                personagem2.receberDano();
            } else if(personagem1.escolhido == 2) {
                personagem1.usarHabilidadeEspecial();
                personagem2.receberDanoEspecial();
            }
            if(personagem2.vida <= 0) {
                System.out.println(personagem1.name+" IS THE CHAMPIONNN!");
                break;
            }
            System.out.println();
            personagem2.choice();
            System.out.println();
            if(personagem2.escolhido == 1) {
                personagem2.atacar();
                personagem1.receberDano();
            } else if(personagem2.escolhido == 2) {
                personagem2.usarHabilidadeEspecial();
                personagem1.receberDanoEspecial();
                
            }
            if(personagem2.vida <= 0) {
                System.out.println(personagem2.name+" IS THE CHAMPIONNN!");
                break;
            }
            System.out.println();
            System.out.println("Verificar o status de cada jogador?\n1 - Sim\n2 - Nao, continuar jogo");
            verificar = scanner.nextInt();
            System.out.println();
            if (verificar == 1) {
                personagem1.mostrarStatus();
                personagem2.mostrarStatus();
            } else if (verificar == 2) {
                System.out.println("Continuando jogo...");
            } else {
                System.out.println("Invalido, selecione a opção 1 ou 2.");
                System.out.println("Verificar o status de cada jogador?\n1 - Sim\n2 - Nao, continuar jogo");
                verificar = scanner.nextInt();
            }
            System.out.println();
            rodada++;
            if(rodada == 3 || rodada == 5) {
                personagem1.subirNivel();
            } else if (rodada == 2 || rodada == 4) {
                personagem2.subirNivel();
            }
        }

    }
}