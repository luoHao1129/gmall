package com.zg.gmall.user.service;

import com.zg.gmall.user.bean.UmsMember;
import com.zg.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {


    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
