package a101page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A101 {
    public A101() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Kabul Et']")
    public WebElement cerezButton;

    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public WebElement giyimAksesuarBolumu;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement kadinIcGiyimBolumu;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement dizAltiCorapBolumu;

    @FindBy(xpath = "//li[@class='col-md-4 col-sm-6 col-xs-6 set-product-item']")
    public List<WebElement> tumCoraplar;

     @FindBy(xpath = "//span[.='SİYAH']")
     public WebElement siyahCorapElement;

     @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
     public WebElement sepeteEkleButton;

    @FindBy(xpath = "(//a[.='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntuleButton;

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaButton;

    //@FindBy(xpath = "//div[@class='page-auth']")
   // public WebElement sayfadaBoslukElement;

    @FindBy(xpath ="//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEtButton;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailTextBox;
    //Devamet butonu tab ile ilerliyor

     @FindBy(xpath = "//button[@class='button block green']")
     public WebElement devamEtButton;

     @FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
     public WebElement yeniAdresOlusturSekmesi;

     @FindBy(xpath = "//input[@name='title']")
     public WebElement adresBasligiTextBox;

     @FindBy(xpath = "//select[@name='city']")
     public WebElement ilDropDownElement;

     @FindBy(xpath = "//select[@name='township']")
     public WebElement ilceDropDownElement;

     @FindBy(xpath = "//select[@class='js-district']")
     public WebElement mahalleDropDownElement;

     @FindBy(xpath = "//textarea[@class='js-address-textarea']")
     public WebElement adresTextBox;

     @FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
     public WebElement kaydetButton;

     @FindBy(xpath = "//input[@class='js-shipping-radio']")
     public WebElement scottyKargoRadioButton;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEtButton;

    @FindBy(xpath = "(//span[.='Siparişi Tamamla'])[2]")
    public WebElement SiparişiTamamlaButton;

    @FindBy(xpath = "(//div[@class='section-hero'])[5]")
    public WebElement masterPassIleOdemeText;













}
