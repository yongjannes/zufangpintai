package com.zufang.lease.web.app.controller.leasaterm;

import com.zufang.lease.common.login.LoginUserHolder;
import com.zufang.lease.common.result.Result;
import com.zufang.lease.model.entity.LeaseTerm;
import com.zufang.lease.web.app.service.LeaseAgreementService;
import com.zufang.lease.web.app.vo.agreement.AgreementItemVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app/term/")
@Tag(name = "租期信息")
public class LeaseTermController {

    @Autowired
    private LeaseAgreementService service;

    @GetMapping("listByRoomId")
    @Operation(summary = "根据房间id获取可选获取租期列表")
    public Result<List<LeaseTerm>> list(@RequestParam Long id) {
        List<LeaseTerm> list = service.listByRoomId(id);
        return Result.ok(list);
    }
}
