public class Clue
{
	//attributes
	String murderer;
	String weapon;
	String room;
	
	//constructor
	public Clue (String _murderer, String _weapon, String _room)
	{
		murderer = _murderer;
		weapon = _weapon;
		room = _room;
	}
	
	public boolean equals(Clue obj)
	{
		if (murderer.equals(obj.murderer) && weapon.equals(obj.weapon) && room.equals(obj.room))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void check(Clue obj)
	{
		if (murderer.equals(obj.murderer)) {
			System.out.println("You have the correct murderer.");
		}
		if (weapon.equals(obj.weapon)) {
			System.out.println("You have the correct weapon.");
		} 
		if (room.equals(obj.room)) {
			System.out.println("You have the correct room.");
		}
	}
	
	public String toString()
	{
		return "Suspect: " + murderer + "\nWeapon: " + weapon + "\nRoom: " + room;
	}
}
