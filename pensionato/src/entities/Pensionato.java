package entities;

public class Pensionato{
	private String guest;
	private int room;
	private String email;
	
	public Pensionato(String guest, int room, String email) {
		this.guest = guest;
		this.room = room;
		this.email = email;
	}
	
	public String toString() {
		 return room
				+ ": "
				+ guest
				+ ", "
				+ email;
	}

}
