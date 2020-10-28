package cc.mrbird.febs.monitor.controller;

import cc.mrbird.febs.common.entity.FebsConstant;
import cc.mrbird.febs.common.utils.FebsUtil;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MrBird
 */
@Controller("monitorView")
@RequestMapping(FebsConstant.VIEW_PREFIX + "monitor")
@RequiredArgsConstructor
public class ViewController {


    @GetMapping("online")
    @RequiresPermissions("online:view")
    public String online() {
        return FebsUtil.view("monitor/online");
    }

    @GetMapping("log")
    @RequiresPermissions("log:view")
    public String log() {
        return FebsUtil.view("monitor/log");
    }

    @GetMapping("loginlog")
    @RequiresPermissions("loginlog:view")
    public String loginLog() {
        return FebsUtil.view("monitor/loginLog");
    }

    @GetMapping("swagger")
    public String swagger() {
        return FebsUtil.view("monitor/swagger");
    }
}
