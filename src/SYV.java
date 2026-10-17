import java.util.Scanner;
import java.util.Random;
// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int resistencia;
    int vida_hp;
    String imagen;
    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int resistencia,
            int vida_hp,
            String imagen)
             {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vida_hp = vida_hp;
        this.imagen = imagen;
    }
}
class SuperHero extends Personaje {
    // definir el constructor
    public SuperHero(
        String nombre,
        int fuerza,
        int resistencia,
        int vida_hp,
        String imagen)
        {
        super(nombre, fuerza, resistencia, vida_hp,imagen);
    }
}
class Villano extends Personaje {
    // definir el constructor
    public Villano(
        String nombre,
        int fuerza,
        int resistencia,
        int vida_hp,
        String imagen){
            super(nombre, fuerza, resistencia, vida_hp,imagen);
    }
}
public class SYV {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        //#region trump
        Villano trump = new Villano("Donald Trump", 32, 4, 108,"                                                             \r\n" + //
                        "                                                             \r\n" + //
                        "                         ···                                 \r\n" + //
                        "                    ·#####·· ·····##····                     \r\n" + //
                        "               ·##·#######·             ·#                   \r\n" + //
                        "            ·#·##################···                         \r\n" + //
                        "          ·###·   ·##############· ··####·####·##·           \r\n" + //
                        "          ·· ·     ·###############·····#####··##·           \r\n" + //
                        "          #·  ·    ·##########################··             \r\n" + //
                        "          #·  ··    ····#########···######·   ·#·            \r\n" + //
                        "         ·#··   ·      ········##· ··#####·    ##            \r\n" + //
                        "         ··#·                         ###··    ##·           \r\n" + //
                        "         ·###                        ######· ·· #·           \r\n" + //
                        "          ##·                     ·####·###· ·· ··           \r\n" + //
                        "         ·##··        ··      ···  ·#######· ·· ··           \r\n" + //
                        "          #·        ·########·###·##·  ···#· #·              \r\n" + //
                        "          ··   ·#   · ···       ·    ···#·····    ·          \r\n" + //
                        "           #   ·#·   ·##### ·  ###··##·######·   ··          \r\n" + //
                        "           ·   ·##·        ·   ·######··#####·  ##           \r\n" + //
                        "            ··· ·##    ·####   ·############    #·           \r\n" + //
                        "             #   ##     ####·  ·####··#####·    ·            \r\n" + //
                        "              ·· #·       ·    ####·#· ####·                 \r\n" + //
                        "                 ··         ·     ·#### ·###·                \r\n" + //
                        "                  ·       ·#·   ··######·####                \r\n" + //
                        "                   ·     ··       ···#· ####·                \r\n" + //
                        "                    ·    ·    ····  ·###··#·                 \r\n" + //
                        "                     ·         ·#########·                   \r\n" + //
                        "                            ·## ·######·                     \r\n" + //
                        "                                                             \r\n" + //
                        "                                                             \r\n ");
        //#endregion

