/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeoriPBO;

/**
 *
 * @author Ezik Haq Wahid
 */
public class WrapperClass {
     public static void main(String[] args) {
        Character objChar = new Character('A');
        Byte objByte = new Byte("25");
        Short objShort = new Short("60");
        Integer objInt = new Integer(555);
        Long objLong = new Long(1223);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(54.45);
        Double objDouble = new Double(22.88);
        
        //Menampilkan Output dari Class Wrapper
        System.out.println("Character: "+objChar);
        System.out.println("Byte: "+objByte);
        System.out.println("Short: "+objShort);
        System.out.println("Integer: "+objInt);
        System.out.println("Long: "+objLong);
        System.out.println("Boolean: "+objBoolean);
        System.out.println("Float: "+objFloat);
        System.out.println("Double: "+objDouble);
    }
}
