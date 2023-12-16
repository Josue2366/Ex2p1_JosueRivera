/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_josuerivera;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author josue
 */
public class Ex2P1_JosueRivera {
static Scanner sc = new Scanner(System.in);
static Scanner cs = new Scanner(System.in);
static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        System.out.println("//////menu//////");
        System.out.println("1.– Kingdom Hearts Re-Re:Coded! ");
        System.out.println("2. Salir");
        int opcion = sc.nextInt();
        while (opcion < 1 || opcion > 2){
            System.out.println("error");
            System.out.println("//////menu//////");
            System.out.println("1.– Kingdom Hearts Re-Re:Coded! ");
            System.out.println("2. ");
            opcion = sc.nextInt();
        }
        while(opcion == 1){
            switch (opcion){
            case 1:
                Items item = new Items();
                Personajes per = new Personajes();
                ArrayList<Items> items = new ArrayList<>();
                ArrayList<Personajes> character = new ArrayList<>();
                ArrayList<Personajes> recerva = new ArrayList<>();
                Personajes Sora = new Personajes("Sora",300,300,75,15);
                Personajes Donald = new Personajes("Donald",150,450,45,10);
                Personajes Goofy = new Personajes("Goofy",450,100,150,50);
                character.add(Sora);
                character.add(Donald);
                character.add(Goofy);
                Personajes Mickey = new Personajes("Mickey",100,500,150,35);
                Personajes Roxas = new Personajes("Roxas",300,300,15,75);
                Personajes Kairi = new Personajes("Kairi",200,200,50,15);
                recerva.add(Mickey);
                recerva.add(Roxas);
                recerva.add(Kairi);
                Items pocion = new Items("Pocion",50,0);
                Items Ether = new Items("Ether",0,50);
                Items Elixir = new Items("Elixir",100,100);
                items.add(pocion);
                items.add(Ether);
                items.add(Elixir);
                for (int i = 1; i <= 20; i++) {
                    System.out.println("entraste al cuarto "+i); 
                    int cuarto = rand.nextInt((5-1)+1)+1;
                    switch(cuarto){
                        case 1:
                            int heartless = rand.nextInt(4-1)+1;
                            System.out.println("te encontraste con "+heartless+" Heartless");
                            int heartless_vida = 75*heartless;
                            int attack_heartless = 25 * heartless;
                            while(heartless_vida > 0){
                                
                                per.imprimir(character);
                                int perso = sc.nextInt();
                                while (perso < 0 || perso > 2){
                                    System.out.println("numero invaliso vuelvalo a meter");
                                    per.imprimir(character);
                                    perso = sc.nextInt();
                                }
                                Personajes player = character.get(perso);
                                int vida_perso = player.getHp();
                                int magia_perso = player.getMp();
                                int Attack_perso = player.getAttack();
                                int def_perso = (attack_heartless*(player.getDefense()/100));
                                System.out.println("////menu////");
                                System.out.println("1. Attack");
                                System.out.println("2. Magic");
                                System.out.println("3. Items");
                                System.out.println("4. Party");
                                int menu = sc.nextInt();
                                while(menu < 1 || menu > 4){
                                    System.out.println("error");
                                    System.out.println("////menu////");
                                    System.out.println("1. Attack");
                                    System.out.println("2. Magic");
                                    System.out.println("3. Items");
                                    System.out.println("4. Party");
                                    menu = sc.nextInt();
                                }
                                switch(menu){
                                    case 1:
                                        System.out.println(player.getName()+" ataco!");
                                        heartless_vida = heartless_vida - Attack_perso;
                                        System.out.println(player.getName()+" recibio un golpe");
                                        vida_perso = vida_perso - (attack_heartless - def_perso);
                                        player.setHp(vida_perso);
                                        if (heartless_vida <= 0){
                                            heartless_vida = 0;
                                        }
                                        System.out.println("los Heartless les queda:"+heartless_vida);
                                        if (vida_perso <= 0){
                                            character.remove(player);
                                        }
                                        break;
                                        
                                    case 2:
                                        if (magia_perso <= 0){
                                            System.out.println("no tienes suficiente Mp");
                                            break;
                                        }
                                        System.out.println("1. - Blizzard 50Mp - 50DMG");
                                        System.out.println("2. - Firaga 25Mp - 25DMG");
                                        System.out.println("3. - Gravity 75Mp - 100DMG");
                                        int magic = sc.nextInt();
                                        while(magic < 1 || magic > 3){
                                            System.out.println("error");
                                            System.out.println("1. - Blizzard 50Mp - 50DMG");
                                            System.out.println("2. - Firaga 25Mp - 25DMG");
                                            System.out.println("3. - Gravity 75Mp - 100DMG");
                                        }
                                        switch(magic){
                                            case 1:
                                                magia_perso -= 50;
                                                heartless_vida -= 50;
                                                System.out.println(player.getName()+" uso Blizzard");
                                                player.setMp(magia_perso);
                                                if(magia_perso <= 0){
                                                    magia_perso = 0;
                                                }
                                                player.setMp(magia_perso);
                                                System.out.println(player.getName()+" recibio un golpe");
                                                vida_perso = vida_perso - (attack_heartless - def_perso);
                                                player.setHp(vida_perso);
                                                if (heartless_vida <= 0){
                                                    heartless_vida = 0;
                                                }
                                                System.out.println("los Heartless les queda:"+heartless_vida);
                                                if (vida_perso <= 0){
                                                    character.remove(player);
                                                }
                                       
                                                break;
                                                
                                                
                                            case 2:
                                                magia_perso -= 25;
                                                heartless_vida -= 25;
                                                System.out.println(player.getName()+" uso Firaga");
                                                player.setMp(magia_perso);
                                                if(magia_perso <= 0){
                                                    magia_perso = 0;
                                                }
                                                player.setMp(magia_perso);
                                                System.out.println(player.getName()+" recibio un golpe");
                                                vida_perso = vida_perso - (attack_heartless - def_perso);
                                                player.setHp(vida_perso);
                                                if (heartless_vida <= 0){
                                                    heartless_vida = 0;
                                                }
                                                System.out.println("los Heartless les queda:"+heartless_vida);
                                                if (vida_perso <= 0){
                                                    character.remove(player);
                                                }
                                        
                                                break;
                                                
                                            case 3:
                                                magia_perso -= 75;
                                                heartless_vida -= 100;
                                                System.out.println(player.getName()+" uso Gravity");
                                                if(magia_perso <= 0){
                                                    magia_perso = 0;
                                                }
                                                player.setMp(magia_perso);
                                                System.out.println(player.getName()+" recibio un golpe");
                                                vida_perso = vida_perso - (attack_heartless - def_perso);
                                                player.setHp(vida_perso);
                                                if (heartless_vida <= 0){
                                                    heartless_vida = 0;
                                                }
                                                System.out.println("los Heartless les queda:"+heartless_vida);
                                                if (vida_perso <= 0){
                                                    character.remove(player);
                                                }
                                                break;
                                        }
                                        if (vida_perso <= 0){
                                            character.remove(player);
                                        }
                                        break;
                                        
                                    case 3:
                                        if (items.size() == 0){
                                            System.out.println("no tiene items para usar");
                                            break;
                                        }
                                        item.imprimir(items);
                                        System.out.println("Elegir un item:");
                                        int objeto = sc.nextInt();
                                        while(objeto >= items.size()){
                                            System.out.println("error");
                                            item.imprimir(items);
                                            System.out.println("Elegir un item:");
                                            objeto = sc.nextInt();
                                        }
                                        Items objetos = items.get(objeto);
                                        vida_perso += objetos.getHp();
                                        player.setHp(vida_perso);
                                        magia_perso += objetos.getMp();
                                        player.setMp(magia_perso);
                                        items.remove(items.get(objeto));
                                        System.out.println(player.getName()+" uso "+objetos.getName());
                                        System.out.println(player.getName()+" recibio un golpe");
                                        vida_perso = vida_perso - (attack_heartless - def_perso);
                                        player.setHp(vida_perso);
                                        if (heartless_vida <= 0){
                                            heartless_vida = 0;
                                        }
                                        System.out.println("los Heartless les queda:"+heartless_vida);
                                        if (vida_perso <= 0){
                                            character.remove(player);
                                        }
                                        break;
                                        
                                    case 4:
                                        per.imprimir(recerva);
                                        System.out.println("elegir por quien cambiar:");
                                        int rese = sc.nextInt();
                                        while(rese < 0 || rese > 2){
                                            System.out.println("error");
                                            per.imprimir(recerva);
                                        }
                                        recerva.add(character.get(perso));
                                        character.remove(perso);
                                        character.add(recerva.get(rese));
                                        recerva.remove(rese);
                                        
                                        
                                        
                                    }
                                    if (character.size() == 0){
                                        System.out.println("te quedaste sin personajes disponibles.");
                                        cont= 1;
                                        break;
                                    }
                                
                                }
                            
                            
                            
                            
                            
                            System.out.println("ok1");
                            break;
                            
                        case 2:
                            System.out.println("El equipo encontro una Posion");
                            items.add(pocion);
                            break;
                        
                        case 3:
                            System.out.println("El equipo encontro un Ether");
                            items.add(Ether);
                            break;
                            
                        case 4:
                            System.out.println("El equipo encontro un Elixir");
                            items.add(Elixir);
                            break;
                        
                        case 5:
                            System.out.println("Te encontraste con unos amigos y decides ayudarles tienes " +items.size()+" Items disponibles");
                            if (items.size() == 0){
                                System.out.println("no tines items disponibles para regalar");
                                break;
                            }else{
                                int cosas = rand.nextInt(items.size());
                                System.out.println("Decides darles "+ cosas+" items");
                                for (int j = 0; j < cosas; j++) {
                                    int cosas2 = rand.nextInt(items.size() - 1);
                                    items.remove(cosas2);
                                    
                                }
                                item.imprimir(items);
                            }
                    }
                    if (cont == 1){
                        break;
                    }
                    System.out.println("Desea continuar:");
                    String res = cs.nextLine();
                    if (i == 20){
                        System.out.println(" felicidades Terminaste el castillo");
                    }
                }
                System.out.println("Ok1");
                break;
            }
            System.out.println("//////menu//////");
            System.out.println("1. – Kingdom Hearts Re-Re:Coded!");
            System.out.println("2.salir ");
            opcion = sc.nextInt();       
        }
        
        // TODO code application logic here
    }
    
}
