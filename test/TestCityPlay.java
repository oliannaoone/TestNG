import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCityPlay {
	private static Player test1;
	private static Player test2;

	@BeforeClass
	public static void initTest() {
		test1 = new Player();
		test2 = new Player();
	}

	@Test
	public void testFindCity() {
		String nameCity = "Minsk";
		String s = test1.findCity(nameCity);

		Assert.assertNull(s, "City is not fetch");
	}
}