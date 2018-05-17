
package tipodedato;

public class TipodeDato {

    public static void main(String[] args) {
        
        //El tipo de dato byte es un entero de 8 bits complemento a dos
        //El valor mínimo es -128 y el máximo 127 
        System.out.println("Valor Máximo Byte: " + Byte.MAX_VALUE);
        System.out.println("Valor Mínimo Byte: " + Byte.MIN_VALUE);
        
        //El tipo de dato short es un entero de 16 bits complemento a dos 
        //El valor mínimo es -32,768 y el máximo 32,767
        System.out.println("Valor Minimo Short " + Short.MIN_VALUE);
        System.out.println("Valor Maximo Short " + Short.MAX_VALUE);
        
        //El tipo de dato int es un entero de 32 bits complemento a dos
        //El valor mínimo es -2,147,483,648 y el máximo 2,147,483,647
        System.out.println("int Valor Minimo " + Integer.MIN_VALUE);
        System.out.println("Int Valor Maximo " + Integer.MAX_VALUE);
        
        //El tipo de dato long es un entero de 64 bits complemento a dos
        //El valor mínimo es -9,223,372,036,854,775,808 
        //Y el máximo 9,223,372,036,854,775,807
        System.out.println("Long Valor Minimo " + Long.MIN_VALUE);
        System.out.println("Long Valor Maximo " + Long.MAX_VALUE);
        
        //El tipo de dato float es un dato en coma flotante IEEE 754 de 32 bits 
        //Su rango de valores está fuera del ámbito de este tema
        System.out.println("Float Valor Minimo " + Float.MIN_VALUE);
        System.out.println("Float Valor Maximo " + Float.MAX_VALUE);
        
        //El tipo de dato double es un dato en coma flotante IEEE 754 de 64 bits
        //Su rango de valores está fuera del ámbito de este tema
        System.out.println("Double Valor Minimo " + Double.MIN_VALUE);
        System.out.println("Double Valor Maximo " + Double.MAX_VALUE);
        
        
        //El tipo de dato boolean solamente tiene dos valores posibles: 
        //true (verdadero) y false (falso)
        boolean Verdadero = true;
        boolean Falso = false;
        
        System.out.println("Boolean Verdadero = " + Verdadero);
        System.out.println("Boolean Falso = " + Falso);
        
        
    }
    
}


