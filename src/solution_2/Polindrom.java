/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_2;

/**
 *
 * @author R2-D2
 */
//class for find polindrom
public class Polindrom {
    private int polindrom;
    private int number;
    
    public Polindrom(int number){
        this.number = number;
    }
    
    private boolean isPolindrom(int current){
        int tmp = current;
        int polindrom = 0;
        // revers number : get lowest order and do it highest, while have digit in the number
        // if revers number equals current => it is polindrom
        while(tmp != 0){
            polindrom = (tmp % 10) + (polindrom * 10);
            tmp /= 10; 
        }    
        return polindrom == current ? true : false;
    }
    //get the most closely number to this
    public int getPolindrom(){
        polindrom = number;
        while( !isPolindrom(polindrom)){
            polindrom++;
        }
        return polindrom;
    }
}
