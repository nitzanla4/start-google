package week3.wednsday.Http;

public class Response {
    private int status;
    private String body;

    public Response(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public Response(int status) {
        this.status = status;
        this.body=null;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", body='" + body + '\'' +
                '}';
    }
}
