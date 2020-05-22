package com.mdh.controller.admin;

/**
 * @author mdh
 * @date 2020/5/21 10:51
 */

import com.mdh.config.admin.SiteConfig;
import com.mdh.dao.admin.OperaterDao;
import com.mdh.entity.admin.OperatorLog;
import com.mdh.service.admin.OperaterLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 *
 * 系统控制器
 */
@Controller
@RequestMapping("/system")
public class SystemController {
//    @RequestMapping(value = "/login")
//    public String index(@Value("${spring.datasource.url}") String name, Model model){
//        model.addAttribute("name",name);
//        return "index";
//    }

    @Autowired
    private SiteConfig siteConfig;

    @Autowired
    private OperaterLogService operaterLogService;

    private Logger logger=LoggerFactory.getLogger(SystemController.class);

    @RequestMapping(value = "/login")
    public String index(String name, Model model){
        model.addAttribute("name",siteConfig.getSiteName());
        model.addAttribute("url",siteConfig.getSiteUrl());
        OperatorLog operatorLog =new OperatorLog();
        operatorLog.setOperator("mdh");
        operatorLog.setContent("学校名称：aftvc");
        model.addAttribute("operator", operatorLog);
        model.addAttribute("date",new Date());
        String html="<div>这是一个div</div>";
        model.addAttribute("html",html);
        List<OperatorLog> operatorLogs =new ArrayList<OperatorLog>();
        OperatorLog ol=new OperatorLog();
        ol.setOperator("mdh");
        ol.setContent("学校名称：aftvc");
        operatorLogs.add(ol);
        OperatorLog ol2=new OperatorLog();
        ol2.setOperator("mdh");
        ol2.setContent("学校名称：aftvc");
        operatorLogs.add(ol2);
        model.addAttribute("ols", operatorLogs);
        Map<String,String> map=new HashMap<>();
        map.put("name","mdh");
        map.put("age","18");
        model.addAttribute("map",map);
        Integer age=18;
        model.addAttribute("age",age);
//        logger.info("siteName"+siteConfig.getSiteName());
//        logger.info("siteUrl="+siteConfig.getSiteUrl());
        //数据库操作
        operatorLog.setCreateTime((new Date()));
        operatorLog.setUpdateTime(new Date());
        operatorLog.setId(1);
        operatorLog.setOperator("mmddhh");
//        ol.setCreateTime((new Date()));
//        ol.setUpdateTime(new Date());
//        operaterLogService.save(ol);
        operaterLogService.save(operatorLog);

        return "index";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public boolean index(Long id){
//        OperatorLog findById =operaterLogService.findById(id);
//        if(findById!=null){
//            OperatorLog operatorLog=new OperatorLog();
//            operatorLog.setOperator(findById.getOperator());
//            operatorLog.setContent(findById.getContent());
//            operatorLog.setCreateTime(findById.getCreateTime());
//            operatorLog.setId(findById.getId());
//            return operatorLog;
//        }
//        operaterLogService.delete(id);
        OperatorLog operatorLog=new OperatorLog();
        operatorLog.setOperator("mmm");
        operatorLog.setContent("aftvc");
        operatorLog.setId(id);
        operatorLog.setCreateTime(operaterLogService.findById(id).getCreateTime());
        operaterLogService.save(operatorLog);
        return true;
    }

}
