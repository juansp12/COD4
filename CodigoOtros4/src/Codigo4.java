import java.util.Scanner;

public class Codigo4 {
	//Se agrego el main para que pudiera correr el codigo
public static void main(String [] args) {
//Se arreglaron los Scanners	
Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    //en el   System.out.print se cambio de jugador 1 a jugador 2, ya que estaba repetido con el de arriba
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine();
    //Se elimino un ) ya que estaba mal ahi en el if 
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//se agrego un } debido a que no estaba cerrado
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    //terminamos con un scanner.close()
    s.close();
    s2.close();
}//class Codigo4
}
