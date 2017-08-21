public class Date
{
	private int month = 0;
	private int day = 0;
	private int year = 0;
	
	Date(String date) {
		String[] fields = date.split("/");
		month = Integer.parseInt(fields[0]);
		day = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);	
	}
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}