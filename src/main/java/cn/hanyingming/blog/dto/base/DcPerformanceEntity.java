package cn.hanyingming.blog.dto.base;

public class DcPerformanceEntity {
    private String interfaceName;
    private String requestParam;
    private String consumeTime;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    @Override
    public String toString() {
        return "DcPerformanceEntity{" +
                "interfaceName='" + interfaceName + '\'' +
                ", requestParam='" + requestParam + '\'' +
                ", consumeTime='" + consumeTime + '\'' +
                '}';
    }
}
