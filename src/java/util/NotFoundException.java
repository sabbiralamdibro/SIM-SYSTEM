/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author SAM
 */
public class NotFoundException extends RuntimeException {
private static final long serialVersionUID = -6513666078709813858L;
    private String exceptionMessage;

    public NotFoundException(String exceptionMessage) {
        super();
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
