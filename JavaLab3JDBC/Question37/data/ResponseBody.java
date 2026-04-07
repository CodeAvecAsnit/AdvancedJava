package JavaLab3JDBC.Question37.data;

public class ResponseBody {

    private int statusCode;
    private Object object;
    private String message;

    public ResponseBody() {
    }

    public ResponseBody(int statusCode, Object object, String message) {
        this.statusCode = statusCode;
        this.object = object;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
