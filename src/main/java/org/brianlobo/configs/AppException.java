package org.brianlobo.configs;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class AppException extends Exception {

    private Enum<?> code;
    private String msg;
    private Exception exception;

    public AppException(Enum<?> code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HashMap<String, Object> toResponse() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("code", this.code);
        result.put("msg", this.msg);

        if (this.exception != null) {
            result.put("exception", this.exception.getCause());
        }

        return result;
    }
}
