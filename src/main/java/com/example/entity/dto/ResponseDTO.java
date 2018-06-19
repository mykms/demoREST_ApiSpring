package com.example.entity.dto;

import java.io.Serializable;

public class ResponseDTO<T> implements Serializable {
    private T data;
    private ErrorDTO error = new ErrorDTO();
    private SystemDTO system = new SystemDTO();

    public ResponseDTO() {
    }

    public ResponseDTO(T data) {
        this.data = data;
    }

    public ResponseDTO(T data, ErrorDTO error) {
        this.data = data;
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ErrorDTO getError() {
        return error;
    }

    public void setError(ErrorDTO error) {
        this.error = error;
    }

    public SystemDTO getSystem() {
        return system;
    }
}
