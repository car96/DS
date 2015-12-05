package unit1;

public class Film extends Multimedia {
	
	private String director, producer;

	public Film(String title, int year, Format format, double duration, String director, String producer) throws Exception {
		super(title, year, format, duration);
		this.director = director;
		this.producer = producer;
		if(director == null && producer == null){
			throw new Exception();
		}
	}
	
	@Override
	public String toString(){
		return "Title: "+title+"\nYear: "+year+"\nFormat: "+format+"\nDuration: "+duration+"\nDirector: "+director+"\nProducer: "+producer;
	}
	
}
