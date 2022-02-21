package konversiSuhu;
import java.util.Scanner;

class Main{
  public static void main (String[]args){
  
    double inputSuhu;
    int pilihMenu;
    boolean y = true;
    
    Scanner input = new Scanner(System.in);

    System.out.println("-------------------------");  
    System.out.println("PROGRAM KONVERSI SUHU AIR");
    System.out.println("-------------------------");
    System.out.print("Input Suhu Celcius = ");
    inputSuhu = input.nextDouble(); //input suhu Celcius
    System.out.println(" ");

    while (y == true) {
      System.out.println("-----------MENU----------");
      System.out.println("1. Lihat hasil konversi");
      System.out.println("2. Edit data konversi");
      System.out.println("3. Exit");
      System.out.println("-------------------------");
      System.out.print("Pilih Menu = ");
      pilihMenu = input.nextInt();
      System.out.println("-------------------------");

      Konversi suhuCelcius = new Konversi();

      switch (pilihMenu){
        case 1: System.out.println("Reamur\t\t = " + suhuCelcius.keReamur(inputSuhu) + " °C");
                System.out.println("Fahrenheit\t = " + suhuCelcius.keFahrenheit(inputSuhu) + " °F");
                System.out.println("Kelvin\t\t = " + suhuCelcius.keKelvin(inputSuhu) + " °K");
                System.out.println("Kondisi Air\t = " + suhuCelcius.kondisiAir(inputSuhu));
                break;
        case 2: System.out.print("Input Suhu Celcius = ");
                inputSuhu = input.nextDouble();
                break;
        case 3: input.close();
                System.exit(0);
                break;
        default:System.out.println("Maaf menu tidak ada");
                break;
      }
      System.out.println(" ");
    }
  }
}
