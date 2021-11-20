package com.budgetbuddy.enterprise.dto;

import lombok.Data;

public @Data
class user {
    private int userId;
    private String fullName;
    private String email;
    private int age;
    private String bank;
    private String job;
    private double weeklyIncome;
    private double spendingLimit;
}
