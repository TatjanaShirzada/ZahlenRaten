import java.util.Scanner; 


public class ZahlenRaten {
	
	static void rateZahl(int wertebereich){
		int zufallsZahl = (int) (Math.random()*wertebereich); 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Errate die Zahl zwischen 0 und "+wertebereich+" !");
		int eingabe = scanner.nextInt(); //Eingabe gespeichert
		int zaehler=1; //Z�hler startet bei 1 
		
		while (zufallsZahl != eingabe){
			if (zufallsZahl<eingabe){
				System.out.println("Leider nein, die Zahl ist kleiner. Du hattest "+zaehler+" Versuche gehabt. Versuche es nochmal!");
			}
			else {
				System.out.println("Leider nein, die Zahl ist gr��er, du hattest "+zaehler+" Versuche gehabt. Versuche es nochmal!");
			}
			
			eingabe = scanner.nextInt(); //erneute Eingabe
			zaehler++; //Z�hler bei jedem Durchlauf um eins erh�ht
		}
		System.out.println("Bingo! Du hattest " +zaehler+ "Durchg�nge gebraucht"); //Eingabe war richtig
	}
	
	public static void main(String[] args) {
		rateZahl(100);
	}

}
