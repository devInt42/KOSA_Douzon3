CREATE VIEW  V_ITEMLIST
AS
SELECT I.INO, 	--상품번호
I.INAME, 		--상품명
I.IPRICE, 		--상품가격
C.CNAME, 	--판매자명
I.CHAT 		--채팅방여부
FROM ITEM I, CUSTOMER C WHERE I.SELLER_CNO = C.CNO;