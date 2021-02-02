import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
		String date=formatter.format(date1);
		
		char pm[]=new char[2];
		char pd[]=new char[2];
		char py[]=new char[4];
		
		pd[0]=date.charAt(3);
		pd[1]=date.charAt(4);
		int pdi=0;
		for(int i=0;i<2;i++)
		{
			 pdi= pdi*10 +((int)pd[i] -48);
		}
		
		pm[0]=date.charAt(0);
		pm[1]=date.charAt(1);
		int pmi=0;
		for(int i=0;i<2;i++)
		{
			 pmi= pmi*10 +((int)pm[i] -48);
		}
		
		int pyi=0;
		py[0]=date.charAt(6);
		py[1]=date.charAt(7);
		py[2]=date.charAt(8);
		py[3]=date.charAt(9);
		for(int i=0;i<4;i++)
		{
			 pyi= pyi*10 +((int)py[i] -48);
		}
		System.out.println(pmi+" "+pdi+" "+pyi);
	}

}
