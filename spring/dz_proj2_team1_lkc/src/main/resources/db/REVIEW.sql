CREATE TABLE REVIEW( -- 리뷰 테이블
    REVIEW_NO       	NUMBER  	NOT NULL	PRIMARY KEY,	-- 리뷰 고유번호 (100번부터 시작 1씩 증가)
    REVIEW_CONTENT  	VARCHAR2(512)	NOT NULL,			-- 리뷰 내용
    REVIEW_RESTAURANT     NUMBER		NOT NULL,			-- 리뷰할 식당 FK ( RESTAURANT 테이블의 PK 참조 )
    REVIEW_WRITER   	NUMBER						-- 작성자	 FK ( MEMBER 테이블의 PK 참조 )
    REVIEW_STAR     	NUMBER		NOT NULL,			-- 별점
    REVIEW_REGDATE  	DATE		NOT NULL,			-- 작성일

    CONSTRAINT 
    FK_REVIEW_R FOREIGN KEY(REVIEW_RESTAURANT) REFERENCES RESTAURANT(RESTAURANT_NO) ON DELETE CASCADE,
    CONSTRAINT
    FK_REVIEW_M FOREIGN KEY(REVIEW_WRITER) REFERENCES MEMBER(MEMBER_NO) ON DELETE CASCADE
);

CREATE SEQUENCE REVIEW_SEQ START WITH 100 INCREMENT BY 1 NOCYCLE;
SELECT*FROM REVIEW;