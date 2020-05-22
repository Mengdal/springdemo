package com.mdh.service.admin;

import com.mdh.dao.admin.OperaterDao;
import com.mdh.entity.admin.OperatorLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mdh
 * @date 2020/5/22 15:24
 */
@Service
public class OperaterLogService {
    @Autowired
    private OperaterDao operaterDao;

    /**
     * 添加、修改操作日志
     * @param operatorLog
     * @return
     */
    public OperatorLog save(OperatorLog operatorLog){
        return operaterDao.save(operatorLog);
    }

    /**
     * 根据id查询单条数据
     * @param id
     * @return
     */
    public OperatorLog findById(Long id){
        return operaterDao.find(id);
    }
    /**
     * 返回所有的记录
     */
    public List<OperatorLog> findAll(){
        return operaterDao.findAll();
    }

    /**
     * 根据id删除
     */
    public void delete(Long id){
       operaterDao.deleteById(id);
    }
    /**
     * 删库
     */
    public void deleteAll(){
        operaterDao.deleteAll();
    }
}
