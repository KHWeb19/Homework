package com.example.demo.service.jpa.order58;

import com.example.demo.controller.jpa.order58th.request.MemberRequest;
import com.example.demo.entity.order40.Member;

public interface JpaMemberService {
    public void register (MemberRequest memberRequest);
    public MemberRequest login (MemberRequest memberRequest);
}
