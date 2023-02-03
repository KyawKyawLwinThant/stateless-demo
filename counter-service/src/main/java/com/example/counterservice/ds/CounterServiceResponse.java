package com.example.counterservice.ds;

public class CounterServiceResponse {
    private int number;

    public CounterServiceResponse(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "CounterServiceResponse{" +
                "number=" + number +
                '}';
    }
}
