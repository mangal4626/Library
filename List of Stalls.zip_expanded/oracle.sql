begin
   execute immediate 'drop table stall';
exception
   when others then null;
end;
/
begin
   execute immediate 'drop table exhibition';
exception
   when others then null;
end;
/

DROP SEQUENCE exhibition_seq;
DROP SEQUENCE stall_seq;

CREATE  TABLE exhibition(
id NUMBER(19) NOT NULL,
name VARCHAR2(45) NOT NULL,
PRIMARY KEY(id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE exhibition_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER exhibition_seq_tr
 BEFORE INSERT ON exhibition FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT exhibition_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO exhibition (name) VALUES ('Exhi 1');
INSERT INTO exhibition (name) VALUES ('Exhi 2');

CREATE TABLE stall(
id NUMBER(19) NOT NULL,
name VARCHAR2(255) NOT NULL,
detail VARCHAR2(255) NOT NULL,
owner VARCHAR2(255) NOT NULL,
exhibition_id NUMBER(19) NOT NULL,
foreign key(exhibition_id) references exhibition(id),
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE stall_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER stall_seq_tr
 BEFORE INSERT ON stall FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT stall_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO stall (name, detail, owner, exhibition_id) VALUES ('Chocolate stall', 'chocolate shop', 'John', '1');
INSERT INTO stall (name, detail, owner, exhibition_id) VALUES ('AMP bakes', 'bakery', 'Peter', '2');
