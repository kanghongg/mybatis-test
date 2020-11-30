create table `students`
(
    `id`   int(5) not null,
    `name` varchar(10)  default null,
    `sal`  double(8, 2) default null,
    primary key (`id`)
) engine = InnoDB
  default charset = utf8;
INSERT INTO `students`(`id`, `name`, `sal`) VALUES (10, 'test', 100.00);