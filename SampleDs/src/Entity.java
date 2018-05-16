
/** 
 * @author - Jaya Bapna
 * Class name - Entity
 */
public class Entity {
	
	int priority;								//Stores the priority of the entity
	String data;								//Stores the data to be printed by the entity
	
	public Entity(int priority, String data) {
		this.priority = priority;
		this.data = data;
	}
	
	/**
	 * Below function sends the data to the printer which is to be printed by it.
	 */
	public void sendDataToPrinter() {
		PrinterFacade.getInstance().addItem(this);
	}
}
