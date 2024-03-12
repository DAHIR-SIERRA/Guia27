/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

/**
 *
 * @author User
 */
public class ContarVocales {
  

    public void  contarvocales (){
        String textoEjemplo = "Brayner dahir sierra sanabria";
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int x = 0; x < textoEjemplo.length(); x++) {
            char actual = Character.toLowerCase(textoEjemplo.charAt(x));
            switch (actual) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Total de vocales: " + (a + e + i + o + u));
        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
    }
}


