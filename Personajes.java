
package ProyectoFinal;

import java.util.Random;


public class Personajes {
    private int HP, DAÑO, DEFENSA, VELOCIDAD;
    private String nombre;
    private Random rand=new Random(System.nanoTime());
    
    //sets y gets
    public void setHP(int HP){
        this.HP=HP;
    }
    public int getHP(){
        return HP;
    }

    public int getDAÑO() {
        return DAÑO;
    }

    public void setDAÑO(int DAÑO) {
        this.DAÑO = DAÑO;
    }

    public int getDEFENSA() {
        return DEFENSA;
    }

    public void setDEFENSA(int DEFENSA) {
        this.DEFENSA = DEFENSA;
    }

    public int getVELOCIDAD() {
        return VELOCIDAD;
    }

    public void setVELOCIDAD(int VELOCIDAD) {
        this.VELOCIDAD = VELOCIDAD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Ataque
    public int ataque_fisico(){
        int aleatorio =rand.nextInt(2);
        return DAÑO*aleatorio;
    }
    public int ataque_fuerza(){
        if(HP>0){
            HP--;
            return HP;
        }
        else{
            return 0;
        }
    }
    public void daño(int HP){
        this.HP-=HP;
    }
}
