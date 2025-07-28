package com.zufang.lease.web.app.service.impl;

import com.zufang.lease.model.entity.LeaseAgreement;
import com.zufang.lease.model.entity.LeaseTerm;
import com.zufang.lease.web.app.mapper.LeaseAgreementMapper;
import com.zufang.lease.web.app.mapper.LeaseTermMapper;
import com.zufang.lease.web.app.service.LeaseAgreementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liubo
 * @description 针对表【lease_agreement(租约信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement>
        implements LeaseAgreementService {

    @Autowired
    private LeaseTermMapper leaseTermMapper;

    @Override
    public List<LeaseTerm> listByRoomId(Long id) {
        return leaseTermMapper.selectListByRoomId(id);
    }
}




