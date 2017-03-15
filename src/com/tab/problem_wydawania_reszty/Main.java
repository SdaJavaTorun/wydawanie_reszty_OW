package com.tab.problem_wydawania_reszty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] N = {200,100,50, 20, 10, 5, 2, 1};
        int i = 0;
        int R;
        //L = najweksza mozliwa ilosc nominalu

        Scanner wpisz = new Scanner(System.in);
        System.out.println("Podaj wart. reszty: ");
        R = wpisz.nextInt();


        while(R > 0) {

            if(R >= N[i]) {
              int L = R / N[i];
                R = R - (N[i]*L);
                System.out.println("Nominal " + N[i] + " razy " + L);
            }
            i++;
            {
            }
        }
    }
}
