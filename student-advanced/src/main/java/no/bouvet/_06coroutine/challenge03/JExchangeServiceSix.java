package no.bouvet._06coroutine.challenge03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JExchangeServiceSix extends JExchangeService {

    public JExchangeServiceSix(@Value("${remote.service.url}") String baseUrl) {
        super(   baseUrl, "six");
    }
}