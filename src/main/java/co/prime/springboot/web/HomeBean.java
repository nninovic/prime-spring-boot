package co.prime.springboot.web;

import co.prime.springboot.service.HomeService;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLActions;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 * User: n.ninovic
 * Date: 12.08.2015
 * Time: 10:15
 */
@ManagedBean
@SessionScoped
@Named("homeBean")
@URLMappings(mappings = {
        @URLMapping(id = "home", pattern = "/", viewId = "/index.jsf")
})
public class HomeBean {

    @Autowired
    private HomeService homeService;

    private int randomNumber;
    private String locale = "sr";//change it to sr to get text in second supported language

    @URLActions(actions = {
            @URLAction(mappingId = "home", onPostback = false)
    })
    public String home() {
        randomNumber = homeService.getRandomNumber();
        return null;
    }

    public int getRandomNumber() {
        return randomNumber;
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
