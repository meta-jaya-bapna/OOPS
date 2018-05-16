import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class PrinterQueueTest {
	
	List<String> actualList;
	List<String> expectedList;
	ChairPerson chairPersonInstance;
	Professor professorInstance;
	GraduateStudent graduateStudentInstance;
	UnderGraduateStudent underGraduateStudentInstance;

	@Test
	public void TestPrinterJobSuccess() {
		actualList = new ArrayList<String>();
		expectedList = new ArrayList<String>();
		chairPersonInstance = new ChairPerson("This data is from Chair Person");
		professorInstance = new Professor("This data is from Professor");
		graduateStudentInstance = new GraduateStudent("This data is from Graduate Student");
		underGraduateStudentInstance = new UnderGraduateStudent("This data is from Under Graduate Student");
		professorInstance.sendDataToPrinter();
		graduateStudentInstance.sendDataToPrinter();
		chairPersonInstance.sendDataToPrinter();
		underGraduateStudentInstance.sendDataToPrinter();
		actualList = PrinterFacade.getInstance().print();
		expectedList.add("This data is from Chair Person");
		expectedList.add("This data is from Professor");
		expectedList.add("This data is from Graduate Student");
		expectedList.add("This data is from Under Graduate Student");
		assertEquals(expectedList, actualList);
	}
}
