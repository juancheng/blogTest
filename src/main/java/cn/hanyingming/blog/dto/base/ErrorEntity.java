package cn.hanyingming.blog.dto.base;

public class ErrorEntity {

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorEntity{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
