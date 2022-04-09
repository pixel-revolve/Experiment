package com.dyh.model;

/**
 * 结果状态
 *
 * @author pixel-revolve
 * @date 2022/04/07
 */
public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS(200, "Operation success"),

    /**
     * runtimeerror
     */
    RUNTIMEERROR(500, "Runtime error"),

    /**
     * parametererror
     */
    PARAMETERERROR(400, "Parameter error"),

    /**
     * notfound
     */
    NOTFOUND(404, "Not found"),

    /**
     * authorizationerror
     */
    AUTHORIZATIONERROR(401, "Authorization error"),

    /**
     * 未经授权
     */
    UNAUTHORIZED(403, "Unauthorized"),

    /**
     * notsupported
     */
    NOTSUPPORTED(405, "Not supported"),

    /**
     * tokenexpired
     */
    TOKENEXPIRED(406, "Token expired"),

    /**
     * tokenerror
     */
    TOKENERROR(407, "Token error"),

    /**
     * tokeninvalid
     */
    TOKENINVALID(408, "Token invalid"),

    /**
     * tokenrequired
     */
    TOKENREQUIRED(409, "Token required"),

    /**
     * tokenunknown
     */
    TOKENUNKNOWN(410, "Token unknown"),

    /**
     * tokenunsupported
     */
    TOKENUNSUPPORTED(411, "Token unsupported"),

    /**
     * tokenunverified
     */
    TOKENUNVERIFIED(412, "Token unverified"),

    /**
     * tokenverified
     */
    TOKENVERIFIED(413, "Token verified"),

    /**
     * tokenverifying
     */
    TOKENVERIFYING(414, "Token verifying"),

    /**
     * tokenverifyfail
     */
    TOKENVERIFYFAIL(415, "Token verify fail"),

    /**
     * tokenverifysuccess
     */
    TOKENVERIFYSUCCESS(416, "Token verify success"),

    /**
     * tokenverifytimeout
     */
    TOKENVERIFYTIMEOUT(417, "Token verify timeout"),

    /**
     * tokenverifyunknown
     */
    TOKENVERIFYUNKNOWN(418, "Token verify unknown"),

    /**
     * tokenverifyunsupported
     */
    TOKENVERIFYUNSUPPORTED(419, "Token verify unsupported"),

    /**
     * tokenverifyunverified
     */
    TOKENVERIFYUNVERIFIED(420, "Token verify unverified"),

    /**
     * tokenverifyverified
     */
    TOKENVERIFYVERIFIED(421, "Token verify verified"),

    /**
     * tokenverifyverifying
     */
    TOKENVERIFYVERIFYING(422, "Token verify verifying"),

    /**
     * tokenverifyverifyfail
     */
    TOKENVERIFYVERIFYFAIL(423, "Token verify verify fail"),

    /**
     * tokenverifyverifysuccess
     */
    TOKENVERIFYVERIFYSUCCESS(424, "Token verify verify success"),

    /**
     * tokenverifyverifytimeout
     */
    TOKENVERIFYVERIFYTIMEOUT(425, "Token verify verify timeout"),

    /**
     * tokenverifyverifyunknown
     */
    TOKENVERIFYVERIFYUNKNOWN(426, "Token verify verify unknown"),

    /**
     * tokenverifyverifyunsupported
     */
    TOKENVERIFYVERIFYUNSUPPORTED(427, "Token verify verify unsupported");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}

