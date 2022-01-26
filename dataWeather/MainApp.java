package dataWeather;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale.Category;

import dataWeather.WeatherDto.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("=====부산광역시 연제구 연제5동의 날씨 정보=====");
        System.out.println("강수형태 = PTY");
        System.out.println("습도 = REH");
        System.out.println("1시간 강수량=RN1");
        System.out.println("풍향 = VEC");
        System.out.println("(남북성분)풍속=VVV");
        System.out.println("풍속=WSD");
        System.out.println("T1H=기온");
        System.out.println("====================================");

        List<Item> weatherList = DownloadWeather.getWeatherList();

        for (int i = 0; i < weatherList.size(); i++) {
            System.out.println(weatherList.get(i).getCategory() + " = " + weatherList.get(i).getObsrValue());
        }
    }
}
