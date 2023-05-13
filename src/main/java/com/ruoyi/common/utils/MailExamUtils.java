package com.ruoyi.common.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

/**
 * @packageName: com.ruoyi.common.utils
 * @className: MainUtils
 * @author: yanyuhui y568821795@outlook.com
 * @date: 2023/5/12 23:56
 * @description: 发送邮件
 */
public class MailExamUtils {


    public static void sendMessage(String emailAddress, String examName, String date) {
        // 发件人地址
        String userEmail = "568821795@qq.com";
        // SMTP服务器地址
        String smtpHost = "smtp.qq.com";
        MailAccount mailAccount = new MailAccount();
        mailAccount.setUser(userEmail);
        mailAccount.setPass("yxambyvkmsdrbedf");
        mailAccount.setHost(smtpHost);
        mailAccount.setPort(587);
        mailAccount.setFrom(userEmail);
        MailUtil.send(mailAccount, CollUtil.newArrayList(emailAddress), "报考成功提醒", StrUtil.format("您的考试科目为：[{}] 申请已被确认，将于 [{}]开考,请您及时参加！", examName, date), false);
    }

    public static void main(String[] args) {
        sendMessage("y568821795@outlook.com", "数学", DateUtil.date().toString());
    }
}
