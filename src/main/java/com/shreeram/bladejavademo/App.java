package com.shreeram.bladejavademo;
import com.blade.Blade;

public class App{
    public static void main(String[] args) {
       Blade.of().bannerText("AWS CodePipeline Demo").start(App.class, args);
    }
}
