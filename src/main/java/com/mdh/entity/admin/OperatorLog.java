package com.mdh.entity.admin;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;

/**
 * @author mdh
 * @date 2020/5/21 20:05
 */

/**
 * 后台操作日志记录表
 */
@Entity
@Table(name = "ylrc_operater_log")
@EntityListeners(AuditingEntityListener.class)
public class OperatorLog extends BaseEntity{



    @Column(name = "operator",nullable = false,length = 18)
    private String operator;//操作者

    @Column(name = "content",nullable = false,length = 128)
    private String content;//操作内容

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
