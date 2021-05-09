insert into real_estate.voivodeship(name) values ('dolnośląskie'), ('kujawsko-pomorskie'), ('lubelskie'), ('lubuskie'),('łódzkie'),('małopolskie'),('mazowieckie'),('opolskie'),('podkarpackie'),('podlaskie'),('pomorskie'),('śląskie'),('świętokrzyskie'),('warmińsko-mazurskie'),('wielkopolskie'),('zachodniopomorskie');
insert into real_estate.city(name) values ('Wrocław'),('Bydgoszcz'),('Lublin'),('Gorzów Wielkopolski'),('Łódź'),('Kraków'),('Warszawa'),('Opole'),('Rzeszów'),('Białystok'),('Gdańsk'),('Katowice'),('Kielce'),('Olsztyn'),('Poznań'),('Szczecin');
insert into real_estate.district(name) values ('Śródmieście'),('Krowodrza'),('Podgórze'),('Nowa Huta'),('Praga');
insert into real_estate.transaction(name) values ('sprzedaż'),('najem');
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (280000,'Bajeczna',50,1,'Mieszkanie położone na Dąbiu, przy ul. Bajecznej',LOAD_FILE('../baj1.jpg'),'brak','brak',1,1,6,6,1,1);
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (630000,'Kuźnicy Kołłątajowskiej',90,2,'Mieszkanie położone na Górce Narodowej',LOAD_FILE('../kuz1.jpg'),'brak','jest',4,4,6,6,2,1);
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (579000,'Aleksandry',70,2,'Mieszkanie położone w Bieżanowie',LOAD_FILE('//home/janusz/Pobrane/RealEstate/src/main/webapp/WEB-INF/photos/alek1.jpg'),'jest','brak',3,8,6,6,3,1);
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (469000,'os. Bohaterów Września',54,1,'Mieszkanie położone w Mistrzejowicach',LOAD_FILE('../boh1.jpg'),'brak','brak',3,3,6,6,4,1);
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (1200,'Rzeźnicza',26,1,'Mieszkanie do wynajęcia na Grzegórzkach, przy ul. Rzeźniczej',LOAD_FILE('../rzez1.jpg'),'jest','brak',5,1,6,6,1,2);
insert into real_estate.apartments(price,street,area, bathrooms, description, image, lift, parking, rooms, storey,voivodeship_id, city_id,district_id, transaction_id) values (400000,'Brechta',45,1,'Mieszkanie położone w Warszawie na Pradze',LOAD_FILE('../war1.jpg'),'brak','jest',3,1,7,7,5,1);
insert into users(username, password, enabled, email) values ('admin','$2a$12$JOg9QO7ZOwxjjoU2XzxiZuuKYi0K7asptCQ.ITNFOGmBWFsY9/y7K',true,'admin@abc.pl'), ('user','$2a$12$t2QhTTeMH61bkgtgJZMqQuTf89tCl4fe9pjNa5Ex2ZxxUt8l.pan6 ',false,'user@abc.pl');;
insert into authorities(authority) values ('ADMIN'),('USER');
insert into users_authorities(user_id,authorities_id) values (1,2),(2,1),(2,2);
select *from real_estate.voivodeship;
select *from real_estate.city;
select *from real_estate.district;
SELECT *FROM real_estate.apartments;
select *from real_estate.transaction;