import java.util.Scanner;

public class Metricas {
    
    Scanner scanner = new Scanner(System.in);
    String name, nomeClasse;
    int escolhido, classe, nivel, vida, forca, mana;
    int danoLevado, verificar;

    public void escolherClasse() {
        System.out.println("Personagens: ");
        System.out.println("1 - Mago\t|\t2 - Guerreiro\t|\t3 - Arqueiro");
        System.out.print("Escolha sua opcao: ");
        classe = scanner.nextInt();
        if(classe <= 0 || classe > 3) {
            System.out.println("Invalido, tente novamente");
            System.out.print("Escolha sua opcao (de 1 a 3): ");
            classe = scanner.nextInt();
        }
    }
    
    public void choice() {
        System.out.println("Vez do jogador "+name);
        System.out.println("Qual seu proximo passo?\n1 - Atacar (golpe comum)\t|\t2 - Usar habilidade especial");
        escolhido = scanner.nextInt();
    }

    public void atacar() {
        
        if(classe == 1) {
            System.out.println(name+" lanca feitico! Causando 30 de dano.");
            mana -= 10;
        } else if(classe == 2) {
            System.out.println(name+" ataca com sua espada! Causando 30 de dano.");
            forca -= 10;

        } else if(classe == 3) {
            System.out.println(name+" lanca multiplas flechas! Causando 30 de dano.");
            forca -= 10;
        }
    }

    public void receberDano() { //reduz a vida do personagem
        danoLevado = vida - 30;
        if(danoLevado > 0) {
            vida = danoLevado;
            System.out.println(name+" levou 30 de dano. Vida atual: "+vida);
        } else {
            System.out.println(name+" foi derrotado!");
            vida = 0;
        }

    }

    public void usarHabilidadeEspecial() { //diferente para cada classe, ex: mago lança feitico, guerreiro usa golpe poderoso

        if(classe == 1) {
            System.out.println(name+" usa habilidade especial e lanca feitico atordoante!");
            mana -= 20;
            if(vida <= 95) {
                vida += 5;
                System.out.print("+5 vida. ");
            }
            System.out.println("Vida atual: "+vida+("\n-20 mana. Mana atual: "+mana));
        } else if(classe == 2) {
            System.out.println(name+" usa habilidade especial e da um golpe poderoso!");
            forca -= 30;
            System.out.println("-30 forca. Forca atual: "+forca);
        } else if(classe == 3) {
            System.out.println(name+" usa habilidade especial e lanca multiplas flechas!");
            forca -= 30;
            System.out.println("-30 força. Forca atual: "+forca);
        }
    }

    public void receberDanoEspecial() { //reduz a vida do personagem após ser atingido com habilidade especial

        danoLevado = vida - 40;
        if(danoLevado > 0) {
            vida = danoLevado;
            System.out.println(name+" levou 40 de dano. Vida atual: "+danoLevado);
        } else {
            System.out.println(name+" foi derrotado!");
            vida = 0;
        }

    }

    public void mostrarStatus() {

        switch(classe) {
            case 1: nomeClasse = "Mago"; break;
            case 2: nomeClasse = "Guerreiro"; break;
            case 3: nomeClasse = "Arqueiro"; break;
            default: nomeClasse = "Classe desconhecida";
        }
        System.out.print("Status: \nNome: "+name+" | Classe: "+nomeClasse+" | Nivel: "+nivel+" | Vida: "+vida+" | Forca: "+forca);
        if(classe == 1) {
            System.out.println(" | Mana: "+mana); 
        }
        System.out.println();
    }

    public void subirNivel() {

        nivel += 1;
        System.out.println(name+" subiu de nivel! Agora esta no nivel "+nivel);
        if(vida < 100) {
            vida += 5;
            System.out.println("Recompensa: +5 vida!");
        }
        forca += 5;
        if(classe == 1 && mana < 100) {
            mana +=10;
            System.out.println("Recompensa: +10 mana!");
        }
        System.out.println();
    }

