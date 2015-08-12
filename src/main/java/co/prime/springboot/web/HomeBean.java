package co.prime.springboot.web;

import co.prime.springboot.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * User: n.ninovic
 * Date: 12.08.2015
 * Time: 10:15
 */
@ManagedBean
@SessionScoped
public class HomeBean {

    @Autowired
    private HomeService homeService;

    private int randomNumber;
    private String locale = "en";//change it to sr to get text in second supported language


    public int getRandomNumber() {
        return randomNumber = homeService.getRandomNumber();
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
