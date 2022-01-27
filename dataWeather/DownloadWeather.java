package dataWeather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import dataWeather.WeatherDto.Body.Items.Item;

public class DownloadWeather {
    // 날씨의 기온, 습도등등을 가져오는 메서드
    public static List<Item> getWeatherList(String baseDate, String baseTime) {
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=Qx%2BGI9DqHxlCCkJEnvNE%2Bnew8G1nsF0r1%2B3BSK%2FjxtyPVhBIazLi5ifxPyVRp2U8dyPIaoGxBOHl4d4e5%2FmAfQ%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=98&ny=76");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("날씨 조회중 오류가 발생하였습니다.");

        }
        return null;

    }
}
