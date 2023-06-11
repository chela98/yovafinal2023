package tr.edu.medipol.yova;

public class AdanaSecimApi {

    private static int partiAOy = 0;
    private static int partiBOy = 0;
    private static int partiCOy = 0;

    public static void partiOyArttir(String partiAdi) {
        if (partiAdi.equals("A")) {
            partiAOy++;
        } else if (partiAdi.equals("B")) {
            partiBOy++;
        } else if (partiAdi.equals("C")) {
            partiCOy++;
        }
    }

    public static void partiOyAzalt(String partiAdi) {
        if (partiAdi.equals("A")) {
            if (partiAOy > 0) {
                partiAOy--;
            } else {
                throw new IllegalArgumentException("Parti A'ya ait oy zaten sıfır.");
            }
        } else if (partiAdi.equals("B")) {
            if (partiBOy > 0) {
                partiBOy--;
            } else {
                throw new IllegalArgumentException("Parti B'ye ait oy zaten sıfır.");
            }
        } else if (partiAdi.equals("C")) {
            if (partiCOy > 0) {
                partiCOy--;
            } else {
                throw new IllegalArgumentException("Parti C'ye ait oy zaten sıfır.");
            }
        }	else {
        	throw new IllegalArgumentException("Geçersiz parti adı.");
        }
    }

    public static String partiOyListele() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parti A Oy: ").append(partiAOy).append("\n");
        sb.append("Parti B Oy: ").append(partiBOy).append("\n");
        sb.append("Parti C Oy: ").append(partiCOy).append("\n");
        return sb.toString();
    }
   
    public static int getPartiAOy() {
    	return partiAOy;
    }
    public static int getPartiBOy() {
    	return partiBOy;
    }
    public static int getPartiCOy() {
    	return partiCOy;
    }
}
