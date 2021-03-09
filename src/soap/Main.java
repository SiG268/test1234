package soap;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Service s = new Service();
		// System.out.println(s.profitabilitaetsPruefung(5001));

		String url = "http://localhost:8090";
		Service service = new Service();

		String URL = url + "/persnoalverwaltung";

		Endpoint endpoint = Endpoint.publish(URL, service);
		System.out.println("Server is running... " + url);
		System.out.println("Personal WSDL=" + URL + "?wsdl");
	}

}
