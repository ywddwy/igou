package cn.itsource.util.util;

public class AjaxResult {
    private boolean success = true;
    private String msg;
    private Integer errorcode;

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AjaxResult() {
    }

    public AjaxResult(String msg) {
        this.msg = msg;
    }

    public AjaxResult(String msg, Integer errorcode) {
        this.success = false;
        this.msg = msg;
        this.errorcode = errorcode;
    }
}
