import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data dat = new Data();
		SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
		
		
		dat.setDatap(sdf.parse(sc.next()));
		System.out.println(dat.getDatap());
		sc.close(); 
	
		
	
	}

}
