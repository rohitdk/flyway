CREATE TABLE EMPLOYEE_REGISTRATION (
  employeeId bigint(20) NOT NULL AUTO_INCREMENT,
  employeeName varchar(100) NOT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (employeeId),
  UNIQUE KEY UK_employeeName (employeeName)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;