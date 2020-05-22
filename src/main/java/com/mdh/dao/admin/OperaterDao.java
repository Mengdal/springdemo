package com.mdh.dao.admin;

import com.mdh.entity.admin.OperatorLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author mdh
 * @date 2020/5/22 14:58
 */

/**
 * 后台操作日志类数据库操作层
 */
@Repository
public interface OperaterDao extends JpaRepository<OperatorLog,Long> {
    @Query("select ol from OperatorLog  ol where id=:id")
    OperatorLog find(Long id);
}
