alter table user modify id bigint auto_increment;
alter table question modify id bigint auto_increment;
alter table question modify creator bigint null;
alter table comment modify commentator bigint not null comment '评论人ID';
