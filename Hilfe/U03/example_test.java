import junit.framework.TestCase;

public class LeibeigenerTest extends BauerTest{
	public void testZuVersteuerndesEinkommen(){
		Leibeigener l1 = new Leibeigener();
		l1.setEinkommen(0);
		assertEquals(l1.zuVersteuerndesEinkommen(), 0);
	}	
}
