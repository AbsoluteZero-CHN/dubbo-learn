package cn.noload.api.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-12-11 11:47
 */
@Data
public class DataResult<T> implements Serializable {
    /**
     * 响应码
     * */
    private Integer code;
    /**
     * 响应信息
     * */
    private String message;
    /**
     * 响应数据
     * */
    private T data;


    public DataResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    /**
     * 成功响应数据
     * */
    public static DataResult success(Object data) {
        DataResult dataResult = new DataResult(200, null);
        dataResult.data = data;
        return dataResult;
    }
}
