/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclespares;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class ContadorDePares {
    public int nume;
  
    Scanner sc=new Scanner(System.in);
    
    
    public int pedirDoWhile(){
        System.out.println("escriba un numero");
        nume=sc.nextInt();
        return nume;
    }
    public void verDoWhile(){
        int sum=0;
        int cont=0;
        
        do{
            nume=pedirDoWhile();
            if(nume%2==0)
                sum=sum+nume;
            cont++;
        }while(cont!=5);
        System.out.println("a suma dos pares e "+sum);
            
            
        }
    }
    
    

