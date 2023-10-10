package com.AWSEmailService.AWSEmailService.core;

public interface EmailSenderUserCase {

     void sendEmail(String to, String subject, String body);
}