        //#region epstein
        Villano epstein = new Villano("Jeffrey Epstein", 35, 20, 130,"                       .::.                            \r\n" + //
                        "                    :+..--:  .#*=-:                    \r\n" + //
                        "              .+%++#+-:=*-=##*+==-%*.                  \r\n" + //
                        "            --%--+*=+=-#-.==*=%#.-#*%+.                \r\n" + //
                        "         :. =*+. =:.=-:::.. -::*%#%:-*#-               \r\n" + //
                        "        .- .%@=-.*#=-*%#+#=:##%@@@@@@#*+               \r\n" + //
                        "       .++:%@-=-*:. ::.     ..+@@*%@@*-+=              \r\n" + //
                        "        *- .#-=                *@@*+@%@##+             \r\n" + //
                        "        =.*:.**              .:=@@@-%*-%#+             \r\n" + //
                        "       .*+--= ::               .+@@=+@+=%++            \r\n" + //
                        "        +* ..-  .         :    -:....+@#=%+-           \r\n" + //
                        "        -.  .* .*      .. + :#%@@@%@%.*%-.*            \r\n" + //
                        "        :#:.. +@: :*@#*@@%: :%@#+%##%*.%*.=            \r\n" + //
                        "         -*+  -#  --++*##=   #@%: .-::: -#@.           \r\n" + //
                        "          :%+::*      .::    :@@=    %%  %#.           \r\n" + //
                        "           .=.##      .       =*#:   @@- *:            \r\n" + //
                        "            = *         :-   :@@@=*. #@= +=            \r\n" + //
                        "             -- .      .+    -=#@@+:#..@-:             \r\n" + //
                        "              ::+-     *.      .=%@@@#.#-%             \r\n" + //
                        "                 -.   *-..-*#=%#++**@%- -@:            \r\n" + //
                        "                  -   .      .=%@@@@@@+.#@+            \r\n" + //
                        "                   :-         +@@@@@@= *@@+            \r\n" + //
                        "                   : ::          .:@@.#@@@#            \r\n" + //
                        "                   .=  .-        *@%:%@@@@:            \r\n" + //
                        "                   .%-    .::-+**#*%@@@@%.             \r\n" + //
                        "                     =.      :%@@@@@@@#-               \r\n" + //
                        "                               -@*--.                  \r\n" + //
                        "                                                       ");
        //#endregion

       //#region netan
        Villano netan = new Villano("Benjamin Netanyahu", 53, 20, 150,"                     :=*##%%##*=.                      \r\n" + //
                        "               .=%@*--#%*++==-*#*+#%#-                 \r\n" + //
                        "            =%*--=-*+=---:.:=+%@#*%=.                  \r\n" + //
                        "         -=:.  .=.    .=:.=#@*+#%%%=:.  .+%-           \r\n" + //
                        "      .-:.  :--   .==+=+=.-=+#%@@@#=:..  .+@%:         \r\n" + //
                        "     +#. .:.  :=.:.=%=-#+-:=#%#+***:.   .=+@@%=        \r\n" + //
                        "    *=+-::.--:===. ...-.   ..           =@#%@*+..      \r\n" + //
                        "  .#@**--**=*:..:.   ..-#=.             .##%#%++-      \r\n" + //
                        "  +@%%#%#:  :-     .                     .-.+:-.#-     \r\n" + //
                        " .*%#%@*:...                                ..  -#.    \r\n" + //
                        " :##-#@-:.                                  .   .#:    \r\n" + //
                        " .-..=#*-                                   .--:.#:    \r\n" + //
                        "  : .=%+:                         .-:        .=.=*.:%#.\r\n" + //
                        "  ::+=*#-                 .:...               .:**+*..=\r\n" + //
                        "  :+..+++.        ..          :+:   .         :*%: ...=\r\n" + //
                        "   :  :#+.           .:::..      .   -*#-     :@#. :=--\r\n" + //
                        "%@@+   :-.                         +#:  .:-   .%+   :+.\r\n" + //
                        "=   .  .+.     .##%@@%=: .      =#.            #%. .:= \r\n" + //
                        "--..  :%#.   .=:     .:--   :       .::-+.     .*.: =: \r\n" + //
                        " -+.   +@=       :=:.     :%+   ..:%*-##-++    :-.#%#. \r\n" + //
                        "  -:   *@+      :=*#*+==-  .%=           ==    +-  -+  \r\n" + //
                        "  .*:+=.=:    :%=          .@@.      .:.=.     ..*#=   \r\n" + //
                        "    +@%*-*.     .+:-.       %@:                .+      \r\n" + //
                        "    .*%=:.-                 +@-                .*.     \r\n" + //
                        "      .+*.=              :.+@@@-  ..           .*.     \r\n" + //
                        "          +:           .=.-%@@@@-  :*          .=      \r\n" + //
                        "          :=          =-    *%#=     .-        ..      \r\n" + //
                        "           -.       :=                 =:      .-      \r\n" + //
                        "                    -           *             :@=      \r\n" + //
                        "            -*          -=:..*%-. ..-..      .*@-      \r\n" + //
                        "            :%*.         .+=@%*@#=-         .#@%.      \r\n" + //
                        "            .#@%:                          #@@@+       \r\n" + //
                        "             .%@@@=        -*@@@@=:      .%@@@*        \r\n" + //
                        "              .%@@@@*.                 .#@@@@%.        \r\n" + //
                        "               .@@@@@@%-             =%@@@@@@+         \r\n" + //
                        "                +@@@@@@@@@%-+=-+-#%@@@@@@@@@#          ");
//#endregion

