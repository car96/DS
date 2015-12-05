package unit1;

public class Multimedia {
	
	public String title;
	public int year;
	public Format format;
	public double duration;
	

	public Multimedia(String title, int year, Format format, double duration) {
		this.title = title;
		this.year = year;
		this.format = format;
		this.duration = duration;
	}


	public String getTitle() {
		return title;
	}


	public int getYear() {
		return year;
	}


	public Format getFormat() {
		return format;
	}


	public double getDuration() {
		return duration;
	}
	
	public String toString(){
		return "Title: "+title+"\nYear: "+year+"\nFormat: "+format+"\nDuration: "+duration;
	}
	
	public boolean equals(Multimedia obj){
		if(obj != null){
			if(obj instanceof Multimedia){
				Multimedia other = (Multimedia)obj;
				if(title.equals(other.title) && year == other.getYear() && format == other.getFormat() && duration == other.getDuration()){
					return true;
				}
			}
		}
		return false;
	}

}
