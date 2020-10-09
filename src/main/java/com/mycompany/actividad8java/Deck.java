/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad8java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import com.mycompany.actividad8java.Card.*;
/**
 *
 * @author felip
 */
public class Deck {
    
public static void Deck(){
        
                
                
        //Tréboles
        Card c1 = new Card ("Tréboles","Negro", "2");
        Card c2 = new Card ("Tréboles","Negro", "3");
        Card c3 = new Card ("Tréboles","Negro", "4");
        Card c4 = new Card ("Tréboles","Negro", "5");
        Card c5 = new Card ("Tréboles","Negro", "6");
        Card c6 = new Card ("Tréboles","Negro", "7");
        Card c7 = new Card ("Tréboles","Negro", "8");
        Card c8 = new Card ("Tréboles","Negro", "9");
        Card c9 = new Card ("Tréboles","Negro", "10");
        Card c10 = new Card ("Tréboles","Negro", "A");
        Card c11 = new Card ("Tréboles","Negro", "J");
        Card c12 = new Card ("Tréboles","Negro", "Q");
        Card c13 = new Card ("Tréboles","Negro", "K");
        
        //Corazones
        Card c14 = new Card ("Corazones","Rojo", "2");
        Card c15 = new Card ("Corazones","Rojo", "3");
        Card c16 = new Card ("Corazones","Rojo", "4");
        Card c17 = new Card ("Corazones","Rojo", "5");
        Card c18 = new Card ("Corazones","Rojo", "6");
        Card c19 = new Card ("Corazones","Rojo", "7");
        Card c20 = new Card ("Corazones","Rojo", "8");
        Card c21 = new Card ("Corazones","Rojo", "9");
        Card c22 = new Card ("Corazones","Rojo", "10");
        Card c23 = new Card ("Corazones","Rojo", "A");
        Card c24 = new Card ("Corazones","Rojo", "J");
        Card c25 = new Card ("Corazones","Rojo", "Q");
        Card c26 = new Card ("Corazones","Rojo", "K");
        
        //Picas
        Card c27 = new Card ("Picas","Negro", "2");
        Card c28 = new Card ("Picas","Negro", "3");
        Card c29 = new Card ("Picas","Negro", "4");
        Card c30 = new Card ("Picas","Negro", "5");
        Card c31 = new Card ("Picas","Negro", "6");
        Card c32 = new Card ("Picas","Negro", "7");
        Card c33 = new Card ("Picas","Negro", "8");
        Card c34 = new Card ("Picas","Negro", "9");
        Card c35 = new Card ("Picas","Negro", "10");
        Card c36 = new Card ("Picas","Negro", "A");
        Card c37 = new Card ("Picas","Negro", "J");
        Card c38 = new Card ("Picas","Negro", "Q");
        Card c39 = new Card ("Picas","Negro", "K");

        //Corazones
        Card c40 = new Card ("Diamantes","Rojo", "2");
        Card c41 = new Card ("Diamantes","Rojo", "3");
        Card c42 = new Card ("Diamantes","Rojo", "4");
        Card c43 = new Card ("Diamantes","Rojo", "5");
        Card c44 = new Card ("Diamantes","Rojo", "6");
        Card c45 = new Card ("Diamantes","Rojo", "7");
        Card c46 = new Card ("Diamantes","Rojo", "8");
        Card c47 = new Card ("Diamantes","Rojo", "9");
        Card c48 = new Card ("Diamantes","Rojo", "10");
        Card c49 = new Card ("Diamantes","Rojo", "A");
        Card c50 = new Card ("Diamantes","Rojo", "J");
        Card c51 = new Card ("Diamantes","Rojo", "Q");
        Card c52 = new Card ("Diamantes","Rojo", "K");
        
        LinkedList <Card> deckCards = new LinkedList <Card> ();

        deckCards.add(c1);
        deckCards.add(c2);
        deckCards.add(c3);
        deckCards.add(c4);
        deckCards.add(c5);
        deckCards.add(c6);
        deckCards.add(c7);
        deckCards.add(c8);
        deckCards.add(c9);
        deckCards.add(c10);
        deckCards.add(c11);
        deckCards.add(c12);
        deckCards.add(c13);
        deckCards.add(c14);
        deckCards.add(c15);
        deckCards.add(c16);
        deckCards.add(c17);
        deckCards.add(c18);
        deckCards.add(c19);
        deckCards.add(c20);
        deckCards.add(c21);
        deckCards.add(c22);
        deckCards.add(c23);
        deckCards.add(c24);
        deckCards.add(c25);
        deckCards.add(c26);
        deckCards.add(c27);
        deckCards.add(c28);
        deckCards.add(c29);
        deckCards.add(c30);
        deckCards.add(c31);
        deckCards.add(c32);
        deckCards.add(c33);
        deckCards.add(c34);
        deckCards.add(c35);
        deckCards.add(c36);
        deckCards.add(c37);
        deckCards.add(c38);
        deckCards.add(c39);
        deckCards.add(c40);
        deckCards.add(c41);
        deckCards.add(c42);
        deckCards.add(c43);
        deckCards.add(c44);
        deckCards.add(c45);
        deckCards.add(c46);
        deckCards.add(c47);
        deckCards.add(c48);
        deckCards.add(c49);
        deckCards.add(c50);
        deckCards.add(c51);
        deckCards.add(c52);
        
         System.out.println("Bienvenido al sistema de cartas.");
         System.out.println("Shuffle. Se mezcló el Deck."); 

        //numero random 1
        Random numR = new Random();
        int nr1 = numR.nextInt(deckCards.size());
        
        //for (Card card : deckCards){
            
        //System.out.println(card.getPalo() + " " + card.getColor() + " " + card.getValor());
             
        //}

       //CARTA 1
        deckCards.remove(nr1);
        System.out.println("Head:"); 
        System.out.println("La primer carta es: " + deckCards.get(nr1)); 
        System.out.println("Quedan " + deckCards.size() + " cartas");
        
        System.out.println("-----"); 
        
        
   
        //numero random 2
        Random numR2 = new Random();
        int nr2 = numR2.nextInt(deckCards.size());
        
        //CARTA 2
        System.out.println("Pick:"); 
        deckCards.remove(nr2);
        System.out.println("Carta removida: " + deckCards.get(nr2)); 
        System.out.println("Quedan " + deckCards.size() + " cartas");
        System.out.println("-----"); 
        
        //numero random 3
        Random numR3 = new Random();
        int nr3 = numR3.nextInt(deckCards.size());
        
        //CARTA 3
        System.out.println("Hand:");
        deckCards.remove(nr3);
        System.out.println("Carta removida: " + deckCards.get(nr3)); 
        
        
        //numero random 4
        Random numR4 = new Random();
        int nr4 = numR4.nextInt(deckCards.size());
        
        //CARTA 4
        deckCards.remove(nr4);
        System.out.println("Carta removida: " + deckCards.get(nr4)); 
        
        
        //numero random 5
        Random numR5 = new Random();
        int nr5 = numR2.nextInt(deckCards.size());
        
        //CARTA 5
        deckCards.remove(nr5);
        System.out.println("Carta removida: " + deckCards.get(nr5)); 
        
        
        //numero random 6
        Random numR6 = new Random();
        int nr6 = numR6.nextInt(deckCards.size());
        
        //CARTA 6
        deckCards.remove(nr6);
        System.out.println("Carta removida: " + deckCards.get(nr6)); 
        
        
        //numero random 7
        Random numR7 = new Random();
        int nr7 = numR7.nextInt(deckCards.size());
        
        //CARTA 7
         
        deckCards.remove(nr7);
        System.out.println("Carta removida: " + deckCards.get(nr7)); 
        System.out.println("Quedan " + deckCards.size() + " cartas");
        System.out.println("-----"); 
        System.out.println("Gracias por jugar.");
        System.out.println("Felipe Guadalupe Rodríguez Ramírez"); 
        System.out.println("2795588"); 
        System.out.println("Actividad 8. Java"); 
    }
    
}
