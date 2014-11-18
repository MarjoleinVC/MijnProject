package be.vdab.valueobjects;

public final class Adres {
	private static String straat;
	private static String huisnummer;
	private static String busnummer;
	private static String postcode;
	private static String gemeente;

	public Adres(String straat, String huisnummer, String busnummer,
			String postcode, String gemeente) {
		Adres.straat=straat;
		Adres.huisnummer = huisnummer;
		Adres.busnummer = busnummer;
		Adres.postcode = postcode;
		Adres.gemeente = gemeente;
	}

	public Adres(String straat, String huisnummer, String postcode,
			String gemeente) {
		Adres.straat=straat;
		Adres.huisnummer = huisnummer;
		Adres.postcode = postcode;
		Adres.gemeente = gemeente;
	}

	public static void setStraat(String straat) {
		Adres.straat = straat;
	}

	public static void setHuisnummer(String huisnummer) {
		Adres.huisnummer = huisnummer;
	}

	public static void setBusnummer(String busnummer) {
		Adres.busnummer = busnummer;
	}

	public static void setPostcode(String postcode) {
		Adres.postcode = postcode;
	}

	public static void setGemeente(String gemeente) {
		Adres.gemeente = gemeente;
	}

	public static String getStraat() {
		return straat;
	}

	public static String getHuisnummer() {
		return huisnummer;
	}

	public static String getBusnummer() {
		return busnummer;
	}

	public static String getPostcode() {
		return postcode;
	}

	public static String getGemeente() {
		return gemeente;
	}

}
