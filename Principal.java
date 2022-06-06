
package ProyectoFinal;

import java.util.Random;


public class Principal {
    public static void main(String[] arg){
        int aleatorio, HP;
        boolean Principal=true,Enemigo=true;
        
        Personajes principal=new Personajes();
        Personajes enemigo=new Personajes();
        
        Random rand=new Random(System.nanoTime());
        
        principal.setDAÑO(50);
        principal.setDEFENSA(50);
        principal.setHP(50);
        principal.setNombre("Protagonista");
        principal.setVELOCIDAD(50);
        
        enemigo.setDAÑO(0);
        enemigo.setDEFENSA(0);
        enemigo.setHP(60);
        enemigo.setNombre("Enemigo");
        enemigo.setVELOCIDAD(0);
        
        System.out.println(principal.getNombre()+" tiene una vida de:"+principal.getHP());
        System.out.println(enemigo.getNombre()+" tiene una vida de:"+enemigo.getHP());
        
        do{
            aleatorio=rand.nextInt(1);
            if(aleatorio==0){
                HP=principal.ataque_fisico();
            }
            else{
                HP=principal.ataque_fuerza();
            }
            System.out.println(principal.getNombre()+" ha realizado un ataque de: "+HP);
            enemigo.daño(HP);
            
            if(enemigo.getHP()>0){
                aleatorio=rand.nextInt(1);
                if(aleatorio==0){
                   HP=enemigo.ataque_fisico();
                }
                else{
                   HP=enemigo.ataque_fuerza();
                }
                System.out.println(enemigo.getNombre()+" ha realizado un ataque de: "+HP);
                principal.daño(HP);
            }
            
        }while(Principal&&Enemigo);
    }
}
