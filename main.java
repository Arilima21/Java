package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,medias;
        double[] notas = {8.5, 8.9, 4.5, 7.0, 1.5};

        exibeVetor(notas);
        a = maior(notas);
        b = menor(notas);
        medias = media(notas);
        double [] novo = retornandoVetor(notas);
        System.out.println("\nA maior nota é:" + a);
        System.out.println("\nA menor nota é:" + b);
        System.out.println("\n A media das notas são: " + medias);
        exibeVetor(novo);



    }


    public static void exibeVetor(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    public static double maior(double [] vet) {
        double a = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > a) {
                a = vet[i];
            }
        }
            return a;
    }

    public static double menor ( double[] vet) {
        double b = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] < b) {
                b = vet[i];
                }
            }
            return b;
        }

     public static double media (double[] vet){
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        return soma/vet.length;
     }

     public static double[] retornandoVetor(double [] vet){
        for(int i = 0; i < vet.length; i++){
            vet[i] = 2*vet[i];
        }
        return vet;
     }

    }

