CREATE VIEW  V_ITEMLIST
AS
SELECT I.INO, 	-- ��ǰ��ȣ
I.INAME, 		-- ��ǰ��
I.IPRICE, 		-- ��ǰ����
C.CNAME, 	-- �Ǹ��ڸ�
I.CHAT 		-- ä�ù� ��������
FROM ITEM I, CUSTOMER C WHERE I.SELLER_CNO = C.CNO;