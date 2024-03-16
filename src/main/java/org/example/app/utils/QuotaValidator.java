package org.example.app.utils;

public class QuotaValidator {
    private final static String QUOTA_RGX = "[0-9]+";

    public static boolean isQuotaValid(String quota) {
        return quota.isEmpty() || !quota.matches(QUOTA_RGX);
    }
}
