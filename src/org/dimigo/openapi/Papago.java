package org.dimigo.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

// 네이버 기계번역 (Papago SMT) API 예제
public class Papago {

    private static void parseJson(String json) throws Exception {
        Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
        Map<String, Object> message = (Map<String, Object>) map.get("message");
        Map<String, String> result = (Map<String, String>) message.get("result");
        System.out.println(result.get("translatedText"));
    }
    public static void main(String[] args) {
        String clientId = "VsnHLXHxeVlowQjU5_Dq";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "MLkBmAGMdH";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("이현도 멍청이", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "source=ko&target=en&text=" + text;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            parseJson(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}