import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    Scanner input = new Scanner(System.in); 
	public static void main(String[] args) throws IOException {
		
		Main main = new Main();
		main.choice();
	}

	public void choice() throws IOException {
		System.out.println("choose any one \n1)அதிகாரம் \n2)குறள்");
		int option = input.nextInt();
		
		switch(option) {
		case 1: Adhikaram adhikram = new Adhikaram();
			break;
		case 2: Kural kural = new Kural();
			break;
		default:
			System.out.println("Invalid Input");
			choice();
		}
	}
}



//} C:\\Users\\Hp\\Desktop\\Kural.txt;
