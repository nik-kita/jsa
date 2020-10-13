package locators;

import org.openqa.selenium.By;

public enum GeneralFooterLocator implements OnixLocator {
    JSA_LOGO(By.cssSelector("footer .logo")),
    TERMS_OF_SERVICE_LINK(By.cssSelector(".company [href='/terms/']")),
    COOKIES_POLICY_LINK(By.cssSelector(".company [href='/cookies-policy/']")),
    PRIVACY_POLICY_LINK(By.cssSelector(".company [href='/privacy/']")),
    BUG_SUPPORT_LINK(By.cssSelector(".support [href='/emails/bug-report/']")),
    CONTACT_US_LINK(By.cssSelector(".support [href='/emails/contact-us/']")),
    ACCESS_LINK(By.cssSelector(".support [href='/access/']")),
    FAQS_LINK(By.cssSelector(".support [href='/faqs/']")),
    PLAY_STORE_BUTTON(By.cssSelector("#website-footer img[alt='playstore']")),
    APPSTORE_BUTTON(By.cssSelector("#website-footer img[alt='appstore']")),
    FACEBOOK_LINK(By.cssSelector("#website-footer [alt='ic_facebook']")),
    INSTAGRAM_LINK(By.cssSelector("[alt='ic_instagram']")),
    SPOTIFY_PLAYLIST_LINK(By.cssSelector("#website-footer [alt='ic_spotify']")),




    ;

    GeneralFooterLocator(By path) {
        this.path = path;
    }

    private By path;

    @Override
    public By getPath() {
        return path;
    }
}
