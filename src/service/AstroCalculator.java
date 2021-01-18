package service;
import model.User;
// Type your code

public class AstroCalculator{
	public String findSign(User user) {
		String res=null;
		String[] dobSplit=user.getDob().split("-");
		int date=Integer.parseInt(dobSplit[0]);
		int month=Integer.parseInt(dobSplit[1]);
		System.out.println(date+" "+month);
		if((month==12&&date>=22)||(month==1&&date<=19)) {
			res="Capricon";
		}else if((month==1&&date>=20)||(month==2&&date<=18)) {
			res="Aquarius";
		}
		else if((month==2&&date>=19)||(month==3&&date<=20)) {
					res="Pisces";
				}
		else if((month==3&&date>=21)||(month==4&&date<=19)) {
			res="Aries";
		}
		else if((month==4&&date>=20)||(month==5&&date<=20)) {
			res="Taurus";
		}
		else if((month==5&&date>=21)||(month==6&&date<=20)) {
			res="Gemini";
		}
		else if((month==6&&date>=21)||(month==7&&date<=22)) {
					res="Cancer";
				}
		else if((month==7&&date>=23)||(month==8&&date<=22)) {
			res="Leo";
		}
		else if((month==8&&date>=23)||(month==9&&date<=22)) {
			res="Virgo";
		}else if((month==9&&date>=23)||(month==10&&date<=22)) {
			res="Libra";
		}
		else if((month==10&&date>=23)||(month==11&&date<=21)) {
			res="Scorpio";
		}
		else if((month==11&&date>=22)||(month==12&&date<=21)) {
			res="Sagittarius";
		}
		return res;
	}
}