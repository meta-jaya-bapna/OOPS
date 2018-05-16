import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jaya Bapna
 * Class name - PrinterFacade
 * @param <T>
 */
public class PrinterFacade<T> {
	
	HeapImplementation<Entity> queue = new HeapImplementation<Entity>();
	public List<String> ListOfJobs = new ArrayList<String>();
	private static PrinterFacade printerFacade;
	
	private PrinterFacade() {
		
	}
	
	/**
	 * Below function creates single instance of class.
	 * @return object
	 */
	public static PrinterFacade getInstance() {
		if ( printerFacade == null) {
			printerFacade = new PrinterFacade();
		}
		return printerFacade;
	}
	
	/**
	 * Below function adds entity in queue.
	 * @param entity
	 */
	public void addItem(Entity entity) {
		queue.addItem(entity);
	}
	
	/**
	 * Below function prints the job in queue.
	 * @return List of jobs.
	 */
	public List<String> print() {
		while( !queue.IsEmpty()) {
			ListOfJobs.add(queue.removeMax().data.toString());
			print();
		}
		return ListOfJobs;
	}
}
