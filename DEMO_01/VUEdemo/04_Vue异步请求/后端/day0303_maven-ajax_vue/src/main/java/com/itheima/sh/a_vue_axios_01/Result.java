package com.itheima.sh.a_vue_axios_01;

public class Result {
    private boolean flag;//执行结果，true为执行成功 false为执行失败
    private String message;//返回结果信息
    private Object valueData;//返回数据(如果是查询操作则设置,如果是增删改则不设置)

    public Result() {
    }
    //失败,或者增删改
    public Result(boolean flag, String message){
        this.flag = flag;
        this.message = message;
    }
    //成功的查询
    public Result(boolean flag, String message, Object valueData) {
        this.flag = flag;
        this.message = message;
        this.valueData = valueData;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValueData() {
        return valueData;
    }

    public void setValueData(Object valueData) {
        this.valueData = valueData;
    }
}
