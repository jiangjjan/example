CREATE TABLE if not exists t_student
(
  id BIGINT(20) NOT NULL COMMENT '主键ID',
  name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
  sex BOOLEAN NULL DEFAULT NULL COMMENT '性别',
  registerdate DATE NULL DEFAULT NULL COMMENT '注册的日期',
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;