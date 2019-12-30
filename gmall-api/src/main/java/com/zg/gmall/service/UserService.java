package com.zg.gmall.service;



import com.zg.gmall.bean.UmsMember;
import com.zg.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {


    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
