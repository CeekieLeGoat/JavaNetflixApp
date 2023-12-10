/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netflixjava;


import java.util.HashMap;
import java.util.Map;

public class Request {
    private String requestType;
    private String userToken;
    private Map<String, String> parameters;

    // Constructor
    public Request(String requestType, String userToken, Map<String, String> parameters) {
        this.requestType = requestType;
        this.userToken = userToken;
        this.parameters = parameters;
    }

    // Getters and setters
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Request{" +
                "requestType='" + requestType + '\'' +
                ", userToken='" + userToken + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
