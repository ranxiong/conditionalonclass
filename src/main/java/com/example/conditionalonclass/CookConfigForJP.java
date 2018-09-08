package com.example.conditionalonclass;

import com.example.rx.CookBook;
import com.example.rx.Cooker;
import com.example.rx.JapaneseCuisine;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({JapaneseCuisine.class})
public class CookConfigForJP {

    @Bean
    public CookBook jp(){
        return new JapaneseCuisine();
    }

    @Bean
    public Cooker cooker(){
        return new Cooker(jp());
    }
}
