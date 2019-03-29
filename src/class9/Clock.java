package class9;

public class Clock {

	public static void main(String[] args) {

		// 24 hours 60 minutes
		  for(int hour=0; hour<=24; hour++) {
	            for(int minutes=0;minutes<60;minutes++) {
	                if(hour < 10) {
	                    if(minutes < 10) {
	                        System.out.println("0" + hour + ":0" + minutes);
	                    }else {
	                        System.out.println("0" + hour + ":" + minutes);
	                    }
	                }else {
	                    if(minutes < 10) {
	                        System.out.println( hour + ":0" + minutes);
	                    }else {
	                        System.out.println(  hour + ":" + minutes);
	                    }
	                }
	            }
	        }

			}
		
	

	}