    public void desenharPersonagem() {

        if(classe == 1) {
            System.out.println("                                                   \r\n" + //
                                "                                                   \r\n" + //
                                "                         -######   -               \r\n" + //
                                "                       ###+#####... -              \r\n" + //
                                "                     -#+######+  --..              \r\n" + //
                                "                    +-..-###-##+                   \r\n" + //
                                "                   +##+#########.                  \r\n" + //
                                "                   ##############                  \r\n" + //
                                "              .+######+#########++--.              \r\n" + //
                                "           +######-... .-.+    ..+###+-.           \r\n" + //
                                "         -#-####+..----.....+---. -#####+-         \r\n" + //
                                "         +##-###--..---.....-+-.---#####++.        \r\n" + //
                                "          ####+#.-.-###..-..###..-.+#--###         \r\n" + //
                                "            .+#-.+..---+-.--.-.... .#+#+           \r\n" + //
                                "              -..++-.   .+     --   -              \r\n" + //
                                "             -.  .--.---...-----     -             \r\n" + //
                                "            -.                        .            \r\n" + //
                                "            -                         .            \r\n" + //
                                "           ..                          .           \r\n" + //
                                "           -   .                   ..  .           \r\n" + //
                                "           ...--.  .           .-  .+.+            \r\n" + //
                                "            .-  -. .-         .--...               \r\n" + //
                                "                 .-.--.   .- .-  -                 \r\n" + //
                                "                   .+  +-.--+                      \r\n" + //
                                "                                                   \r\n" + //
                                "                                                   \r\n" + //
                                "                                                   ");

        } else if(classe == 2) {
            System.out.println("                                                    \r\n" + //
                                "                      .-....-.                     \r\n" + //
                                "                    --        ..                   \r\n" + //
                                "                 .--      . .  .+                  \r\n" + //
                                "                  -        . ...-+                 \r\n" + //
                                "              -  +        -+ .-  +                 \r\n" + //
                                "             .- +     +.+ .+-+  #                  \r\n" + //
                                "             .      .-  +--++-+                    \r\n" + //
                                "              -++-+-    +....+.                    \r\n" + //
                                "                     +.- .  + -.#                  \r\n" + //
                                "                    -   -.   .   -                 \r\n" + //
                                "                    -    .- .    ..                \r\n" + //
                                "                   +.+-  .-.+  .+ +                \r\n" + //
                                "                   -+.          .+#                \r\n" + //
                                "                   -+ -        -.#-                \r\n" + //
                                "                    -  +-    -+  +                 \r\n" + //
                                "                    -.   .       -                 \r\n" + //
                                "                  .-.-   ..     ..-.               \r\n" + //
                                "                ++  -.#   -    +.-  -+             \r\n" + //
                                "                - +     ++-.++     +.+             \r\n" + //
                                "                 ..-.            .-.-              \r\n" + //
                                "                   .-.+        -.-.                \r\n" + //
                                "                      .-.+. +.--                   \r\n" + //
                                "                         ----                      \r\n" + //
                                "                                                   \r\n" + //
                                "  ");
        } else {
            System.out.println("                                                   \r\n" + //
                                "                          .-                       \r\n" + //
                                "                          .    ..                  \r\n" + //
                                "                          .       .                \r\n" + //
                                "                                   .   ..          \r\n" + //
                                "                                   .+.             \r\n" + //
                                "                                   .#+             \r\n" + //
                                "                  +###.    .  .++##-  -            \r\n" + //
                                "                 +#####+  #####-       -           \r\n" + //
                                "                 #####+###+++.          .          \r\n" + //
                                "                 #+###+###.             .          \r\n" + //
                                "                 #+########            .           \r\n" + //
                                "                 ##+#######.           .           \r\n" + //
                                "                .###++######           -           \r\n" + //
                                "                .-##+ .####+                       \r\n" + //
                                "                  --.  -####+  .                   \r\n" + //
                                "                       +#######                    \r\n" + //
                                "                       #########                   \r\n" + //
                                "                       #####-  ###                 \r\n" + //
                                "                       -####    ###                \r\n" + //
                                "                       .###+     ###               \r\n" + //
                                "                        ###-      ###              \r\n" + //
                                "                                                   \r\n" + //
                                "                                                   ");
        }
    }
}
