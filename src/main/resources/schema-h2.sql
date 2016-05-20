insert into jpa_board (name, create_at) values ('notice', now());
insert into jpa_board (name, create_at) values ('random', now());

CREATE TABLE cnu_post (
  post_id int(10) NOT NULL AUTO_INCREMENT,
  author varchar(32) NOT NULL,
  password varchar(128) NOT NULL,
  title varchar(255) NOT NULL,
  content text NOT NULL,
  view_count int(10) NOT NULL DEFAULT 0,
  create_time datetime NOT NULL,
  file_path varchar(255) DEFAULT NULL,
  file_name varchar(255) DEFAuLT NULL,
  is_del tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (post_id)
) DEFAULT CHARSET=utf8;;

insert into cnu_post (author, password, title, content, create_time) values ('Robin', '1234', '테스트 제목', '테스트 내용', NOW());
insert into cnu_post (author, password, title, content, create_time) values ('Sam', '1234', 'Sample Title2', 'Sample content2', NOW());

CREATE TABLE cnu_post_comment (
  comment_id int(10) NOT NULL AUTO_INCREMENT,
  post_id int(10) NOT NULL,
  author varchar(128) NOT NULL,
  password varchar(32) NOT NULL,
  comment text NOT NULL,
  create_time datetime NOT NULL,
  is_del tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (comment_id)
) DEFAULT CHARSET=utf8;;

insert into cnu_post_comment (post_id, author, password, comment, create_time) values (1, 'Robin', '1234', '코멘트 내용', NOW());
insert into cnu_post_comment (post_id, author, password, comment, create_time) values (1, 'Albert', '1234', '덧글이 이게 뭐냐?', NOW());

