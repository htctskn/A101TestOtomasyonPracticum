package testcase;

import a101page.A101;
import com.github.javafaker.Faker;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
    Thread.sleep(2000);

    List<WebElement> tumCoraplarListesi=a101.tumCoraplar;
    for (int i = 0; i <tumCoraplarListesi.size() ; i++) {
        System.out.println(tumCoraplarListesi.get(i).getText());
        if (tumCoraplarListesi.get(i).getText().contains("Siyah")){
            tumCoraplarListesi.get(i).click();
        }
    }
    Assert.assertTrue(a101.siyahCorapElement.isDisplayed());
    //Thread.sleep(1000);

    a101.sepeteEkleButton.click();
    a101.sepetiGoruntuleButton.click();
    a101.sepetiOnaylaButton.click();
    Thread.sleep(2000);

    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(2000);
    a101.uyeOlmadanDevamEtButton.click();

    Faker faker=new Faker();
    a101.emailTextBox.click();
    actions.sendKeys(faker.internet().emailAddress()).perform();
    Thread.sleep(2000);

    a101.devamEtButton.click();
    a101.yeniAdresOlusturSekmesi.click();
    a101.adresBasligiTextBox.click();
    actions.sendKeys("Ev")
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().name())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().lastName())
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("telNo")).perform();

    Thread.sleep(2000);
    Select select=new Select(a101.ilDropDownElement);
    select.selectByIndex(2);

    Thread.sleep(2000);
    Select select1=new Select(a101.ilceDropDownElement);
    select1.selectByVisibleText("ÇANKAYA");

    Thread.sleep(2000);
    Select select2=new Select(a101.mahalleDropDownElement);
    select2.selectByValue("5487");

    a101.adresTextBox.click();
    actions.sendKeys(faker.address().fullAddress()).perform();

    actions.sendKeys(Keys.ARROW_DOWN).perform();
    a101.kaydetButton.click();
    Thread.sleep(2000);

   // a101.scottyKargoRadioButton.click();
    a101.kaydetVeDevamEtButton.click();

    a101.SiparişiTamamlaButton.click();

    a101.masterPassIleOdemeText.isDisplayed();











 }

}
