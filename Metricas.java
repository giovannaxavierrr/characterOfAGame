public class Metricas {
    
    String name, classe;
    int nivel, vida, forca, mana;

    public void atacar() {
        
        if(classe.equalsIgnoreCase("mago")) {
            System.out.println(name+" lanca feitico! Causando 30 de dano.");
            mana -= 10;
        } else if(classe.equalsIgnoreCase("guerreiro")) {
            System.out.println(name+"Guerreiro ataca com sua espada! Causando 30 de dano.");
            forca -= 10;

        } else if(classe.equalsIgnoreCase("arqueiro")) {
            System.out.println(name+" lanca multiplas flechas! Causando 30 de dano.");
            forca -= 10;
        }
    }

    public void receberDano() { //reduz a vida do personagem
        int danoLevado = vida - 30;
        if(danoLevado > 0) {
            vida = danoLevado;
            System.out.println(name+" levou 30 de dano. Vida atual: "+vida);
        } else {
            System.out.println(name+" foi derrotado!");
        }

    }

    public void usarHabilidadeEspecial() { //diferente para cada classe, ex: mago lança feitico, guerreiro usa golpe poderoso

        if(classe.equalsIgnoreCase("mago")) {
            System.out.println(name+" usa habilidade especial e lanca feitico atordoante!");
            mana -= 20;
            vida += 5;
            System.out.println("+5 vida. Vida atual: "+vida+("\n-20 mana. Mana atual: "+mana));
        } else if(classe.equalsIgnoreCase("guerreiro")) {
            System.out.println(name+" usa habilidade especial e da um golpe poderoso!");
            forca -= 30;
            System.out.println("-30 força. Forca atual: "+forca);
        } else if(classe.equalsIgnoreCase("arqueiro")) {
            System.out.println(name+" usa habilidade especial e lanca multiplas flechas!");
            forca -= 30;
            System.out.println("-30 força. Forca atual: "+forca);
        }
    }

    public void receberDanoEspecial() { //reduz a vida do personagem após ser atingido com habilidade especial

        int danoLevado = vida - 40;
        if(danoLevado > 0) {
            vida = danoLevado;
            System.out.println(name+" levou 40 de dano. Vida atual: "+danoLevado);
        } else {
            System.out.println(name+" foi derrotado!");
        }

    }

    public void mostrarStatus() {

        System.out.print("Status: \nNome: "+name+" | Classe: "+classe+" | Nivel: "+nivel+" | Vida: "+vida+" | Forca: "+forca);
        if(classe.equalsIgnoreCase("mago")) {
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
        if(classe.equalsIgnoreCase("mago") && mana < 100) {
            mana +=10;
            System.out.println("Recompensa: +10 mana!");
        }
        

    }

    public void desenharPersonagem() {
        if(classe.equalsIgnoreCase("mago")) {
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

        } else if(classe.equalsIgnoreCase("guerreiro")) {
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
