package Conn;

import Entity.GoodEntity;
import Entity.UserEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class ServerConn {

    private final String SERVER_URL = "http://localhost:8096/rest/";


    public UserEntity getUser() {
        try {
            return (mapper().readValue(getResponse("user"), UserEntity.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<GoodEntity> getGoods() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("goods"), GoodEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public void updateUser(UserEntity user) {
        doPost("user/update", user);
    }

    private ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return mapper;
    }

    private String getResponse(String path) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = SERVER_URL + path;
        ResponseEntity resp = restTemplate.exchange(url, HttpMethod.GET, request(path), String.class);
        return resp.getBody().toString();
    }

    private void doPost(String path, Object object) {
        String url = SERVER_URL + path;
        try {
            new RestTemplate().exchange(url, HttpMethod.POST, request(object), object.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private HttpEntity<String> request() throws IOException {
        return request(null);
    }


    private HttpEntity request(Object payload) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", ServerAuthentication.getLoginPass());
        return new HttpEntity(payload, headers);
    }
}
