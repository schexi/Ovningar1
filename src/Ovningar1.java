import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Ovningar1 {

public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Mata in ditt första tal: ");
    
    int tal1 = scanner.nextInt();
    int tal2 = scanner.nextInt();
    int tal3 = scanner.nextInt();
    scanner.nextLine();
    
    System.out.print("Största talet är: " + uppgift10(tal1, tal2, tal3));
    
}

// Variabler typkonvertering Uppgift 8
public static void ovning8 () {

    int eight = 8;
    int three = 3;
    
    int sum = eight/three;
    float sum1 = (float) eight / (float) three;

System.out.println(sum);
System.out.println(sum1);

}

// Variabler typkonvertering Uppgift 9
public static void ovning9 () {

Scanner scanner = new Scanner(System.in);
System.out.println("Skriv in ett tal: ");
int tal = scanner.nextInt();
scanner.nextLine();

if (tal % 2 == 0) {

    System.out.println("Talet är jämnt.");
}
else {
    System.out.println("Talet är udda.");
}

if (tal % 3 == 0) {

    System.out.println("Talet är delbart med tre.");
} 
else {
    System.out.println("Talet är inte delbart med tre.");
}
    
}

 // Selektion Uppgift 4
public static void uppgift4 () {

    final int femhundralapp = 500;
    final int hundralapp = 100;
    final int femtiolapp = 50;
    final int tiokrona = 10;
    final int femkrona = 5;
    final int tvåkrona = 2;
    final int enkrona = 1;  

    System.out.print("Skriv in belopp: ");

    Scanner scanner = new Scanner(System.in);
    int belopp = scanner.nextInt();
    scanner.nextLine();

    int[] antal = new int[7];


    while (belopp != 0) {

        if (belopp % femhundralapp == 0) {

            antal[0]++;
            belopp -= femhundralapp;
    } 

        else if (belopp % hundralapp == 0) {

        antal[1]++;
        belopp -= hundralapp;

    } 

    else if (belopp % femtiolapp == 0) {

        antal[2]++;
        belopp -= femtiolapp;
    }
    
    else if (belopp % tiokrona == 0) {

        antal[3]++;
        belopp -= tiokrona;
    }

    else if (belopp % femkrona == 0) {

        antal[4]++;
        belopp -= femkrona;
    }

    else if (belopp % tvåkrona == 0) {

        antal[5]++;
        belopp -= tvåkrona;
    }

    else if (belopp % enkrona == 0) {

        antal[6]++;
        belopp -= enkrona;
    }
       
    }
        System.out.printf("500-lappar: %d %n", antal[0]);
        System.out.printf("100-lappar: %d %n", antal[1]);
        System.out.printf("50-lappar: %d %n", antal[2]);
        System.out.printf("10-kronor: %d %n", antal[3]);
        System.out.printf("5-kronor: %d %n", antal[4]);
        System.out.printf("2-kronor: %d %n", antal[5]);
        System.out.printf("1-kronor: %d %n", antal[6]);  
    
    }


// Selektion Uppgift 5
public static void uppgift5 () {

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int correctNum;
int userNum;

correctNum = random.nextInt(4) + 1;

do {

System.out.print("Skriv in ett nummer, eller skriv 0 för att avsluta: ");

userNum = scanner.nextInt();
scanner.nextLine();

if (userNum == correctNum) {
    
    System.out.println("Du gissade rätt!");
    System.out.println("Din gissning: " + userNum);
    System.out.println("Korrekt nummer: " + correctNum);

    correctNum = random.nextInt(4) + 1;
}
else if (userNum != 0) System.out.println("Du gissade fel, försök igen om du vågar");

} while (userNum == correctNum || userNum != 0);

}

// Iteration Uppgift 7
public static void uppgift7 () {

Scanner scanner = new Scanner(System.in);
int antalPoäng = 0;
int summeradePoäng = 0;

System.out.print("Hur många domarpoäng ska loggas? ");
antalPoäng = scanner.nextInt();
scanner.nextLine();

int[] domarPoäng = new int[antalPoäng];

for (int i = 0; i < domarPoäng.length; i++) {

    System.out.println("Mata in poäng för domarPoäng plats " + i);
    domarPoäng[i] = scanner.nextInt();
    scanner.nextLine();
    
    summeradePoäng += domarPoäng[i];
}
Arrays.sort(domarPoäng);

summeradePoäng -= (domarPoäng[0] + domarPoäng[antalPoäng - 1]); 
System.out.println("Tävlandes totalpoäng är: " + summeradePoäng);
}

// Metoder Uppgift 10
public static int uppgift10 (int tal1, int tal2, int tal3) {

int[] tal = new int[] {tal1, tal2, tal3};
Arrays.sort(tal);

return tal[2];

}

// Arrayer Uppgift 1 (icke färdig blyat)
public static void uppgift1 () {

}


}