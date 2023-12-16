/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_josuerivera;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Items {
  String name;
  int hp;
  int mp;

    public Items(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Items() {
    }

  
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public String toString() {
        return "name=" + name + "hp=" + hp + "mp=" + mp ;
    }
  public void imprimir (ArrayList <Items> lista){
      String inventario = "";
      for (int i = 0; i < lista.size(); i++) {
          inventario += lista.get(i);
          inventario += "\n";
          
      }
      System.out.println(inventario);
  }
}