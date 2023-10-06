/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_NEGOCIO;

/**
 *
 * @author JORGE
 * 
 *  
     * 5 PASOS 
     * 1 ATRIBUTOS 
     * 2 CONSTRUCTOR 
     * 3 SETTERS
     * 4 GETTER
     * 5 TOSTRING 
     * 
     
 */
public class MONOMIO {
    //1 atributos
   int Coeficiente ; //el coeficiente va cazado con el signo
   int exponente ; 
   //2 constructor = para inicializar las variables 
   //constructor crea un a instancia de la clase
   //constructor sin parametros 
   public MONOMIO(){
       this.Coeficiente = 0 ; 
       this.exponente= 1 ; 
      
   }
   // constructor xon prametrso 
   public MONOMIO(char signo , int coef , int expo){
       this.exponente = expo ; 
       if (signo == '+') {
           this.Coeficiente = Math.abs(coef);
           
       }else{
           this.exponente = - Math.abs(coef);
           System.out.println("MONOMIO:Error de signo ");
       }
   }
   // setter modifica
   // viejito modifica solo el coeficiente 3X^0 , por 5
   //    5X^0 
    public void SetCoeficiente(int coefi) {
        // no puede entrar cero ,por que devuelve cero 
        // la idea es devolver un numero mayor
        if (coefi != 0) {
            if (this.Coeficiente >= 0 ) { //pregunto si el numero ingresado es positivo o negativo
                this.Coeficiente = Math.abs(coefi);
                       
            }else{
                this.Coeficiente = - Math.abs(coefi);
            }
        }else{
            System.out.println("El coeficiente no debe ser cero");
            System.exit(1); // te muestra el mensaj y se sale  eso hace ese 1 
        }
    }
    
    public void SetExponente(int expoo){
        // this.exponente =expoo ; //con esta opccion entra exponete negativo
         if (expoo >= 0 ) {
            this.exponente =expoo ; //coeficiente
        }else{
             System.out.println("el exponente no debe ser negativo");
             System.exit(1);
         }
         
    }
    
    public void SetSigno(char signo){
        if (signo == '+') {
           this. Coeficiente = Math.abs(Coeficiente);
        }else{
            this. Coeficiente = -Math.abs(Coeficiente);
        }
    }
    
    //GETTER -- obteener o devolver   /// funciones
    //dev
    public int GetCoeficiente(){
        // devuelve el coeficiente -3X^2 
        //solamente devolvera el 3 | por eso aplicamos valor absoluto
        return (Math.abs(Coeficiente));
    }
    public int GetExponente(){
        return (exponente);
    }
    
    /*
      public char GetSigno(){
        if (this.Coeficiente >= 0) {
            return='+';
        }else{
             retrunr='-';
        }
    */
    public char GetSigno(){
        char r ; 
        if (this.Coeficiente >= 0) {
            r='+';
        }else{
             r='-';
        }   //-
        return r ; 
    }
    
    //TOSTRING
    //viene ya implementado , y nosotros lo sobrecargamos
    // 3X^5  7X^55
   @Override
    public String toString(){
        String  S= " " ;
        S =S +GetSigno()+ " "+ GetCoeficiente()+ " X^" + GetExponente() ;
        
        return S ;
    }
    //llamadas con programacion orientada a objetos 
    public static void main(String[] args) {
        //poo
        MONOMIO A = new MONOMIO();
        A.SetCoeficiente(6);
        A.SetSigno('-');
        A.SetExponente(7);
        
         MONOMIO B = new MONOMIO( '+',9,5);
        
        
        System.out.println(A.toString());
          System.out.println(B.toString());
        
    }
}
