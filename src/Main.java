public class Main {
    public static void main(String[] args) {
        //Risolvi queste operazioni di algebra con i boolean:
        //Poi compara le tue soluzioni con un programma Java
        //E testa la validità delle tue assunzioni

        //[A]: 2 <= 2 && !true

        boolean a = 2 <= 2 && !true;

        System.out.println(a);

        //[A] risulta false perché mentre (2 <= 2) è uguale a true, !true è uguale a false
        //quindi il risultato sarà false

        //[B]: !false && 3 > 2

        boolean b = !false && 3 > 2;

        System.out.println(b);

        //!false significa true ed essendo che 3 è maggiore di 2 (quindi anch'essa true), il boolean
        //sarà true

        //[C]: t= false, f= true , allora "!(!t || f)"

        boolean t= false;
        boolean f= true;

        System.out.println(!(!t) || f);

        //Entrambi i boolean a fine operazione diventano true

        //[D]: 6 > 6 ^ !(true && true);

        boolean d = 6 > 6 ^ !(true && true);

        System.out.println(d);

        //L'operatore ^ (XOR) darà true SOLO nel caso che i risultati siano DIVERSI.
        //Ecco perché in questo caso il risultato è false.
    }
}