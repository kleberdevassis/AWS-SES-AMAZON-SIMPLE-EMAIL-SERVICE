package com.AWSEmailService.AWSEmailService.infra.ses;

import com.AWSEmailService.AWSEmailService.core.exceptions.EmailServiceException;
import com.AWSEmailService.AWSEmailService.adapters.EmailSenderGateway;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest().withSource("kleberdevassis@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message().withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body))));

        try {
           amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonSimpleEmailServiceException exception){
          throw new EmailServiceException("failure while sending email",exception);

        }

    }
}
