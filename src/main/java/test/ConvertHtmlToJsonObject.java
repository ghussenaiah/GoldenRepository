package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ConvertHtmlToJsonObject {
	public static void main(String args[]) {
		String abv = "<p style=\"text-align: center; \">Company Name</p><table name=\"\" width=\"100%\" border=\"1\" align=\"center\" cellpadding=\"5\" cellspacing=\"2\" style=\"border-collapse:collapse;color:#000000;font-size:13px;font-family:arial,helvetica,sans-serif;text-align:center;\"><tbody><tr><td>Ordinary Income<br></td><td>Company1</td><td>Company2<br></td><td>Company3<br></td><td>Total</td></tr><tr><td>Total Income</td><td><p>[$item Report1,  @price]</p></td><td>[$item Report2,&nbsp;<span style=\"letter-spacing: 0.1px;\">@price]</span><br></td><td>[$item Report3,&nbsp;<span style=\"letter-spacing: 0.1px;\">@price]</span><br></td><td>[$item Report4,&nbsp;<span style=\"letter-spacing: 0.1px;\">@price]</span><br></td></tr></tbody></table><p><br></p><p style=\"letter-spacing: 0.1px;\"><br></p>";
		Document doc = Jsoup.parse(abv);
		Elements table = doc.select("table");
		HashMap<String, String> hm = new HashMap<String, String>();
		ArrayList al = new ArrayList();
		ArrayList reports = new ArrayList();
		Element row1 = table.select("tr").get(1);
		for (Element row : row1.select("td")) {
			al.add(row.text());
		}
		al.remove(0);

		for (Object a : al) {
			String cv = a.toString();

			cv = cv.replaceAll("\\[", "").replaceAll("\\]", "");
			String def[] = cv.split("\\,");
			String gh = def[1].substring(2);
			hm.put(def[0].substring(1), gh);

			reports.add(def[0].substring(1));
		}

		System.out.println(reports);
		System.out.println(hm);

	}

}
