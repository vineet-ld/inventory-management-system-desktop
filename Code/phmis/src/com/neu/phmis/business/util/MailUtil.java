/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.util;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.config.EmailConfig;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class MailUtil {

    private String recipientEmailID;
    private String emailBody;
    private String emailSubject;
    private String alternateEmail;
    private String attachment;
    private static final String[] mailSettings = getMailSettings();

    public MailUtil(String recipientEmailID) {

        this.recipientEmailID = recipientEmailID;
        emailBody = "";
        emailSubject = "";
        alternateEmail = "";
        attachment = null;

    }

    public String getRecipientEmailID() {
        return recipientEmailID;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public void sendEmail() {

        try {

            String[] mailSettings = getMailSettings();

            if (mailSettings != null) {
                Thread sendMailThread = new ThreadImpl(this);
                sendMailThread.start();
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

//    public void sendForgotPasswordMail(UserBean userBean, MessageResources msgs) {
//        StringBuffer mailText = new StringBuffer();
//        String[] mailSettings = getMailSettings(msgs);
//        if (mailSettings != null) {
//            if (!mailSettings[0].equals("")) {
//
//                mailText.append("Please click the below link to reset your password:\n");
//                mailText.append(msgs.getMessage("url.omegakart.admin")).append("account/changePassword/").append(userBean.getUniqueCode());
//                final String attachment = null;
//                final String[] mailSettingArray = mailSettings;
//                final String mailSubject = "Reset Password (DO NOT REPLY)";
//                final String mailBody = mailText.toString();
//                final String alternateMailId = "";
//
//                Thread sendMailThread = new ThreadImpl(userBean, mailSettingArray, attachment, alternateMailId, mailSubject, mailBody);
//                sendMailThread.start();
//            }
//        }
//    }

    public static String[] getMailSettings() {
        String[] mailSetting = null;
        ArrayList settings = new ArrayList(10);

        try {

            settings.add(Constants.EMAIL_HOST);
            settings.add(Constants.EMAIL_USER);
            settings.add(Constants.EMAIL_PASSWORD);
            settings.add(Constants.EMAIL_AUTHENTICATION);
            settings.add(Constants.EMAIL_PORT);
            settings.add(Constants.EMAIL_SENDER);
            settings.add(Constants.EMAIL_SENDEREMAIL);
            settings.add(Constants.EMAIL_ORG);

            mailSetting = (String[]) settings.toArray(new String[0]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mailSetting;
    }

    private static class ThreadImpl extends Thread {

        private final String[] mailSettingArray;
        private final String attachment;
        private final String newMailId;
        private final String mailSubject;
        private final String mailBody;

        public ThreadImpl(MailUtil mailUtil) {
            this.mailSettingArray = mailSettings;
            this.attachment = mailUtil.getAttachment();
            this.newMailId = mailUtil.getRecipientEmailID();
            this.mailSubject = mailUtil.getEmailSubject();
            this.mailBody = mailUtil.getEmailBody();
        }

        @Override
        public void run() {
            try {
                EmailConfig emailConfig = new EmailConfig("text/plain; charset=UTF-8");
                //logger.info(newMailId + "   " + mailBody + "   " + mailSettingArray + "   " + mailSubject + "   " + mailSettingArray[5] + "<" + mailSettingArray[6] + ">" + "   " + attachment);
                emailConfig.postMail(newMailId, mailBody, mailSettingArray, mailSubject, mailSettingArray[5] + "<" + mailSettingArray[6] + ">", attachment);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
