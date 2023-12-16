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
public class Personajes {
    String name;
    int Hp;
    int Mp;
    int Attack;
    int Defense;

    public Personajes(String name, int Hp, int Mp, int Attack, int Defense) {
        this.name = name;
        this.Hp = Hp;
        this.Mp = Mp;
        this.Attack = Attack;
        this.Defense = Defense;
    }

    public Personajes() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getMp() {
        return Mp;
    }

    public void setMp(int Mp) {
        this.Mp = Mp;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    @Override
    public String toString() {
        return  name +"\n"+ "Hp=" + Hp +"\n "+ "Mp=" + Mp +"\n"+ "Attack=" + Attack +"\n"+ "Defense=" + Defense;
    }
    public void imprimir(ArrayList<Personajes> lista){
        String inventario = "";
      for (int i = 0; i < lista.size(); i++) {
          inventario += i+"."+lista.get(i);
          inventario += "\n";
          
      }
      System.out.println(inventario);
    }
}
