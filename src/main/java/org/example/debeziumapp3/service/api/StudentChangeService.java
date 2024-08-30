package org.example.debeziumapp3.service.api;

public interface StudentChangeService {

    int getAmountStudentByNative(String sql);

    void executeChange(String sql);
}
