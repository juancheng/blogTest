package cn.hanyingming.blog.exception;

import cn.hanyingming.blog.dto.base.BaseResult;
import cn.hanyingming.blog.dto.base.ErrorEntity;

/**
 * 自定义异常处理类
 */
public class ProjectException extends Exception {

    private ErrorEntity errorEntity;
    private BaseResult baseResult;

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public BaseResult getBaseResult() {
        return baseResult;
    }

    public void setBaseResult(BaseResult baseResult) {
        this.baseResult = baseResult;
    }
}
