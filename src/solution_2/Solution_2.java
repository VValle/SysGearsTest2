/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_2;

import java.util.Scanner;

/**
 *
 * @author R2-D2
 */
public class Solution_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Inpun the number: ");
        String numberString = scan.next();
        try{
            int num = Integer.parseInt(numberString);
            Polindrom polindrom = new Polindrom(num);
            System.out.println("Polindrom: " + polindrom.getPolindrom());
        } catch(NumberFormatException e) {
            System.out.println("It's not number, sorry.");
        }

    }
    
}
