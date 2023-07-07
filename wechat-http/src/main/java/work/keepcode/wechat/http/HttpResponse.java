package work.keepcode.wechat.http;

public abstract class HttpResponse<T, E> {
    private int httpStatus;
    private T body;

    private E error;

    protected abstract boolean isSuccess();

    public boolean isFailed() {
        return !isSuccess();
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public E getError() {
        return error;
    }

    public void setError(E error) {
        this.error = error;
    }
}
