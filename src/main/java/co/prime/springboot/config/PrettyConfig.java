package co.prime.springboot.config;

/**
 * User: n.ninovic
 * Date: 12.08.2015
 * Time: 11:39
 */
import com.ocpsoft.pretty.PrettyFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
@Configuration
public class PrettyConfig {

    /**
     * Configures PrettyFaces by registering a required Filter.
     *
     * @return A configured PrettyFaces filter.
     */
    @Bean
    public FilterRegistrationBean prettyFilter() {
        FilterRegistrationBean rewriteFilter = new FilterRegistrationBean(new PrettyFilter());

        // Filter Forward, Request, Asyc, and Error-related requests.
        rewriteFilter.setDispatcherTypes(DispatcherType.FORWARD,
                DispatcherType.REQUEST,
                DispatcherType.ASYNC,
                DispatcherType.ERROR);

        // Attach the filter to the root URL for the website. e.g.) http://www.example.com/*
        rewriteFilter.addUrlPatterns("/*");

        return rewriteFilter;
    }
}
