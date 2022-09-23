package testcase;

import a101page.A101;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TestCase {
  /*  - Senaryoya üye kaydı oluşturmadan devam edilecek.
            - Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
            - Açılan ürünün siyah olduğu doğrulanır.
            - Sepete ekle butonuna tıklanır.
            - Sepeti Görüntüle butonuna tıklanır.
            - Sepeti Onayla butonuna tıklanır.
            - Üye olmadan devam et butonuna tıklanır.
            - Mail ekranı gelir.
            - Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
            - Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.*/

@Test
 public void test() throws InterruptedException {
     Driver.getDriver().get(ConfigReader.getProperty("A101URL"));

    A101 a101=new A101();

    a101.cerezButton.click();
    a101.giyimAksesuarBolumu.click();
    a101.kadinIcGiyimBolumu.click();
    Thread.sleep(2000);
    a101.dizAltiCorapBolumu.click();
   // List<WebElement> corapListesi=a101.tumCoraplar.getText().





 }

}
