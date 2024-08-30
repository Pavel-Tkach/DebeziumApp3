package org.example.debeziumapp3.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.debeziumapp3.repository.ChangeNativeRepository;
import org.example.debeziumapp3.service.api.StudentChangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentChangeServiceImpl implements StudentChangeService {

    private final ChangeNativeRepository changeNativeRepository;

    @Override
    public int getAmountStudentByNative(String sql) {
        return changeNativeRepository.getAmountStudentByNative(sql);
    }

    @Transactional
    @Override
    public void executeChange(String sql) {
        changeNativeRepository.executeNativeSql(sql);
    }
}
