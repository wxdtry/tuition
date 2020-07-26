package com.school.tuition.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.tuition.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import java.io.IOException;

@Component
public class CustomExpiredSessionStrategy implements SessionInformationExpiredStrategy {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent sessionInformationExpiredEvent) throws IOException, ServletException {
        //sessionInformationExpiredEvent.getSessionInformation().getLastRequest()
        RespBean respBean = RespBean.ok("已经另一台机器登录，您被迫下线。");
        String s = objectMapper.writeValueAsString(respBean);
        sessionInformationExpiredEvent.getResponse().setContentType("application/json;charset=UTF-8");
        sessionInformationExpiredEvent.getResponse().getWriter().write(s);
    }
}
