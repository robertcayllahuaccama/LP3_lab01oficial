
public class principal {
	public static void main(String[]args) {
		int vida, rp;
		boolean fl = false;
		vida =0;
		scanner sc = new scanner(System.in);
		do {
			vida++;
			System.out.println("vida:"+vida+"¿cual es el numero secreto?");
			rp=sc.nextInt();
			if(rp==1234)
				fl=true;
		}while(vida<3&&!fl);
		if(fl==true)
			System.out.println("adivinaste");
		else
			System.out.println("usp, perdiste");
		}
		
}
