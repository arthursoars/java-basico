package edu.Artur.primeirasemana;
public class Boletim {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal >= 7) {
            System.out.println("Aprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
