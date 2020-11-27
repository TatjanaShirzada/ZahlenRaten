import java.util.Scanner; 


public class ZahlenRaten {
	
	static void rateZahl(int wertebereich){
		int zufallsZahl = (int) (Math.random()*wertebereich); 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Errate die Zahl zwischen 0 und "+wertebereich+" !");
		int eingabe = scanner.nextInt(); //Eingabe gespeichert
		int zaehler=1; //ZŠhler startet bei 1 
		
		while (zufallsZahl != eingabe){
			if (zufallsZahl<eingabe){
				System.out.println("Leider nein, die Zahl ist kleiner. Du hattest "+zaehler+" Versuche gehabt. Versuche es nochmal!");
			}
			else {
				System.out.println("Leider nein, die Zahl ist grš§er, du hattest "+zaehler+" Versuche gehabt. Versuche es nochmal!");
			}
			
			eingabe = scanner.nextInt(); //erneute Eingabe
			zaehler++; //ZŠhler bei jedem Durchlauf um eins erhšht
		}
		System.out.println("Bingo! Du hattest " +zaehler+ "DurchgŠnge gebraucht"); //Eingabe war richtig
	}
	
	public static void main(String[] args) {
		rateZahl(100);
	}

}
