package com.youxu.chain;

public class Women implements IWomen {
    /**
     * 1：听父亲的
     * 2：听丈夫的
     * 3：听儿子的
     */
    private int type;
    private String request;

    public Women(int type, String request){
        this.type = type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
