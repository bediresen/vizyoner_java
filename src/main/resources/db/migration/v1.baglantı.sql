CREATE TABLE BAGLANTI {

baglanti_id int,
kullanic_id1 int,
kullanici_id2 int,
baglanti_tarihi DATE,

PRIMARY KEY (baglanti_id)
FOREIGN KEY (kullanic_id1) REFERENCES KULLANICI(kullanici_id)
FOREIGN KEY (kullanic_id2) REFERENCES KULLANICI(kullanici_id)
}