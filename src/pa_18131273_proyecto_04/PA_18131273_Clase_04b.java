/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_04;

/**
 *
 * @author Jose angel
 */
class Romano {   
    private static String valor;
    //Se usa esta clase para obtener las equivalencias de n numero a numero romano
    public static String getNumeroEquivalente(int arabigo){
     valor = ""; //Valor en romano
     //Comprobamos lo siguiente
      int miles = arabigo / 1000; //Si es divisible entre 1000 para agregar "M" las veces que sean divisibles
      int centenas = arabigo / 100 % 10; //Se obtiene el resto de la division entre 100 para agregar una "C"
      int decenas = arabigo / 10 % 10; //Se obtiene el resto dividir entre 10 para agregar una "X"
      int unidades = arabigo % 10;// Se obtienen los modulos de dividir entre 10 la cantidad

      //Valores para millares
      for (int i = 1; i <= miles; i++) {
             valor = valor + "M"; //Se agrega una M por cada vez que sea divisible entre 1000 
      }

      //Valores para centenas
      if (centenas == 9) {
          valor = valor + "CM";//novecientos en romano es "CM" 
      } else if (centenas >= 5) { 
                     valor = valor + "D"; //500 es "D" en romano
                     for (int i = 6; i <= centenas; i++) {
                            valor = valor + "C"; //Si es menor al valor arabico agregamos una "C" por cada 100 extras
                     }
      } else if (centenas == 4) {
                      valor = valor + "CD"; //400 en romano es "CD"
      } else {
                  for (int i = 1; i <= centenas; i++) {
                         valor = valor + "C"; //por cada vez que sea menor a al valor arabico agregamos una "C" (100) si es 100 sera C
                  }
      }

     //Valores para decenas
      if (decenas == 9) {
           valor = valor + "XC";//90 en romano es "XC"
      } else if (decenas >= 5) {
                      valor = valor + "L";// 50 en romano es "L"
                      for (int i = 6; i <= decenas; i++) {
                            valor = valor + "X";// por cada vez que sea menor al valor arabico agreagamos una "X" (+10)
                      }
      } else if (decenas == 4) {
                      valor = valor + "XL";//40 en romano es "XL"
      } else {
                    for (int i = 1; i <= decenas; i++) {
                           valor = valor + "X"; //por cada vez que sea menor al valor arabico agregamos una "X" (-10) si es 10 sera una X
                    }
      }

     //Valores unidades
      if (unidades == 9) {
           valor = valor + "IX"; //nueve es "IX"
      } else if (unidades >= 5) {
                      valor = valor + "V"; //Cinco es "V"
                      for (int i = 6; i <= unidades; i++) {
                             valor = valor + "I"; //Por cada vez que sea menor al valor arabico agreamos una "I" +1 
                      }
      } else if (unidades == 4) {
                      valor = valor + "IV"; //Cuatro es "IV"
      } else {
                  for (int i = 1; i <= unidades; i++) {
                         valor = valor + "I"; //por cada vez que sea menor se agrega una "I" hasta el 3
                  }
      }
      return valor;
  }
}
    

