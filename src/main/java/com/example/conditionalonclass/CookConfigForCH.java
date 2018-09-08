package com.example.conditionalonclass;

import com.example.rx.ChineseFood;
import com.example.rx.CookBook;
import com.example.rx.Cooker;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({ChineseFood.class})
public class CookConfigForCH {

    @Bean
    public CookBook ch(){
        return new ChineseFood();
    }

    @Bean
    public Cooker cooker(){
        return new Cooker(ch());
    }
    
}
