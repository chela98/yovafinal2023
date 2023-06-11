package tr.edu.medipol.yova;
import org.junit.*;
import org.junit.Test;
import tr.edu.medipol.yova.AdanaSecimApi;

public class AdanaSecimApiTest {

    @Test
    public void testPartiOyArttir() {
        AdanaSecimApi.partiOyArttir("A");
        AdanaSecimApi.partiOyArttir("B");
        AdanaSecimApi.partiOyArttir("C");

        Assert.assertEquals(1, AdanaSecimApi.getPartiAOy());
        Assert.assertEquals(1, AdanaSecimApi.getPartiBOy());
        Assert.assertEquals(1, AdanaSecimApi.getPartiCOy());
    }

    @Test
    public void testPartiOyAzalt() {
        AdanaSecimApi.partiOyArttir("A");
        AdanaSecimApi.partiOyArttir("B");
        AdanaSecimApi.partiOyArttir("C");

        AdanaSecimApi.partiOyAzalt("A");
        AdanaSecimApi.partiOyAzalt("B");
        AdanaSecimApi.partiOyAzalt("C");

        Assert.assertEquals(0, AdanaSecimApi.getPartiAOy());
        Assert.assertEquals(0, AdanaSecimApi.getPartiBOy());
        Assert.assertEquals(0, AdanaSecimApi.getPartiCOy());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartiOyAzaltWithInvalidPartiAdi() {
        AdanaSecimApi.partiOyAzalt("D");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartiOyAzaltWithZeroOy() {
        AdanaSecimApi.partiOyAzalt("A");
    }
    
    @Test
    public void testPartiOyListele() {
        AdanaSecimApi.partiOyArttir("A");
        AdanaSecimApi.partiOyArttir("B");
        AdanaSecimApi.partiOyArttir("C");

        String expected = "Parti A Oy: 2\n" +
                "Parti B Oy: 2\n" +
                "Parti C Oy: 2\n";
        Assert.assertEquals(expected, AdanaSecimApi.partiOyListele());
    }
}
