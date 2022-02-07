package dataCorona;

import java.util.List;
import java.util.Scanner;

import dataCorona.ResponseDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDate;
        String endDate;

        System.out.println("알고싶은 코로나 현황범위를 입력하세요.");
        System.out.println("ex) 20220201 시작일");
        startDate = sc.nextLine();

        System.out.println("ex) 20220207 종료일");
        endDate = sc.nextLine();

        List<Item> coronaList = DownloadCorona.getCoronaList(startDate, endDate);
        for (int i = 0; i < coronaList.size(); i++) {
            System.out.println("=================================");
            System.out.println("누적 의심신고검사자 : " + coronaList.get(i).getAccExamCnt());
            System.out.println("등록 시각 : " + coronaList.get(i).getCreateDt());
            System.out.println("사망자 수 : " + coronaList.get(i).getDeathCnt());
            System.out.println("확진자 수 : " + coronaList.get(i).getDecideCnt());
            System.out.println("감염현황 고유 값 : " + coronaList.get(i).getSeq());
            System.out.println("기준일 : " + coronaList.get(i).getStateDt());
            System.out.println("기준 시간 : " + coronaList.get(i).getStateTime());
            System.out.println("수정 시각 : " + coronaList.get(i).getUpdateDt());
        }
    }
}