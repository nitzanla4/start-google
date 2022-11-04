package week3.wednsday.Http;

import java.io.IOException;

public class HttpClient {

    public static void main(String[] args){
        // get
        String getUrl= "https://reqres.in/api/users";
        Response getRes = HttpFacade.get(getUrl);
        System.out.println(getRes);

        // post
        String postUrl = "https://reqres.in/api/users";
        Response postRes = HttpFacade.post(postUrl, "Nitzan", "Lahav");
        System.out.println(postRes);

        // put
        String putUrl = "https://reqres.in/api/users";
        Response putRes = HttpFacade.put(putUrl, "Nitzan", "LALA");
        System.out.println(putRes);

        // patch
        String patchUrl = "https://reqres.in/api/users";
        Response patchRes = HttpFacade.patch(patchUrl, "nizan", "lalalallalal");
        System.out.println(patchRes);

        // delete
        String deleteUrl = "https://reqres.in/api/users";
        Response deleteRes = HttpFacade.delete(deleteUrl);
        System.out.println(deleteRes);

    }
}
