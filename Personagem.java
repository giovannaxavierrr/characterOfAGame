public class Personagem {

    public static void main (String[] args) {

        //personagem 1
        Metricas personagem1 = new Metricas(); 
        personagem1.name = "Giovanna";
        personagem1.classe = "Mago"; //guerreiro, mago ou arqueiro
        personagem1.nivel = 1; //inicia em 1
        personagem1.vida = 100; //max 100
        personagem1.mana = 70; //somente para a classe mago, max 100
        personagem1.forca = 50;
        //personagem 2
        Metricas personagem2 = new Metricas(); 
        personagem2.name = "Sabrina";
        personagem2.classe = "Arqueiro"; //guerreiro, mago ou arqueiro
        personagem2.nivel = 1; //inicia em 1
        personagem2.vida = 100; //max 100
        personagem2.forca = 70;

        //jogo rolando
        System.out.println("Heroi criado: "+personagem1.name+" ("+personagem1.classe+")");
        personagem1.desenharPersonagem();
        System.out.println("Heroi criado: "+personagem2.name+" ("+personagem2.classe+")");
        personagem2.desenharPersonagem();
        personagem1.atacar();
        personagem2.receberDano();
        personagem2.atacar();
        personagem1.receberDano();
        personagem1.usarHabilidadeEspecial();
        personagem2.receberDanoEspecial();
        personagem1.subirNivel();
        personagem1.mostrarStatus();
        personagem2.mostrarStatus();
        personagem1.usarHabilidadeEspecial();
        personagem2.receberDanoEspecial();

    }
}