package week3.wednsday.Http;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class HttpFacade {
    static CloseableHttpClient client = HttpClients.createDefault();


    public static Response get(String url) {
        HttpGet httpget = new HttpGet(url);
        System.out.println(httpget.getMethod());

        try ( CloseableHttpResponse response = client.execute(httpget)) {
            HttpEntity entity = response.getEntity();
            return new Response(response.getCode(), EntityUtils.toString(entity));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //POST
    public static Response post(String uri, String firstName, String lastName) {
        HttpPost httpPost = new HttpPost(uri);
        System.out.println(httpPost.getMethod());

        Gson gson = new Gson();
        String json = gson.toJson(new Body(firstName, lastName));
        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        try ( CloseableHttpResponse response = client.execute(httpPost)) {
            HttpEntity entity1 = response.getEntity();
            return new Response(response.getCode(), EntityUtils.toString(entity1));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }


    //PUT
    public static Response put(String uri, String firstName, String lastName) {
        HttpPut httpPut = new HttpPut(uri);
        System.out.println(httpPut.getMethod());

        Gson gson = new Gson();
        String json = gson.toJson(new Body(firstName, lastName));
        StringEntity entity = new StringEntity(json);
        httpPut.setEntity(entity);
        httpPut.setHeader("Accept", "application/json");
        httpPut.setHeader("Content-type", "application/json");

        try ( CloseableHttpResponse response = client.execute(httpPut)) {
            HttpEntity entity1 = response.getEntity();
            return new Response(response.getCode(), EntityUtils.toString(entity1));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //DELETE
    public static Response delete(String url) {
        HttpDelete httpDelete = new HttpDelete(url);
        System.out.println(httpDelete.getMethod());

        try ( CloseableHttpResponse response = client.execute(httpDelete)) {
            return new Response(response.getCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //PATCH
    public static Response patch(String url, String firstName, String lastName) {
        HttpPatch httpPatch = new HttpPatch(url);
        System.out.println(httpPatch.getMethod());

        Gson gson = new Gson();
        String json = gson.toJson(new Body(firstName, lastName));
        StringEntity entity = new StringEntity(json);
        httpPatch.setEntity(entity);
        httpPatch.setHeader("Accept", "application/json");
        httpPatch.setHeader("Content-type", "application/json");

        try ( CloseableHttpResponse response = client.execute(httpPatch)) {
            HttpEntity entity1 = response.getEntity();
            return new Response(response.getCode(), EntityUtils.toString(entity1));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
