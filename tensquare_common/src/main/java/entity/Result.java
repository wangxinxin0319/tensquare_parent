package entity;

import java.io.Serializable;

/**
 * @author wxx
 * @version 1.0
 * @date 2020/5/8 16:59
 */
public class Result<T> implements Serializable {
    private boolean flag;// 是否成功
    private Integer code;// 返回码
    private String message;// 返回信息
    private Object data;// 返回数据


    /**
     * 最正常的状态返回
     * @param flag
     * @param code
     * @param message
     * @param data
     */
    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Result() {
    }


    /**
     * 增删改的构造器
     * @param flag
     * @param code
     * @param message
     */
    public Result(boolean flag, Integer code, String message) {

        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code,  Object data) {

        this.flag = flag;
        this.code = code;
        this.data = data;
    }



    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
