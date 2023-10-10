package com.AWSEmailService.AWSEmailService.core;

public record EmailRequest(String to, String subject, String body) {
}
