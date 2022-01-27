package dataWeather;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale.Category;

import dataWeather.WeatherDto.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======오늘의 날짜를 입력하세요.======");
        System.out.println("=========ex)20220127==========");
        String baseDate = sc.nextLine();
        System.out.println("===현재 시각을 정시 단위로 입력하세요.==");
        System.out.println("ex)1700,0600");
        String baseTime = sc.nextLine();

        List<Item> weatherList = DownloadWeather.getWeatherList(baseDate, baseTime);

        System.out.println("부산광역시 연제구 연제5동의 현재 온도는 " + weatherList.get(3).getObsrValue() + "℃ 입니다.");
    }
}
