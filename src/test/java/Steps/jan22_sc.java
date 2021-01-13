package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class jan22_sc {
	@Given("user logs in with below info")
	public void userLogsInWithBelowInfo(DataTable dt) {

		System.out.println("values read as map ->");
		List<Map<String, String>> limp = dt.asMaps(String.class, String.class);
		for (int i = 0; i < limp.size(); i++) {
			System.out.println(limp.get(i).get("id"));
		}

		System.out.println("data table values read as list ->");
		List<String> li = dt.asList();
		for (String s : li)
			System.out.println(s);
	}
}