    String vacio;
    Random aleatorio = new Random();
    SuperHero steve = new SuperHero("Steve", 25, 14, 100,"");
    SuperHero leon = new SuperHero("Leon Scott Kennedy", 40, 17, 125,"");
    SuperHero link = new SuperHero("Link el Heroe del Tiempo", 42, 25, 135,"");
    String [] enemi1 = {trump.nombre, epstein.nombre, netan.nombre};
    int [] enemi2 = {trump.fuerza, epstein.fuerza, netan.fuerza};
    int [] enemi3 = {trump.resistencia , epstein.resistencia , netan.resistencia };
    double [] enemi4 = {trump.vida_hp, epstein.vida_hp, netan.vida_hp};
    String [] enemi5 = {trump.imagen, epstein.imagen, netan.imagen};
    String [] equi1 = {steve.nombre, leon.nombre, link.nombre};
    int [] equi2 = {steve.fuerza, leon.fuerza, link.fuerza};
    int [] equi3 = {steve.resistencia, leon.resistencia, link.resistencia};
    double [] equi4 = {steve.vida_hp, leon.vida_hp, link.vida_hp};
    String [] curar_item = {"manzana encantada", "hierva roja + verde", "pocion de hada"};
    int [] curar_cantidad = {1, 1, 1};
    final int[] SALUD_INICIAL = {100, 125, 135};
    System.out.println("SALVA A LOS NIÑOS");
    System.out.println("");
    System.out.println("Presiona ENTER para comezar");
    vacio = teclado.nextLine();
    System.out.println("El objetivo de tu equipo es rescatar a los niños de una isla en el caribe");
    System.out.println("");
    System.out.println("Para salvar los niños necesitamos derrotar a quienes lo custodian");
    Thread.sleep(4500);
    int e=0;
    int t=0;
    while (e != 3) {
        double dano_recibido;
        System.out.println("Ahora te enfrentas a "+enemi1[e]);
        Thread.sleep(1500);
        System.out.println(enemi5[e]);
        System.out.println("Controlas a "+equi1[t]);
        System.out.println("");
        System.out.println("escoja la habilidad");
        System.out.println("");
        System.out.println("1. ATACAR");
        System.out.println("2. FORTALECER");
        System.out.println("3. CURAR");
        System.out.println("4. AUMENTAR ATAQUE");
        System.out.println("5. MOSTRAR ESTADISTICAS");
        int accion = teclado.nextInt();
        System.out.println("");
        switch (accion) {
            case 1:
               System.out.println("escojistes atacar");
                dano_recibido= equi2[t] - ((equi2[t])*enemi3[e]/100);
                enemi4[e]=enemi4[e]-dano_recibido;
                System.out.println("");
                break;
            case 2:
                System.out.println("escojistes fortalecer");
                equi3[t] = equi3[t] + 10;
                System.out.println("");
                break;
            case 3:
                if (curar_cantidad[t]==1) {
                    System.out.println("escojistes curar");
                    System.out.println("Has usado: "+curar_item[t]);
                    equi4[t]=SALUD_INICIAL[t];
                    System.out.println("");
                    curar_cantidad[t]=curar_cantidad[t]-1;
                } else {
                    System.out.println("No tenias nada para curarte, le regalas el turno al enemigo");
                }
                break;
            case 4:
                System.out.println("escojistes aumentar ataque");
                System.out.println("");
                equi2[t] = equi2[t] + 20;
                break;
            case 5:
                System.out.println("escojistes mostrar estadisticas");
                System.out.println("TU EQUIPO");
                System.out.println("");
                System.out.println("Nombre: "+equi1[t]);
                System.out.println("Fuerza: "+equi2[t]);
                System.out.println("Resistencia: "+equi3[t]);
                System.out.println("Salud: "+equi4[t]);
                System.out.println("");
                System.out.println("");
                System.out.println("PEDOFILOS");
                System.out.println("");
                System.out.println("Nombre: "+enemi1[e]);
                System.out.println("Fuerza: "+enemi2[e]);
                System.out.println("Resistencia: "+enemi3[e]);
                System.out.println("Salud: "+enemi4[e]);
                System.out.println("");
                Thread.sleep(6000);
                break;
            default:
                System.out.println("Por escoger un numero que no es, pierdes un turno");
                break;
        }
        if (enemi4[e] <= 0) {
            System.out.println("Has derrotado a "+enemi1[e]);
            e=e+1;
            if (e >= enemi1.length) {
                break;
            }
        }
        if (accion == 5){
            System.out.println("");
        }   else {
                    int accion_enemigo = aleatorio.nextInt(3);
                    switch (accion_enemigo) {
                        case 0:
                        //atacar
                        int doble_dano = aleatorio.nextInt(11);
                        if (doble_dano>=7){
                            dano_recibido= enemi2[e] - ((enemi2[e])*equi3[t]/100.0);
                            equi4[t]= equi4[t]-(2*dano_recibido);
                            System.out.println("El enemigo te ataca con doble daño");
                        } else {
                            dano_recibido= enemi2[e] - ((enemi2[e])*equi3[t]/100.0);
                            equi4[t]= equi4[t]-dano_recibido;
                            System.out.println("El enemigo te ataca");
                        }
                        break;
                        case 1:
                        //atacar
                        doble_dano = aleatorio.nextInt(11);
                        if (doble_dano>=7){
                            dano_recibido= enemi2[e] - ((enemi2[e])*equi3[t]/100.0);                           
                            equi4[t]= equi4[t]-(2*dano_recibido);
                            System.out.println("El enemigo te ataca con doble daño");
                        } else {
                            dano_recibido= enemi2[e] - ((enemi2[e])*equi3[t]/100.0);
                            equi4[t]= equi4[t]-dano_recibido;
                            System.out.println("El enemigo te ataca");
                            }
                        break;
                        case 2:
                            //endurecer
                            enemi3[e]= enemi3[e]+ 5;
                            System.out.println("El enemigo se fortalece");
                            break;
                        default:
                        break;
                    }

        }
        System.out.println("");
       if (equi4[t] <= 0) {
        System.out.println("");
            System.out.println(equi1[t] + " ha sido derrotado...");
            t++;
            if (t >= equi1.length) {
                System.out.println("");
                System.out.println("LOS NIÑOS NO HAN SIDO SALVADOS...");
                System.out.println("");
                System.out.println("");  
                break;
            }
        System.out.println("");
        System.out.println("Ahora controlas a " + equi1[t]);
        }
    }     
    if (e>= enemi1.length){
        System.out.println("Has derrotado a todos los enemigos");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("");
        Thread.sleep(600);
        System.out.println("");
        Thread.sleep(700);
        System.out.println("");
        System.out.println("--LOS NIÑOS HAN SIDO SALVADOS--");
        System.out.println("");
        System.out.println("");
        Thread.sleep(700);
        System.out.println("AHORA EL MOSAD VENDRA POR TI....");

    teclado.close();
    }
}
}