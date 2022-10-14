CREATE VIEW  V_ITEMLIST
AS
SELECT I.INO, 	-- 제품번호
I.INAME, 		-- 제품명
I.IPRICE, 		-- 제품가격
C.CNAME, 	-- 판매자명
I.CHAT 		-- 채팅방 열림여부
FROM ITEM I, CUSTOMER C WHERE I.SELLER_CNO = C.CNO;