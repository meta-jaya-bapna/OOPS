import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jaya Bapna
 * Class name - HeapImplementation
 * Below class implements Heap data structure.
 *
 */
public class HeapImplementation<T> {

	int index = 0;      							//Points to current location of job in printer.
	List<Entity> heap = new ArrayList<Entity>();//Stores all the jobs
	
	/**
	 * Below function adds the job in heap.
	 * @param entity
	 */
	public void addItem(Entity entity) {
		heap.add(entity);
		heapify(index);
		index++;
	}

	/**
	 * Below function sorts the heap and maintains max heap.
	 * @param position
	 */
	public void heapify(int position) {
		if (position != 0 && compare( heap.get(position), heap.get(position/ 2))) {
			swap(position, (position/ 2));
			heapify(position / 2);
		}
	}
	
	/**
	 * Below functions swap values 
	 * @param position1
	 * @param position2
	 */
	public void swap(int position1, int position2) {
		Entity item = heap.get(position1);
		heap.set(position1, heap.get(position2));
		heap.set(position2, item);
	}
	
	/**
	 * Below function compares twoentities on basis of priority.
	 * @param entity1
	 * @param entity2
	 * @return
	 */
	public boolean compare(Entity entity1, Entity entity2){
		if ( entity1.priority > entity2.priority) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Below function remove maximum from heap.
	 * @return
	 */
	public Entity removeMax() {
		Entity item = heap.get(0);
		heap.remove(0);
		return item;
	}
	
	/**
	 * Below function checks if heap is empty or not.
	 */
	public boolean IsEmpty() {
		return heap.size() == 0;
	}
}
